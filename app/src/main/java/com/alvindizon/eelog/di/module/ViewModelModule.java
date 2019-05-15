package com.alvindizon.eelog.di.module;

import androidx.lifecycle.ViewModel;

import com.alvindizon.eelog.features.main.MainViewModel;
import com.alvindizon.eelog.features.login.LoginViewModel;
import com.alvindizon.eelog.core.viewmodel.ViewModelFactory;
import com.alvindizon.eelog.network.service.SessionRepository;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Map;

import javax.inject.Provider;

import dagger.MapKey;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;

@Module
public class ViewModelModule {

    @Target(ElementType.METHOD)
    @Retention(RetentionPolicy.RUNTIME)
    @MapKey
    @interface ViewModelKey {
        Class<? extends ViewModel> value();
    }

    @Provides
    ViewModelFactory provideViewModelFactory(Map<Class<? extends ViewModel>, Provider<ViewModel>> providerMap) {
        return new ViewModelFactory(providerMap);
    }

    @Provides
    @IntoMap
    @ViewModelKey(MainViewModel.class)
    ViewModel provideMainViewModel() {
        return new MainViewModel();
    }

    @Provides
    @IntoMap
    @ViewModelKey(LoginViewModel.class)
    ViewModel provideLoginViewModel(SessionRepository sessionRepository) {
        return new LoginViewModel(sessionRepository);
    }
}
