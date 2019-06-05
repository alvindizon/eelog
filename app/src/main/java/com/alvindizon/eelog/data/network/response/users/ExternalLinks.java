
package com.alvindizon.eelog.data.network.response.users;

import com.squareup.moshi.Json;

public class ExternalLinks {

    @Json(name = "__deferred")
    private Deferred____ deferred;

    public Deferred____ getDeferred() {
        return deferred;
    }

    public void setDeferred(Deferred____ deferred) {
        this.deferred = deferred;
    }

}
