package com.alvindizon.eelog.ui.screens.main;

import android.util.Log;

import androidx.annotation.NonNull;

import com.alvindizon.eelog.data.network.model.Instance;
import com.alvindizon.eelog.ui.base.viewmodel.BaseViewModel;

public class MainViewModel extends BaseViewModel {
    private static final String TAG = MainViewModel.class.getSimpleName();

    private Instance currentInstance;

    public MainViewModel() {
    }

    public void saveCurrentInstance(@NonNull Instance instance) {
        currentInstance = new Instance();
        this.currentInstance = instance;
        Log.d(TAG, currentInstance.toString());
    }

    public Instance getCurrentInstance() {
        return currentInstance;
    }

}
