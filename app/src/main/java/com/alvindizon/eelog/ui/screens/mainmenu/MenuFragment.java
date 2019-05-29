package com.alvindizon.eelog.ui.screens.mainmenu;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;

import com.alvindizon.eelog.BR;
import com.alvindizon.eelog.R;
import com.alvindizon.eelog.databinding.FragmentMenuBinding;
import com.alvindizon.eelog.ui.base.ui.BaseFragment;

public class MenuFragment extends BaseFragment<FragmentMenuBinding, MainMenuViewModel> {

    @Override
    public int getLayoutId() {
        return R.layout.fragment_menu;
    }

    @Override
    public int getDataBindingVariable() {
        return BR.viewModel;
    }

    @Override
    public MainMenuViewModel getViewModel() {
        viewModel = ViewModelProviders.of(this).get(MainMenuViewModel.class);
        return viewModel;
    }

    @Override
    protected void performDependencyInjection() {

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        viewModel.getForumClick.observe(this, clicked -> {
            // navigate to forum menu fragment
            navController.navigate(R.id.action_menu_dest_to_forum_list_dest);
        });

        viewModel.listUserClick.observe(this, clicked -> {
            // navigate to user list fragment
        });
    }
}
