package io.github.dftrakesh.shipstation.stores;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SSStore {

    @SerializedName("storeId")
    @Expose
    private Integer storeId;
    
    @SerializedName("storeName")
    @Expose
    private String storeName;
    
    @SerializedName("marketplaceId")
    @Expose
    private Integer marketplaceId;
    
    @SerializedName("marketplaceName")
    @Expose
    private String marketplaceName;
    
    @SerializedName("accountName")
    @Expose
    private String accountName;
    
    @SerializedName("email")
    @Expose
    private String email;
    
    @SerializedName("integrationUrl")
    @Expose
    private String integrationUrl;
    
    @SerializedName("active")
    @Expose
    private String active;
    
    @SerializedName("companyName")
    @Expose
    private String companyName;
    
    @SerializedName("phone")
    @Expose
    private String phone;
    
    @SerializedName("publicEmail")
    @Expose
    private String publicEmail;
    
    @SerializedName("website")
    @Expose
    private String website;
    
    @SerializedName("refreshDate")
    @Expose
    private String refreshDate;
    
    @SerializedName("lastRefreshAttempt")
    @Expose
    private String lastRefreshAttempt;
    
    @SerializedName("createDate")
    @Expose
    private String createDate;
    
    @SerializedName("modifyDate")
    @Expose
    private String modifyDate;
    
    @SerializedName("autoRefresh")
    @Expose
    private String autoRefresh;
    
    @SerializedName("statusMappings")
    @Expose
    private List<StatusMapping> statusMappings = null;

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public Integer getMarketplaceId() {
        return marketplaceId;
    }

    public void setMarketplaceId(Integer marketplaceId) {
        this.marketplaceId = marketplaceId;
    }

    public String getMarketplaceName() {
        return marketplaceName;
    }

    public void setMarketplaceName(String marketplaceName) {
        this.marketplaceName = marketplaceName;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIntegrationUrl() {
        return integrationUrl;
    }

    public void setIntegrationUrl(String integrationUrl) {
        this.integrationUrl = integrationUrl;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPublicEmail() {
        return publicEmail;
    }

    public void setPublicEmail(String publicEmail) {
        this.publicEmail = publicEmail;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getRefreshDate() {
        return refreshDate;
    }

    public void setRefreshDate(String refreshDate) {
        this.refreshDate = refreshDate;
    }

    public String getLastRefreshAttempt() {
        return lastRefreshAttempt;
    }

    public void setLastRefreshAttempt(String lastRefreshAttempt) {
        this.lastRefreshAttempt = lastRefreshAttempt;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(String modifyDate) {
        this.modifyDate = modifyDate;
    }

    public String getAutoRefresh() {
        return autoRefresh;
    }

    public void setAutoRefresh(String autoRefresh) {
        this.autoRefresh = autoRefresh;
    }

    public List<StatusMapping> getStatusMappings() {
        return statusMappings;
    }

    public void setStatusMappings(List<StatusMapping> statusMappings) {
        this.statusMappings = statusMappings;
    }

}
