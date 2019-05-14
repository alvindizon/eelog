package com.alvindizon.eelog.network.service;

import io.reactivex.Single;
import retrofit2.http.POST;
import retrofit2.http.Url;

public interface ApiService {

    @POST
    Single<String> sendLoginRequest(@Url String loginUrl);

}
