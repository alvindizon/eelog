package com.alvindizon.eelog;

import android.app.Application;

import com.alvindizon.eelog.di.component.ApplicationComponent;
import com.alvindizon.eelog.di.component.DaggerApplicationComponent;
import com.alvindizon.eelog.di.component.ViewModelComponent;
import com.alvindizon.eelog.di.module.ApplicationModule;
import com.alvindizon.eelog.di.module.ViewModelModule;

public class EelogApp extends Application {
    private ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        applicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }

    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }

    public ViewModelComponent getViewModelComponent() {
        return getApplicationComponent().newViewModelComponent(new ViewModelModule());
    }
}
