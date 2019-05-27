package com.alvindizon.eelog.ui.screens.forumlist;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.ViewModelProviders;

import com.alvindizon.eelog.BR;
import com.alvindizon.eelog.R;
import com.alvindizon.eelog.data.network.response.login.NetworkStatus;
import com.alvindizon.eelog.databinding.FragmentForumListBinding;
import com.alvindizon.eelog.ui.base.ui.BaseFragment;
import com.alvindizon.eelog.ui.base.viewmodel.ViewModelFactory;

import javax.inject.Inject;

public class ForumListFragment extends BaseFragment<FragmentForumListBinding, ForumViewModel> {
    @Inject
    ViewModelFactory viewModelFactory;

    @Override
    public int getLayoutId() {
        return R.layout.fragment_forum_list;
    }

    @Override
    public int getDataBindingVariable() {
        return BR.viewModel;
    }

    @Override
    public ForumViewModel getViewModel() {
        viewModel = ViewModelProviders.of(this, viewModelFactory).get(ForumViewModel.class);
        return viewModel;
    }

    @Override
    protected void performDependencyInjection() {
        getViewModelComponent().inject(this);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        viewModel.setInstance(mainViewModel.getCurrentInstance());
        viewModel.listForumStatus.observe(this, this::handleStatus);
    }

    private void handleStatus(NetworkStatus networkStatus) {
        if (networkStatus == NetworkStatus.SUCCESS) {
            Toast.makeText(requireContext(), "list forum success", Toast.LENGTH_SHORT).show();
        }
    }
}
