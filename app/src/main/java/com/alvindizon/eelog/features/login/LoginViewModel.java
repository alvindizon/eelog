package com.alvindizon.eelog.features.login;

import android.text.TextUtils;
import android.util.Log;

import androidx.databinding.ObservableField;
import androidx.lifecycle.MutableLiveData;

import com.alvindizon.eelog.core.viewmodel.BaseViewModel;
import com.alvindizon.eelog.network.exception.NoNetworkException;
import com.alvindizon.eelog.network.model.NetworkStatus;
import com.alvindizon.eelog.network.service.SessionRepository;
import com.alvindizon.eelog.utils.StringUtils;

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
                .subscribe(() -> {
                    progressBarVisible.set(false);
                    buttonVisible.set(true);
                    errorText.set("");
                    loginStatus.setValue(NetworkStatus.SUCCESS);
                }, this::handleError));
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
            String actualError = "";
            try {
                String json = httpException.response().errorBody().string();
//                if(!TextUtils.isEmpty(json)){
//                    String errorBody = StringUtils.getJsonValueFromName(json, "error");
//                    actualError = StringUtils.getJsonValueFromName(json, "value");
//                    Log.d(TAG, "actualError: " + actualError);
//                } else {
                    actualError = "Please try again.";
//                }
            } catch (Exception e) {
                Log.d(TAG, "error getting json body");
                e.printStackTrace();
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
