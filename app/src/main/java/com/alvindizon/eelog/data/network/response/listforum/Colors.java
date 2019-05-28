
package com.alvindizon.eelog.data.network.response.listforum;

import com.squareup.moshi.Json;

public class Colors {

    @Json(name = "text")
    private String text;
    @Json(name = "background")
    private String background;
    @Json(name = "border")
    private String border;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public String getBorder() {
        return border;
    }

    public void setBorder(String border) {
        this.border = border;
    }

}
