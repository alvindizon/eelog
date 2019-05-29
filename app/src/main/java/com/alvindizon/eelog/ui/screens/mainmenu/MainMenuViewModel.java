package com.alvindizon.eelog.ui.screens.mainmenu;

import com.alvindizon.eelog.ui.base.viewmodel.BaseViewModel;
import com.alvindizon.eelog.ui.livedata.SingleLiveEvent;

public class MainMenuViewModel extends BaseViewModel {
    public SingleLiveEvent<Boolean> getForumClick = new SingleLiveEvent<>();
    public SingleLiveEvent<Boolean> listUserClick = new SingleLiveEvent<>();


    public MainMenuViewModel() {
    }

    public void onGetForumClicked() {
        getForumClick.setValue(true);
    }

    public void onListUserClicked() {
        listUserClick.setValue(true);
    }


}
