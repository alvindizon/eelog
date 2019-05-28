
package com.alvindizon.eelog.data.network.response.listforum;

import com.squareup.moshi.Json;

public class Metadata {

    @Json(name = "uri")
    private String uri;
    @Json(name = "type")
    private String type;
    @Json(name = "etag")
    private String etag;

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEtag() {
        return etag;
    }

    public void setEtag(String etag) {
        this.etag = etag;
    }

}
