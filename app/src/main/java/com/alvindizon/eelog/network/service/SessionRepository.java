package com.alvindizon.eelog.network.service;

import io.reactivex.Completable;

public class SessionRepository {

    public SessionRepository() {
    }

    public Completable sendLoginRequest(String orgname, String username, String password) {
        StringBuilder sb = new StringBuilder("https://");
        sb.append(orgname);
        sb.append("ryver.com/api/1/odata/svc/User.Login()");
    }

}
