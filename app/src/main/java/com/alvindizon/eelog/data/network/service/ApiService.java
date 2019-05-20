package com.alvindizon.eelog.data.network.service;

import com.alvindizon.eelog.data.network.response.D;
import com.alvindizon.eelog.data.network.response.LoginResponse;

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
    Single<String> getForums(@Url String url);

}
