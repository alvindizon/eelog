package com.alvindizon.eelog.ui.screens.login;

import android.util.Log;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableField;
import androidx.lifecycle.MutableLiveData;

import com.alvindizon.eelog.data.network.exception.NoNetworkException;
import com.alvindizon.eelog.data.network.model.Instance;
import com.alvindizon.eelog.data.network.response.D;
import com.alvindizon.eelog.data.network.response.LoginResponse;
import com.alvindizon.eelog.data.network.response.NetworkStatus;
import com.alvindizon.eelog.data.network.service.SessionRepository;
import com.alvindizon.eelog.ui.base.viewmodel.BaseViewModel;

import java.net.SocketTimeoutException;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import retrofit2.HttpException;

public class LoginViewModel extends BaseViewModel {
    private static final String TAG = LoginViewModel.class.getSimpleName();

    private final SessionRepository sessionRepository;
    public ObservableField<String> organization = new ObservableField<>("");
    public ObservableField<String> username = new ObservableField<>("");
    public ObservableField<String> password = new ObservableField<>("");
    public ObservableField<String> errorText = new ObservableField<>("");
    public ObservableField<Boolean> progressBarVisible = new ObservableField<>(false);
    public ObservableField<Boolean> buttonVisible = new ObservableField<>(true);
    public MutableLiveData<NetworkStatus> loginStatus = new MutableLiveData<>();

    private Instance instance;

    public LoginViewModel(SessionRepository sessionRepository) {
        this.sessionRepository = sessionRepository;
    }

    public void onClicked() {
        loginStatus.setValue(NetworkStatus.NONE);

        compositeDisposable.add(sessionRepository.sendLoginRequest(
                organization.get(),
                username.get(),
                password.get())
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .doOnSubscribe(n -> {
                    progressBarVisible.set(true);
                    buttonVisible.set(false);
                })
                .subscribe(response -> {
                    progressBarVisible.set(false);
                    buttonVisible.set(true);
                    errorText.set("");
                    transformToInstance(response);
                    loginStatus.setValue(NetworkStatus.SUCCESS);
                }, this::handleError));
    }

    private void transformToInstance(LoginResponse response) {
        instance = new Instance();
        instance.setInstanceId(response.getD().getInstanceId());
        instance.setInstanceName(response.getD().getInstanceName());
        Log.d(TAG, instance.toString());
    }

    @NonNull
    public Instance getInstance() {
        return instance;
    }

    private void handleError(Throwable throwable) {
        progressBarVisible.set(false);
        buttonVisible.set(true);
        throwable.printStackTrace();
        if(throwable instanceof NoNetworkException) {
            errorText.set("No internet connection.");
            loginStatus.setValue(NetworkStatus.NO_CONNECTIVITY);
        } else if(throwable instanceof HttpException) {
            HttpException httpException = (HttpException) throwable;
            String errorMsg = "Error: ";
            String actualError;

            if(httpException.code() == 404) {
                actualError = "Organization not found.";
            } else {
                actualError = "Please try again.";
            }

            errorText.set(errorMsg + actualError);
            loginStatus.setValue(NetworkStatus.API_ERROR);
        } else if(throwable instanceof SocketTimeoutException) {
            errorText.set("Connection timed out.");
            loginStatus.setValue(NetworkStatus.CONNECT_TIMEOUT);
        } else {
            loginStatus.setValue(NetworkStatus.ERROR);
        }

    }
}
