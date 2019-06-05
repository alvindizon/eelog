
package com.alvindizon.eelog.data.network.response.users;

import com.squareup.moshi.Json;

public class Workrooms {

    @Json(name = "__deferred")
    private Deferred______ deferred;

    public Deferred______ getDeferred() {
        return deferred;
    }

    public void setDeferred(Deferred______ deferred) {
        this.deferred = deferred;
    }

}
