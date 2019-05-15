package com.alvindizon.eelog.network.service;

import com.alvindizon.eelog.network.model.D;

import io.reactivex.Single;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Url;

public interface ApiService {

    @Headers("Accept: application/json")
    @POST
    Single<D> sendLoginRequest(@Url String loginUrl);

}
