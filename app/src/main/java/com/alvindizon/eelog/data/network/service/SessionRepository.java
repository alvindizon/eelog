package com.alvindizon.eelog.data.network.service;

import android.util.Base64;

import com.alvindizon.eelog.R;
import com.alvindizon.eelog.data.network.response.login.LoginResponse;
import com.alvindizon.eelog.data.prefs.PreferenceRepository;

import io.reactivex.Single;

public class SessionRepository {

    private ApiService apiService;
    private final PreferenceRepository preferenceRepository;

    public SessionRepository(ApiService apiService, PreferenceRepository preferenceRepository) {
        this.apiService = apiService;
        this.preferenceRepository = preferenceRepository;
    }

    public Single<LoginResponse> sendLoginRequest(String orgname, String username, String password) {
        StringBuilder sb = new StringBuilder("https://");
        sb.append(orgname);
        sb.append(".ryver.com/api/1/odata.svc/User.Login()");
        String authorization = generateAuthorization(username, password);

        // save authorization to shared preferences
        preferenceRepository.set(R.string.key_auth, authorization);

        return apiService.sendLoginRequest(sb.toString());
    }

    private String generateAuthorization(String username, String password) {
        String input = username + ":" + password;
        return "Basic " + Base64.encodeToString(input.getBytes(), Base64.NO_WRAP);
    }
}
