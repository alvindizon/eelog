package com.alvindizon.eelog.ui.screens.users;

import android.util.Log;

import androidx.databinding.ObservableField;
import androidx.lifecycle.MutableLiveData;

import com.alvindizon.eelog.data.network.exception.NoNetworkException;
import com.alvindizon.eelog.data.network.model.Instance;
import com.alvindizon.eelog.data.network.response.login.NetworkStatus;
import com.alvindizon.eelog.data.network.service.UserRepository;
import com.alvindizon.eelog.ui.base.viewmodel.BaseViewModel;

import java.net.SocketTimeoutException;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import retrofit2.HttpException;

public class UsersViewModel extends BaseViewModel {
    private static final String TAG = UsersViewModel.class.getSimpleName();

    private UserRepository userRepository;
    public MutableLiveData<NetworkStatus> listUserStatus = new MutableLiveData<>();
    public ObservableField<String> errorText = new ObservableField<>("");

    private Instance instance;

    public UsersViewModel(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void setInstance(Instance instance) {
        Log.d(TAG, instance.toString());
        this.instance = new Instance();
        this.instance = instance;
    }

    public void onClicked() {
        String instanceName;

        if(instance != null) {
            instanceName = instance.getInstanceName();
        } else {
            errorText.set("Error getting org name, please try again.");
            return;
        }

        compositeDisposable.add(userRepository.getUsers(instanceName)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(listUserResponse -> {
                    Log.d(TAG, listUserResponse);
                    errorText.set("");
                    listUserStatus.setValue(NetworkStatus.SUCCESS);
                }, this::handleError));
    }

    private void handleError(Throwable throwable) {
        if(throwable instanceof NoNetworkException) {
            listUserStatus.setValue(NetworkStatus.NO_CONNECTIVITY);
        } else if(throwable instanceof HttpException) {
            HttpException httpException = (HttpException) throwable;
            String errorMsg = "Error: ";
            String actualError;

            actualError = "Please try again.";

            listUserStatus.setValue(NetworkStatus.API_ERROR);
        } else if(throwable instanceof SocketTimeoutException) {
            listUserStatus.setValue(NetworkStatus.CONNECT_TIMEOUT);
        } else {
            listUserStatus.setValue(NetworkStatus.ERROR);
        }
    }
}
