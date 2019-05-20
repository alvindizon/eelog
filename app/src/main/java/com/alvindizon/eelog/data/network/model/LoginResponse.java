
package com.alvindizon.eelog.data.network.model;

import com.squareup.moshi.Json;

public class LoginResponse {

    @Json(name = "d")
    private D d;

    public D getD() {
        return d;
    }

    public void setD(D d) {
        this.d = d;
    }

}
