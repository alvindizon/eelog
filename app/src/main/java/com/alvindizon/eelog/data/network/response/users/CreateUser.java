
package com.alvindizon.eelog.data.network.response.users;

import com.squareup.moshi.Json;

public class CreateUser {

    @Json(name = "__deferred")
    private Deferred deferred;

    public Deferred getDeferred() {
        return deferred;
    }

    public void setDeferred(Deferred deferred) {
        this.deferred = deferred;
    }

}
