
package com.alvindizon.eelog.data.network.response.users;

import com.squareup.moshi.Json;

public class Phones {

    @Json(name = "__deferred")
    private Deferred_____ deferred;

    public Deferred_____ getDeferred() {
        return deferred;
    }

    public void setDeferred(Deferred_____ deferred) {
        this.deferred = deferred;
    }

}
