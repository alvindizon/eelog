
package com.alvindizon.eelog.data.network.response.users;

import com.squareup.moshi.Json;

public class Groups {

    @Json(name = "__deferred")
    private Deferred________ deferred;

    public Deferred________ getDeferred() {
        return deferred;
    }

    public void setDeferred(Deferred________ deferred) {
        this.deferred = deferred;
    }

}
