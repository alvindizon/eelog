
package com.alvindizon.eelog.network.model;

import com.squareup.moshi.Json;

public class Features {

    @Json(name = "tasks")
    private Integer tasks;
    @Json(name = "ryver:enabled")
    private Integer ryverEnabled;
    @Json(name = "users:activate")
    private Integer usersActivate;

    public Integer getTasks() {
        return tasks;
    }

    public void setTasks(Integer tasks) {
        this.tasks = tasks;
    }

    public Integer getRyverEnabled() {
        return ryverEnabled;
    }

    public void setRyverEnabled(Integer ryverEnabled) {
        this.ryverEnabled = ryverEnabled;
    }

    public Integer getUsersActivate() {
        return usersActivate;
    }

    public void setUsersActivate(Integer usersActivate) {
        this.usersActivate = usersActivate;
    }

}
