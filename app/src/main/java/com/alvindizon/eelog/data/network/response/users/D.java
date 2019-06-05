
package com.alvindizon.eelog.data.network.response.users;

import java.util.List;
import com.squareup.moshi.Json;

public class D {

    @Json(name = "results")
    private List<Result> results = null;

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

}
