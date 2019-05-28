
package com.alvindizon.eelog.data.network.response.listforum;

import com.squareup.moshi.Json;

public class TagDef {

    @Json(name = "name")
    private String name;
    @Json(name = "colors")
    private Colors colors;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Colors getColors() {
        return colors;
    }

    public void setColors(Colors colors) {
        this.colors = colors;
    }

}
