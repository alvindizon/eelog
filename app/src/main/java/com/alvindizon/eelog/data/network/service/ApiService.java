package com.alvindizon.eelog.data.network.service;

import com.alvindizon.eelog.data.network.response.listforum.ListForumResponse;
import com.alvindizon.eelog.data.network.response.login.LoginResponse;
import com.alvindizon.eelog.data.network.response.users.UserListResponse;

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Url;

public interface ApiService {

    @Headers("Accept: application/json")
    @POST
    Single<LoginResponse> sendLoginRequest(@Url String loginUrl);

    @Headers("Accept: application/json")
    @GET
    Single<ListForumResponse> getForums(@Url String url);

    @Headers("Accept: application/json")
    @GET
    Single<UserListResponse> getUsers(@Url String url);

}
