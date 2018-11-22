package o.c.dal.entity;

import java.util.Date;

/**
 * tableName:t_oauth2_client
 * remarks:APP表,只支持client credentials todo
 */
public class ClientEntity {
    /**
     * columnName:client_id
     * remarks:appId, appKey
     */
    private String clientId;

    /**
     * columnName:client_secret
     * remarks:appSecret
     */
    private String clientSecret;

    /**
     * columnName:client_name
     * remarks:app 名字
     */
    private String clientName;

    /**
     * columnName:client_type
     * remarks:app类型, feign-app, inner-app
     */
    private String clientType;

    /**
     * columnName:home_uri
     * remarks:用户主页地址
     */
    private String homeUri;

    /**
     * columnName:webhook_uri
     * remarks:app webhook地址
     */
    private String webhookUri;

    /**
     * columnName:access_token_validity
     * remarks:token 失效时间 秒(默认2小时)
     */
    private Integer accessTokenValidity;

    /**
     * columnName:refresh_token_validity
     * remarks:refresh token 失效时间 秒(默认7天)
     */
    private Integer refreshTokenValidity;

    /**
     * columnName:avatar
     * remarks:app头像
     */
    private String avatar;

    /**
     * columnName:status
     * remarks:状态
     */
    private String status;

    /**
     * columnName:rsa_private_key
     * remarks:一些特殊信息(卡号)的加密私钥
     */
    private String rsaPrivateKey;

    /**
     * columnName:rsa_public_key
     * remarks:一些特殊信息(卡号)的加密公钥
     */
    private String rsaPublicKey;

    /**
     * columnName:app_customer_id
     * remarks:app对应的会员ID
     */
    private String appCustomerId;

    /**
     * columnName:owner_operator_id
     * remarks:内部服务操作员ID
     */
    private String ownerOperatorId;

    /**
     * columnName:expire_datetime
     * remarks:过期时间
     */
    private Date expireDatetime;

    /**
     * columnName:update_datetime
     * remarks:更新时间
     */
    private Date updateDatetime;

    /**
     * columnName:create_datetime
     * remarks:创建时间
     */
    private Date createDatetime;

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId == null ? null : clientId.trim();
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret == null ? null : clientSecret.trim();
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName == null ? null : clientName.trim();
    }

    public String getClientType() {
        return clientType;
    }

    public void setClientType(String clientType) {
        this.clientType = clientType == null ? null : clientType.trim();
    }

    public String getHomeUri() {
        return homeUri;
    }

    public void setHomeUri(String homeUri) {
        this.homeUri = homeUri == null ? null : homeUri.trim();
    }

    public String getWebhookUri() {
        return webhookUri;
    }

    public void setWebhookUri(String webhookUri) {
        this.webhookUri = webhookUri == null ? null : webhookUri.trim();
    }

    public Integer getAccessTokenValidity() {
        return accessTokenValidity;
    }

    public void setAccessTokenValidity(Integer accessTokenValidity) {
        this.accessTokenValidity = accessTokenValidity;
    }

    public Integer getRefreshTokenValidity() {
        return refreshTokenValidity;
    }

    public void setRefreshTokenValidity(Integer refreshTokenValidity) {
        this.refreshTokenValidity = refreshTokenValidity;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getRsaPrivateKey() {
        return rsaPrivateKey;
    }

    public void setRsaPrivateKey(String rsaPrivateKey) {
        this.rsaPrivateKey = rsaPrivateKey == null ? null : rsaPrivateKey.trim();
    }

    public String getRsaPublicKey() {
        return rsaPublicKey;
    }

    public void setRsaPublicKey(String rsaPublicKey) {
        this.rsaPublicKey = rsaPublicKey == null ? null : rsaPublicKey.trim();
    }

    public String getAppCustomerId() {
        return appCustomerId;
    }

    public void setAppCustomerId(String appCustomerId) {
        this.appCustomerId = appCustomerId == null ? null : appCustomerId.trim();
    }

    public String getOwnerOperatorId() {
        return ownerOperatorId;
    }

    public void setOwnerOperatorId(String ownerOperatorId) {
        this.ownerOperatorId = ownerOperatorId == null ? null : ownerOperatorId.trim();
    }

    public Date getExpireDatetime() {
        return expireDatetime;
    }

    public void setExpireDatetime(Date expireDatetime) {
        this.expireDatetime = expireDatetime;
    }

    public Date getUpdateDatetime() {
        return updateDatetime;
    }

    public void setUpdateDatetime(Date updateDatetime) {
        this.updateDatetime = updateDatetime;
    }

    public Date getCreateDatetime() {
        return createDatetime;
    }

    public void setCreateDatetime(Date createDatetime) {
        this.createDatetime = createDatetime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", clientId=").append(clientId);
        sb.append(", clientSecret=").append(clientSecret);
        sb.append(", clientName=").append(clientName);
        sb.append(", clientType=").append(clientType);
        sb.append(", homeUri=").append(homeUri);
        sb.append(", webhookUri=").append(webhookUri);
        sb.append(", accessTokenValidity=").append(accessTokenValidity);
        sb.append(", refreshTokenValidity=").append(refreshTokenValidity);
        sb.append(", avatar=").append(avatar);
        sb.append(", status=").append(status);
        sb.append(", rsaPrivateKey=").append(rsaPrivateKey);
        sb.append(", rsaPublicKey=").append(rsaPublicKey);
        sb.append(", appCustomerId=").append(appCustomerId);
        sb.append(", ownerOperatorId=").append(ownerOperatorId);
        sb.append(", expireDatetime=").append(expireDatetime);
        sb.append(", updateDatetime=").append(updateDatetime);
        sb.append(", createDatetime=").append(createDatetime);
        sb.append("]");
        return sb.toString();
    }
}