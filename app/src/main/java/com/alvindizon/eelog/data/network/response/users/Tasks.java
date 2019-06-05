
package com.alvindizon.eelog.data.network.response.users;

import com.squareup.moshi.Json;

public class Tasks {

    @Json(name = "__deferred")
    private Deferred_________ deferred;

    public Deferred_________ getDeferred() {
        return deferred;
    }

    public void setDeferred(Deferred_________ deferred) {
        this.deferred = deferred;
    }

}
