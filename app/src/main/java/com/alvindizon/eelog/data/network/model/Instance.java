package com.alvindizon.eelog.data.network.model;

import androidx.annotation.NonNull;

public class Instance {

    private String instanceId;

    private String instanceName;

    @NonNull
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(@NonNull String instanceId) {
        this.instanceId = instanceId;
    }

    @NonNull
    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(@NonNull String instanceName) {
        this.instanceName = instanceName;
    }

    @Override
    public String toString() {
        return "Instance{" +
                "instanceId='" + instanceId + '\'' +
                ", instanceName='" + instanceName + '\'' +
                '}';
    }
}
