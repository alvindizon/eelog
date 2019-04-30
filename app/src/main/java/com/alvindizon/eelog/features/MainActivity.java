package com.alvindizon.eelog.features;

import androidx.lifecycle.ViewModelProviders;

import com.alvindizon.eelog.R;
import com.alvindizon.eelog.databinding.ActivityMainBinding;
import com.alvindizon.eelog.framework.ViewModelFactory;
import com.alvindizon.eelog.ui.BaseActivity;

import javax.inject.Inject;

public class MainActivity extends BaseActivity<ActivityMainBinding, MainViewModel> {

    @Inject
    ViewModelFactory viewModelFactory;
    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public int getDataBindingVariable() {
        return 0;
    }

    @Override
    protected void performDependencyInjection() {
        getViewModelComponent().inject(this);
    }

    @Override
    public MainViewModel getViewModel() {
        viewModel = ViewModelProviders.of(this, viewModelFactory).get(MainViewModel.class);
        return viewModel;
    }
}
