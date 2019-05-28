
package com.alvindizon.eelog.data.network.response.listforum;

import com.squareup.moshi.Json;

public class ListForumResponse {

    @Json(name = "d")
    private D d;

    public D getD() {
        return d;
    }

    public void setD(D d) {
        this.d = d;
    }

}
