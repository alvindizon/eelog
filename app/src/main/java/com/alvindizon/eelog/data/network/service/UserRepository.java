package com.alvindizon.eelog.data.network.service;

import com.alvindizon.eelog.data.network.response.users.UserListResponse;

import io.reactivex.Single;

public class UserRepository {

    private ApiService apiService;

    public UserRepository(ApiService apiService) {
        this.apiService = apiService;
    }

    public Single<UserListResponse> getUsers(String instanceName) {
        StringBuilder sb = new StringBuilder("https://");
        sb.append(instanceName);
        sb.append(".ryver.com/api/1/odata.svc/users");

        return apiService.getUsers(sb.toString());
    }
}
