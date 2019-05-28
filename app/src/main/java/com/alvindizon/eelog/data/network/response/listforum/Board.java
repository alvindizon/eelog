
package com.alvindizon.eelog.data.network.response.listforum;

import com.squareup.moshi.Json;

public class Board {

    @Json(name = "__deferred")
    private Deferred_____ deferred;

    public Deferred_____ getDeferred() {
        return deferred;
    }

    public void setDeferred(Deferred_____ deferred) {
        this.deferred = deferred;
    }

}
