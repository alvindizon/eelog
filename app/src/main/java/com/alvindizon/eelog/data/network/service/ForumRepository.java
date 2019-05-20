package com.alvindizon.eelog.data.network.service;

import io.reactivex.Completable;

public class ForumRepository {

    private ApiService apiService;

    public ForumRepository(ApiService apiService) {
        this.apiService = apiService;
    }

    public Completable getForums(String instanceName) {
        StringBuilder sb = new StringBuilder("https://");
        sb.append(instanceName);
        sb.append(".ryver.com/api/1/odata.svc/forums");

        return apiService.getForums(sb.toString()).ignoreElement();
    }

}
