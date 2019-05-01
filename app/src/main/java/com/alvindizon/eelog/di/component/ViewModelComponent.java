package com.alvindizon.eelog.di.component;

import com.alvindizon.eelog.di.module.ViewModelModule;
import com.alvindizon.eelog.features.main.MainActivity;
import com.alvindizon.eelog.features.enterorgname.EnterOrgNameFragment;

import dagger.Subcomponent;

@Subcomponent(modules = ViewModelModule.class)
public interface ViewModelComponent {
    void inject(MainActivity activity);
    void inject(EnterOrgNameFragment fragment);
}
