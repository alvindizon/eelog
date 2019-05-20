package com.alvindizon.eelog.ui.base.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;

import com.alvindizon.eelog.EelogApp;
import com.alvindizon.eelog.di.component.ApplicationComponent;
import com.alvindizon.eelog.di.component.ViewModelComponent;

public abstract class BaseFragment<B extends ViewDataBinding, V extends ViewModel> extends Fragment {
    protected B binding;
    protected V viewModel;

    @LayoutRes
    public abstract int getLayoutId();

    public abstract int getDataBindingVariable();

    public abstract V getViewModel();

    protected abstract void performDependencyInjection();

    @UiThread
    private ApplicationComponent getApplicationComponent() {
        return ((EelogApp) requireActivity().getApplication()).getApplicationComponent();
    }

    @UiThread
    protected ViewModelComponent getViewModelComponent() {
        return ((EelogApp) requireActivity().getApplication()).getViewModelComponent();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        performDependencyInjection();
        viewModel = getViewModel();
    }

    @SuppressWarnings("unchecked")
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, getLayoutId(), container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.setVariable(getDataBindingVariable(), viewModel);
        binding.setLifecycleOwner(this);
        binding.executePendingBindings();
    }

    public B getBinding() {
        return binding;
    }

}
