
package com.alvindizon.eelog.data.network.response.listforum;

import com.squareup.moshi.Json;

public class Members {

    @Json(name = "__deferred")
    private Deferred______ deferred;

    public Deferred______ getDeferred() {
        return deferred;
    }

    public void setDeferred(Deferred______ deferred) {
        this.deferred = deferred;
    }

}
