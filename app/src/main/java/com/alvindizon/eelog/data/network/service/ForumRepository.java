package com.alvindizon.eelog.data.network.service;

import com.alvindizon.eelog.data.network.response.listforum.ListForumResponse;

import io.reactivex.Single;

public class ForumRepository {

    private ApiService apiService;

    public ForumRepository(ApiService apiService) {
        this.apiService = apiService;
    }

    public Single<ListForumResponse> getForums(String instanceName) {
        StringBuilder sb = new StringBuilder("https://");
        sb.append(instanceName);
        sb.append(".ryver.com/api/1/odata.svc/forums");

        return apiService.getForums(sb.toString());
    }

}
