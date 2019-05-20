
package com.alvindizon.eelog.data.network.response;

import com.squareup.moshi.Json;

public class Configuration {

    @Json(name = "standardTitleText")
    private String standardTitleText;
    @Json(name = "productVersion")
    private String productVersion;
    @Json(name = "allowCredentialStorage")
    private Boolean allowCredentialStorage;
    @Json(name = "systemSupportUrl")
    private String systemSupportUrl;
    @Json(name = "boxAPIKey")
    private String boxAPIKey;
    @Json(name = "dropboxAPIKey")
    private String dropboxAPIKey;
    @Json(name = "googleAPIKey")
    private String googleAPIKey;
    @Json(name = "googleClientKey")
    private String googleClientKey;
    @Json(name = "liveAPIKey")
    private String liveAPIKey;
    @Json(name = "googleHangoutId")
    private String googleHangoutId;
    @Json(name = "giphyAPIKey")
    private String giphyAPIKey;
    @Json(name = "stripeClientKey")
    private String stripeClientKey;

    public String getStandardTitleText() {
        return standardTitleText;
    }

    public void setStandardTitleText(String standardTitleText) {
        this.standardTitleText = standardTitleText;
    }

    public String getProductVersion() {
        return productVersion;
    }

    public void setProductVersion(String productVersion) {
        this.productVersion = productVersion;
    }

    public Boolean getAllowCredentialStorage() {
        return allowCredentialStorage;
    }

    public void setAllowCredentialStorage(Boolean allowCredentialStorage) {
        this.allowCredentialStorage = allowCredentialStorage;
    }

    public String getSystemSupportUrl() {
        return systemSupportUrl;
    }

    public void setSystemSupportUrl(String systemSupportUrl) {
        this.systemSupportUrl = systemSupportUrl;
    }

    public String getBoxAPIKey() {
        return boxAPIKey;
    }

    public void setBoxAPIKey(String boxAPIKey) {
        this.boxAPIKey = boxAPIKey;
    }

    public String getDropboxAPIKey() {
        return dropboxAPIKey;
    }

    public void setDropboxAPIKey(String dropboxAPIKey) {
        this.dropboxAPIKey = dropboxAPIKey;
    }

    public String getGoogleAPIKey() {
        return googleAPIKey;
    }

    public void setGoogleAPIKey(String googleAPIKey) {
        this.googleAPIKey = googleAPIKey;
    }

    public String getGoogleClientKey() {
        return googleClientKey;
    }

    public void setGoogleClientKey(String googleClientKey) {
        this.googleClientKey = googleClientKey;
    }

    public String getLiveAPIKey() {
        return liveAPIKey;
    }

    public void setLiveAPIKey(String liveAPIKey) {
        this.liveAPIKey = liveAPIKey;
    }

    public String getGoogleHangoutId() {
        return googleHangoutId;
    }

    public void setGoogleHangoutId(String googleHangoutId) {
        this.googleHangoutId = googleHangoutId;
    }

    public String getGiphyAPIKey() {
        return giphyAPIKey;
    }

    public void setGiphyAPIKey(String giphyAPIKey) {
        this.giphyAPIKey = giphyAPIKey;
    }

    public String getStripeClientKey() {
        return stripeClientKey;
    }

    public void setStripeClientKey(String stripeClientKey) {
        this.stripeClientKey = stripeClientKey;
    }

}
