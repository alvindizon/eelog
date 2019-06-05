
package com.alvindizon.eelog.data.network.response.users;

import com.squareup.moshi.Json;

public class UserListResponse {

    @Json(name = "d")
    private D d;

    public D getD() {
        return d;
    }

    public void setD(D d) {
        this.d = d;
    }

}
