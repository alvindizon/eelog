package com.alvindizon.eelog.data.network.interceptor;

import com.alvindizon.eelog.R;
import com.alvindizon.eelog.data.prefs.PreferenceRepository;

import java.io.IOException;

import javax.inject.Inject;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;


public class TokenInterceptor implements Interceptor {

    private final PreferenceRepository preferenceRepository;

    @Inject
    public TokenInterceptor(PreferenceRepository preferenceRepository) {
        this.preferenceRepository = preferenceRepository;
    }

    @Override
    public Response intercept(Chain chain) throws IOException {

        String auth = preferenceRepository.get(R.string.key_auth, null);
        Request requestWithAuth =  chain.request().newBuilder()
                .header("authorization", auth)
                .build();
        return chain.proceed(requestWithAuth);
    }
}
