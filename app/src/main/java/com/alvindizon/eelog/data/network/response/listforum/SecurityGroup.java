
package com.alvindizon.eelog.data.network.response.listforum;

import com.squareup.moshi.Json;

public class SecurityGroup {

    @Json(name = "__deferred")
    private Deferred__ deferred;

    public Deferred__ getDeferred() {
        return deferred;
    }

    public void setDeferred(Deferred__ deferred) {
        this.deferred = deferred;
    }

}
