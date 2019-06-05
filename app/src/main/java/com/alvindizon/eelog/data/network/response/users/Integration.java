
package com.alvindizon.eelog.data.network.response.users;

import com.squareup.moshi.Json;

public class Integration {

    @Json(name = "__deferred")
    private Deferred___ deferred;

    public Deferred___ getDeferred() {
        return deferred;
    }

    public void setDeferred(Deferred___ deferred) {
        this.deferred = deferred;
    }

}
