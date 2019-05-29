package com.alvindizon.eelog.ui.screens.login;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.ViewModelProviders;

import com.alvindizon.eelog.BR;
import com.alvindizon.eelog.R;
import com.alvindizon.eelog.data.network.response.login.NetworkStatus;
import com.alvindizon.eelog.databinding.FragmentLoginBinding;
import com.alvindizon.eelog.ui.base.ui.BaseFragment;
import com.alvindizon.eelog.ui.base.viewmodel.ViewModelFactory;

import javax.inject.Inject;

public class LoginFragment extends BaseFragment<FragmentLoginBinding, LoginViewModel> {

    @Inject
    ViewModelFactory viewModelFactory;

    @Override
    public int getLayoutId() {
        return R.layout.fragment_login;
    }

    @Override
    public int getDataBindingVariable() {
        return BR.viewModel;
    }

    @Override
    public LoginViewModel getViewModel() {
        viewModel = ViewModelProviders.of(this, viewModelFactory).get(LoginViewModel.class);
        return viewModel;
    }

    @Override
    protected void performDependencyInjection() {
        getViewModelComponent().inject(this);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        viewModel.loginStatus.observe(this, this::handleStatus);
    }

    private void handleStatus(NetworkStatus networkStatus) {

        if (networkStatus == NetworkStatus.SUCCESS) {
            Toast.makeText(requireContext(), "login success", Toast.LENGTH_SHORT).show();
            mainViewModel.saveCurrentInstance(viewModel.getInstance());
            navController.navigate(R.id.action_login_dest_to_menu_dest);
        }

    }
}
