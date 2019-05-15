
package com.alvindizon.eelog.network.model;

import com.squareup.moshi.Json;

public class Services {

    @Json(name = "avatar")
    private String avatar;
    @Json(name = "storage")
    private String storage;
    @Json(name = "data")
    private String data;
    @Json(name = "chat")
    private String chat;

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getChat() {
        return chat;
    }

    public void setChat(String chat) {
        this.chat = chat;
    }

}
