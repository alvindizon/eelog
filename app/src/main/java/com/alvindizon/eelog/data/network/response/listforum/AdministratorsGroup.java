
package com.alvindizon.eelog.data.network.response.listforum;

import com.squareup.moshi.Json;

public class AdministratorsGroup {

    @Json(name = "__deferred")
    private Deferred___ deferred;

    public Deferred___ getDeferred() {
        return deferred;
    }

    public void setDeferred(Deferred___ deferred) {
        this.deferred = deferred;
    }

}
