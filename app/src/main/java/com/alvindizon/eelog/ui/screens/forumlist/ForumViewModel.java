package com.alvindizon.eelog.ui.screens.forumlist;

import android.util.Log;

import androidx.databinding.ObservableField;
import androidx.lifecycle.MutableLiveData;

import com.alvindizon.eelog.data.network.exception.NoNetworkException;
import com.alvindizon.eelog.data.network.model.Forum;
import com.alvindizon.eelog.data.network.model.Instance;
import com.alvindizon.eelog.data.network.response.listforum.ListForumResponse;
import com.alvindizon.eelog.data.network.response.listforum.Result;
import com.alvindizon.eelog.data.network.response.login.NetworkStatus;
import com.alvindizon.eelog.data.network.service.ForumRepository;
import com.alvindizon.eelog.ui.base.viewmodel.BaseViewModel;

import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.List;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import retrofit2.HttpException;

public class ForumViewModel extends BaseViewModel {
    private static final String TAG = ForumViewModel.class.getSimpleName();

    private ForumRepository forumRepository;
    public MutableLiveData<NetworkStatus> listForumStatus = new MutableLiveData<>();
    public ObservableField<String> errorText = new ObservableField<>("");

    private Instance instance;
    private List<Forum> forums;

    public ForumViewModel(ForumRepository forumRepository) {
        this.forumRepository = forumRepository;
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

        compositeDisposable.add(forumRepository.getForums(instanceName)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(listForumResponse -> {
                errorText.set("");
                transformToForumList(listForumResponse);
                listForumStatus.setValue(NetworkStatus.SUCCESS);
            }, this::handleError));
    }

    private void transformToForumList(ListForumResponse listForumResponse) {
        forums = new ArrayList<>();
        for(Result result : listForumResponse.getD().getResults()) {
            Forum forum = new Forum();
            forum.setDescription(result.getDescription());
            forum.setId(result.getId());
            forum.setName(result.getName());
            forum.setUrl(result.getMetadata().getUri());
            Log.d(TAG, forum.toString());
            forums.add(forum);
        }
    }

    private void handleError(Throwable throwable) {
        if(throwable instanceof NoNetworkException) {
            listForumStatus.setValue(NetworkStatus.NO_CONNECTIVITY);
        } else if(throwable instanceof HttpException) {
            HttpException httpException = (HttpException) throwable;
            String errorMsg = "Error: ";
            String actualError;

            actualError = "Please try again.";

            listForumStatus.setValue(NetworkStatus.API_ERROR);
        } else if(throwable instanceof SocketTimeoutException) {
            listForumStatus.setValue(NetworkStatus.CONNECT_TIMEOUT);
        } else {
            listForumStatus.setValue(NetworkStatus.ERROR);
        }
    }
}
