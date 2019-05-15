
package com.alvindizon.eelog.network.model;

import java.util.List;
import com.squareup.moshi.Json;

public class D {

    @Json(name = "username")
    private String username;
    @Json(name = "id")
    private Integer id;
    @Json(name = "uniqueId")
    private String uniqueId;
    @Json(name = "sessionId")
    private String sessionId;
    @Json(name = "instanceId")
    private String instanceId;
    @Json(name = "instanceName")
    private String instanceName;
    @Json(name = "newUser")
    private Boolean newUser;
    @Json(name = "type")
    private String type;
    @Json(name = "roles")
    private List<String> roles = null;
    @Json(name = "__descriptor")
    private String descriptor;
    @Json(name = "services")
    private Services services;
    @Json(name = "configuration")
    private Configuration configuration;
    @Json(name = "features")
    private Features features;
    @Json(name = "subscriptions")
    private List<Subscription> subscriptions = null;
    @Json(name = "loginMode")
    private Integer loginMode;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public Boolean getNewUser() {
        return newUser;
    }

    public void setNewUser(Boolean newUser) {
        this.newUser = newUser;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    public String getDescriptor() {
        return descriptor;
    }

    public void setDescriptor(String descriptor) {
        this.descriptor = descriptor;
    }

    public Services getServices() {
        return services;
    }

    public void setServices(Services services) {
        this.services = services;
    }

    public Configuration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(Configuration configuration) {
        this.configuration = configuration;
    }

    public Features getFeatures() {
        return features;
    }

    public void setFeatures(Features features) {
        this.features = features;
    }

    public List<Subscription> getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(List<Subscription> subscriptions) {
        this.subscriptions = subscriptions;
    }

    public Integer getLoginMode() {
        return loginMode;
    }

    public void setLoginMode(Integer loginMode) {
        this.loginMode = loginMode;
    }

}
