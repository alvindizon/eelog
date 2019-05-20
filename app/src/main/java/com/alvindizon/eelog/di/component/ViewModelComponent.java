package com.alvindizon.eelog.di.component;

import com.alvindizon.eelog.di.module.ViewModelModule;
import com.alvindizon.eelog.ui.screens.forumlist.ForumListFragment;
import com.alvindizon.eelog.ui.screens.main.MainActivity;
import com.alvindizon.eelog.ui.screens.login.LoginFragment;

import dagger.Subcomponent;

@Subcomponent(modules = ViewModelModule.class)
public interface ViewModelComponent {
    void inject(MainActivity activity);
    void inject(LoginFragment fragment);
    void inject(ForumListFragment fragment);
}
