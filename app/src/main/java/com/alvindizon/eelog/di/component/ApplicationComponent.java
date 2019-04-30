package com.alvindizon.eelog.di.component;

import com.alvindizon.eelog.di.module.ApplicationModule;
import com.alvindizon.eelog.di.module.ViewModelModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {
    public ViewModelComponent newViewModelComponent(ViewModelModule viewModelModule);
}
