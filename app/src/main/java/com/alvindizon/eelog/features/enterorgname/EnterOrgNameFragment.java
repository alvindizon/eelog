package com.alvindizon.eelog.features.enterorgname;

import androidx.lifecycle.ViewModelProviders;

import com.alvindizon.eelog.BR;
import com.alvindizon.eelog.R;
import com.alvindizon.eelog.databinding.FragmentEnterForumBinding;
import com.alvindizon.eelog.core.viewmodel.ViewModelFactory;
import com.alvindizon.eelog.core.ui.BaseFragment;

import javax.inject.Inject;

public class EnterOrgNameFragment extends BaseFragment<FragmentEnterForumBinding, EnterOrgNameViewModel> {

    @Inject
    ViewModelFactory viewModelFactory;

    @Override
    public int getLayoutId() {
        return R.layout.fragment_enter_forum;
    }

    @Override
    public int getDataBindingVariable() {
        return BR.viewModel;
    }

    @Override
    public EnterOrgNameViewModel getViewModel() {
        viewModel = ViewModelProviders.of(this, viewModelFactory).get(EnterOrgNameViewModel.class);
        return viewModel;
    }

    @Override
    protected void performDependencyInjection() {
        getViewModelComponent().inject(this);
    }

}
