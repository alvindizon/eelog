
package com.alvindizon.eelog.data.network.response.listforum;

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
    @Json(name = "name")
    private String name;
    @Json(name = "nickname")
    private String nickname;
    @Json(name = "description")
    private String description;
    @Json(name = "about")
    private Object about;
    @Json(name = "hasAvatar")
    private Boolean hasAvatar;
    @Json(name = "identifier")
    private String identifier;
    @Json(name = "channel")
    private String channel;
    @Json(name = "jid")
    private String jid;
    @Json(name = "active")
    private Boolean active;
    @Json(name = "addNewMembers")
    private Boolean addNewMembers;
    @Json(name = "sharePosts")
    private Boolean sharePosts;
    @Json(name = "shareTasks")
    private Boolean shareTasks;
    @Json(name = "tagDefs")
    private List<TagDef> tagDefs = null;
    @Json(name = "settings")
    private Object settings;
    @Json(name = "tabs")
    private Object tabs;
    @Json(name = "__descriptor")
    private String descriptor;
    @Json(name = "__permissions")
    private Integer permissions;
    @Json(name = "__bookmarked")
    private Object bookmarked;
    @Json(name = "__subscribed")
    private Boolean subscribed;
    @Json(name = "__subscription")
    private Object subscription;
    @Json(name = "createUser")
    private CreateUser createUser;
    @Json(name = "modifyUser")
    private ModifyUser modifyUser;
    @Json(name = "securityGroup")
    private SecurityGroup securityGroup;
    @Json(name = "administratorsGroup")
    private AdministratorsGroup administratorsGroup;
    @Json(name = "moderatorsGroup")
    private ModeratorsGroup moderatorsGroup;
    @Json(name = "board")
    private Board board;
    @Json(name = "members")
    private Members members;
    @Json(name = "externalLinks")
    private ExternalLinks externalLinks;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Object getAbout() {
        return about;
    }

    public void setAbout(Object about) {
        this.about = about;
    }

    public Boolean getHasAvatar() {
        return hasAvatar;
    }

    public void setHasAvatar(Boolean hasAvatar) {
        this.hasAvatar = hasAvatar;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getJid() {
        return jid;
    }

    public void setJid(String jid) {
        this.jid = jid;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Boolean getAddNewMembers() {
        return addNewMembers;
    }

    public void setAddNewMembers(Boolean addNewMembers) {
        this.addNewMembers = addNewMembers;
    }

    public Boolean getSharePosts() {
        return sharePosts;
    }

    public void setSharePosts(Boolean sharePosts) {
        this.sharePosts = sharePosts;
    }

    public Boolean getShareTasks() {
        return shareTasks;
    }

    public void setShareTasks(Boolean shareTasks) {
        this.shareTasks = shareTasks;
    }

    public List<TagDef> getTagDefs() {
        return tagDefs;
    }

    public void setTagDefs(List<TagDef> tagDefs) {
        this.tagDefs = tagDefs;
    }

    public Object getSettings() {
        return settings;
    }

    public void setSettings(Object settings) {
        this.settings = settings;
    }

    public Object getTabs() {
        return tabs;
    }

    public void setTabs(Object tabs) {
        this.tabs = tabs;
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

    public Object getBookmarked() {
        return bookmarked;
    }

    public void setBookmarked(Object bookmarked) {
        this.bookmarked = bookmarked;
    }

    public Boolean getSubscribed() {
        return subscribed;
    }

    public void setSubscribed(Boolean subscribed) {
        this.subscribed = subscribed;
    }

    public Object getSubscription() {
        return subscription;
    }

    public void setSubscription(Object subscription) {
        this.subscription = subscription;
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

    public SecurityGroup getSecurityGroup() {
        return securityGroup;
    }

    public void setSecurityGroup(SecurityGroup securityGroup) {
        this.securityGroup = securityGroup;
    }

    public AdministratorsGroup getAdministratorsGroup() {
        return administratorsGroup;
    }

    public void setAdministratorsGroup(AdministratorsGroup administratorsGroup) {
        this.administratorsGroup = administratorsGroup;
    }

    public ModeratorsGroup getModeratorsGroup() {
        return moderatorsGroup;
    }

    public void setModeratorsGroup(ModeratorsGroup moderatorsGroup) {
        this.moderatorsGroup = moderatorsGroup;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public Members getMembers() {
        return members;
    }

    public void setMembers(Members members) {
        this.members = members;
    }

    public ExternalLinks getExternalLinks() {
        return externalLinks;
    }

    public void setExternalLinks(ExternalLinks externalLinks) {
        this.externalLinks = externalLinks;
    }

}
