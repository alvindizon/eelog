package com.alvindizon.eelog.di.module;

import androidx.lifecycle.ViewModel;

import com.alvindizon.eelog.data.network.service.ForumRepository;
import com.alvindizon.eelog.data.network.service.UserRepository;
import com.alvindizon.eelog.ui.screens.forumlist.ForumViewModel;
import com.alvindizon.eelog.ui.screens.main.MainViewModel;
import com.alvindizon.eelog.ui.screens.login.LoginViewModel;
import com.alvindizon.eelog.ui.base.viewmodel.ViewModelFactory;
import com.alvindizon.eelog.data.network.service.SessionRepository;
import com.alvindizon.eelog.ui.screens.users.UsersViewModel;

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

    @Provides
    @IntoMap
    @ViewModelKey(ForumViewModel.class)
    ViewModel provideForumViewModel(ForumRepository forumRepository) {
        return new ForumViewModel(forumRepository);
    }

    @Provides
    @IntoMap
    @ViewModelKey(UsersViewModel.class)
    ViewModel provideUsersViewModel(UserRepository userRepository) {
        return new UsersViewModel(userRepository);
    }
}
