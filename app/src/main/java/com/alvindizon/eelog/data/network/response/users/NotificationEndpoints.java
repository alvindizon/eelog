
package com.alvindizon.eelog.data.network.response.users;

import com.squareup.moshi.Json;

public class NotificationEndpoints {

    @Json(name = "__deferred")
    private Deferred_______ deferred;

    public Deferred_______ getDeferred() {
        return deferred;
    }

    public void setDeferred(Deferred_______ deferred) {
        this.deferred = deferred;
    }

}
