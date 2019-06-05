
package com.alvindizon.eelog.data.network.response.users;

import com.squareup.moshi.Json;

public class Board {

    @Json(name = "__deferred")
    private Deferred__ deferred;

    public Deferred__ getDeferred() {
        return deferred;
    }

    public void setDeferred(Deferred__ deferred) {
        this.deferred = deferred;
    }

}
