
package com.alvindizon.eelog.data.network.response.listforum;

import com.squareup.moshi.Json;

public class ModeratorsGroup {

    @Json(name = "__deferred")
    private Deferred____ deferred;

    public Deferred____ getDeferred() {
        return deferred;
    }

    public void setDeferred(Deferred____ deferred) {
        this.deferred = deferred;
    }

}
