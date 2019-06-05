
package com.alvindizon.eelog.data.network.response.users;

import java.util.List;
import com.squareup.moshi.Json;

public class Result {

    @Json(name = "__metadata")
    private Metadata metadata;
    @Json(name = "id")
    private Integer id;
    @Json(name = "modifyDate")
    private String modifyDate;
    @Json(name = "createDate")
    private String createDate;
    @Json(name = "createSource")
    private Object createSource;
    @Json(name = "modifySource")
    private Object modifySource;
    @Json(name = "version")
    private Integer version;
    @Json(name = "username")
    private String username;
    @Json(name = "emailAddress")
    private String emailAddress;
    @Json(name = "pendingEmailAddress")
    private Object pendingEmailAddress;
    @Json(name = "pendingEmailAddressDate")
    private Object pendingEmailAddressDate;
    @Json(name = "displayName")
    private String displayName;
    @Json(name = "description")
    private String description;
    @Json(name = "aboutMe")
    private String aboutMe;
    @Json(name = "hasAvatar")
    private Boolean hasAvatar;
    @Json(name = "newUser")
    private Boolean newUser;
    @Json(name = "inviteDate")
    private String inviteDate;
    @Json(name = "inviteAcceptedDate")
    private String inviteAcceptedDate;
    @Json(name = "inviteMessage")
    private Object inviteMessage;
    @Json(name = "roles")
    private List<String> roles = null;
    @Json(name = "features")
    private List<Object> features = null;
    @Json(name = "isCreator")
    private Boolean isCreator;
    @Json(name = "active")
    private Boolean active;
    @Json(name = "locked")
    private Boolean locked;
    @Json(name = "verified")
    private String verified;
    @Json(name = "jidLocal")
    private String jidLocal;
    @Json(name = "jid")
    private String jid;
    @Json(name = "type")
    private String type;
    @Json(name = "timeZone")
    private Object timeZone;
    @Json(name = "tagDefs")
    private List<Object> tagDefs = null;
    @Json(name = "__descriptor")
    private String descriptor;
    @Json(name = "__permissions")
    private Integer permissions;
    @Json(name = "createUser")
    private CreateUser createUser;
    @Json(name = "modifyUser")
    private ModifyUser modifyUser;
    @Json(name = "board")
    private Board board;
    @Json(name = "integration")
    private Integration integration;
    @Json(name = "externalLinks")
    private ExternalLinks externalLinks;
    @Json(name = "phones")
    private Phones phones;
    @Json(name = "workrooms")
    private Workrooms workrooms;
    @Json(name = "notificationEndpoints")
    private NotificationEndpoints notificationEndpoints;
    @Json(name = "groups")
    private Groups groups;
    @Json(name = "tasks")
    private Tasks tasks;

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(String modifyDate) {
        this.modifyDate = modifyDate;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public Object getCreateSource() {
        return createSource;
    }

    public void setCreateSource(Object createSource) {
        this.createSource = createSource;
    }

    public Object getModifySource() {
        return modifySource;
    }

    public void setModifySource(Object modifySource) {
        this.modifySource = modifySource;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Object getPendingEmailAddress() {
        return pendingEmailAddress;
    }

    public void setPendingEmailAddress(Object pendingEmailAddress) {
        this.pendingEmailAddress = pendingEmailAddress;
    }

    public Object getPendingEmailAddressDate() {
        return pendingEmailAddressDate;
    }

    public void setPendingEmailAddressDate(Object pendingEmailAddressDate) {
        this.pendingEmailAddressDate = pendingEmailAddressDate;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAboutMe() {
        return aboutMe;
    }

    public void setAboutMe(String aboutMe) {
        this.aboutMe = aboutMe;
    }

    public Boolean getHasAvatar() {
        return hasAvatar;
    }

    public void setHasAvatar(Boolean hasAvatar) {
        this.hasAvatar = hasAvatar;
    }

    public Boolean getNewUser() {
        return newUser;
    }

    public void setNewUser(Boolean newUser) {
        this.newUser = newUser;
    }

    public String getInviteDate() {
        return inviteDate;
    }

    public void setInviteDate(String inviteDate) {
        this.inviteDate = inviteDate;
    }

    public String getInviteAcceptedDate() {
        return inviteAcceptedDate;
    }

    public void setInviteAcceptedDate(String inviteAcceptedDate) {
        this.inviteAcceptedDate = inviteAcceptedDate;
    }

    public Object getInviteMessage() {
        return inviteMessage;
    }

    public void setInviteMessage(Object inviteMessage) {
        this.inviteMessage = inviteMessage;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    public List<Object> getFeatures() {
        return features;
    }

    public void setFeatures(List<Object> features) {
        this.features = features;
    }

    public Boolean getIsCreator() {
        return isCreator;
    }

    public void setIsCreator(Boolean isCreator) {
        this.isCreator = isCreator;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    public String getVerified() {
        return verified;
    }

    public void setVerified(String verified) {
        this.verified = verified;
    }

    public String getJidLocal() {
        return jidLocal;
    }

    public void setJidLocal(String jidLocal) {
        this.jidLocal = jidLocal;
    }

    public String getJid() {
        return jid;
    }

    public void setJid(String jid) {
        this.jid = jid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Object getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(Object timeZone) {
        this.timeZone = timeZone;
    }

    public List<Object> getTagDefs() {
        return tagDefs;
    }

    public void setTagDefs(List<Object> tagDefs) {
        this.tagDefs = tagDefs;
    }

    public String getDescriptor() {
        return descriptor;
    }

    public void setDescriptor(String descriptor) {
        this.descriptor = descriptor;
    }

    public Integer getPermissions() {
        return permissions;
    }

    public void setPermissions(Integer permissions) {
        this.permissions = permissions;
    }

    public CreateUser getCreateUser() {
        return createUser;
    }

    public void setCreateUser(CreateUser createUser) {
        this.createUser = createUser;
    }

    public ModifyUser getModifyUser() {
        return modifyUser;
    }

    public void setModifyUser(ModifyUser modifyUser) {
        this.modifyUser = modifyUser;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public Integration getIntegration() {
        return integration;
    }

    public void setIntegration(Integration integration) {
        this.integration = integration;
    }

    public ExternalLinks getExternalLinks() {
        return externalLinks;
    }

    public void setExternalLinks(ExternalLinks externalLinks) {
        this.externalLinks = externalLinks;
    }

    public Phones getPhones() {
        return phones;
    }

    public void setPhones(Phones phones) {
        this.phones = phones;
    }

    public Workrooms getWorkrooms() {
        return workrooms;
    }

    public void setWorkrooms(Workrooms workrooms) {
        this.workrooms = workrooms;
    }

    public NotificationEndpoints getNotificationEndpoints() {
        return notificationEndpoints;
    }

    public void setNotificationEndpoints(NotificationEndpoints notificationEndpoints) {
        this.notificationEndpoints = notificationEndpoints;
    }

    public Groups getGroups() {
        return groups;
    }

    public void setGroups(Groups groups) {
        this.groups = groups;
    }

    public Tasks getTasks() {
        return tasks;
    }

    public void setTasks(Tasks tasks) {
        this.tasks = tasks;
    }

}
