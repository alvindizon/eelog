package com.alvindizon.eelog.core.viewmodel;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ViewModel;

import io.reactivex.disposables.CompositeDisposable;

public abstract class BaseViewModel extends ViewModel {

    protected CompositeDisposable compositeDisposable;

    public BaseViewModel() {
        this.compositeDisposable = new CompositeDisposable();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void clearDisposable() {
        compositeDisposable.clear();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void disposeDisposable() {
        compositeDisposable.dispose();
    }
}
