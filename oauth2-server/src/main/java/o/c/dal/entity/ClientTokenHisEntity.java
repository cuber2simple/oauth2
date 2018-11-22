package o.c.dal.entity;

import java.util.Date;

/**
 * tableName:t_client_token_his_201812
 * remarks:
 */
public class ClientTokenHisEntity {
    /**
     * columnName:token_id
     * remarks:
     */
    private String tokenId;

    /**
     * columnName:client_id
     * remarks:
     */
    private String clientId;

    /**
     * columnName:access_token
     * remarks:
     */
    private String accessToken;

    /**
     * columnName:refresh_token
     * remarks:
     */
    private String refreshToken;

    /**
     * columnName:access_token_validity
     * remarks:
     */
    private Integer accessTokenValidity;

    /**
     * columnName:refresh_token_validity
     * remarks:
     */
    private Integer refreshTokenValidity;

    /**
     * columnName:status
     * remarks:
     */
    private String status;

    /**
     * columnName:scope
     * remarks:
     */
    private String scope;

    /**
     * columnName:create_datetime
     * remarks:
     */
    private Date createDatetime;

    /**
     * columnName:expire_datetime
     * remarks:
     */
    private Date expireDatetime;

    public String getTokenId() {
        return tokenId;
    }

    public void setTokenId(String tokenId) {
        this.tokenId = tokenId == null ? null : tokenId.trim();
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId == null ? null : clientId.trim();
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken == null ? null : accessToken.trim();
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken == null ? null : refreshToken.trim();
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope == null ? null : scope.trim();
    }

    public Date getCreateDatetime() {
        return createDatetime;
    }

    public void setCreateDatetime(Date createDatetime) {
        this.createDatetime = createDatetime;
    }

    public Date getExpireDatetime() {
        return expireDatetime;
    }

    public void setExpireDatetime(Date expireDatetime) {
        this.expireDatetime = expireDatetime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tokenId=").append(tokenId);
        sb.append(", clientId=").append(clientId);
        sb.append(", accessToken=").append(accessToken);
        sb.append(", refreshToken=").append(refreshToken);
        sb.append(", accessTokenValidity=").append(accessTokenValidity);
        sb.append(", refreshTokenValidity=").append(refreshTokenValidity);
        sb.append(", status=").append(status);
        sb.append(", scope=").append(scope);
        sb.append(", createDatetime=").append(createDatetime);
        sb.append(", expireDatetime=").append(expireDatetime);
        sb.append("]");
        return sb.toString();
    }
}