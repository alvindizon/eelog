
package com.alvindizon.eelog.data.network.response.users;

import com.squareup.moshi.Json;

public class Deferred_ {

    @Json(name = "uri")
    private String uri;

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

}
