
package com.alvindizon.eelog.data.network.response.listforum;

import com.squareup.moshi.Json;

public class ModifyUser {

    @Json(name = "__deferred")
    private Deferred_ deferred;

    public Deferred_ getDeferred() {
        return deferred;
    }

    public void setDeferred(Deferred_ deferred) {
        this.deferred = deferred;
    }

}
