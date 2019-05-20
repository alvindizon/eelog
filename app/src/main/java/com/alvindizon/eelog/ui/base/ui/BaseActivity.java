package com.alvindizon.eelog.ui.base.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

import androidx.annotation.LayoutRes;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModel;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.alvindizon.eelog.EelogApp;
import com.alvindizon.eelog.R;
import com.alvindizon.eelog.di.component.ApplicationComponent;
import com.alvindizon.eelog.di.component.ViewModelComponent;

public abstract class BaseActivity<B extends ViewDataBinding, V extends ViewModel> extends AppCompatActivity {

    protected B binding;
    protected V viewModel;
    protected NavController navController;

    @LayoutRes
    public abstract int getLayoutId();

    public abstract int getDataBindingVariable();

    public abstract V getViewModel();

    protected abstract void performDependencyInjection();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        performDependencyInjection();
        setDataBinding();

        navController = Navigation.findNavController(this, R.id.nav_host_fragment);

        if(getDataBindingVariable() != 0) {
            binding.setVariable(getDataBindingVariable(), viewModel);
        }
    }

    @UiThread
    private void setDataBinding() {
        binding = DataBindingUtil.setContentView(this, getLayoutId());
        this.viewModel = viewModel == null ? getViewModel() : viewModel;
        if(getDataBindingVariable() != 0) {
            binding.setVariable(getDataBindingVariable(), viewModel);
        }
        binding.setLifecycleOwner(this);
        binding.executePendingBindings();

    }

    @UiThread
    private ApplicationComponent getApplicationComponent() {
        return ((EelogApp) getApplication()).getApplicationComponent();
    }

    @UiThread
    protected ViewModelComponent getViewModelComponent() {
        return ((EelogApp) getApplication()).getViewModelComponent();
    }

    protected void hideKeyboard() {
        View view = this.getCurrentFocus();
        if (view != null) {
            InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
            if (imm != null) {
                imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
        }
    }

    public B getBinding() {
        return binding;
    }

}
