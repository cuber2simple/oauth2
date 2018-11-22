package o.c.dal.entity;

import java.util.Date;

/**
 * tableName:t_client_token
 * remarks:token表
 */
public class ClientTokenEntity {
    /**
     * columnName:token_id
     * remarks:生成的ID
     */
    private String tokenId;

    /**
     * columnName:client_id
     * remarks:客户端ID
     */
    private String clientId;

    /**
     * columnName:access_token
     * remarks:token
     */
    private String accessToken;

    /**
     * columnName:refresh_token
     * remarks:refresh_token 暂时不可用
     */
    private String refreshToken;

    /**
     * columnName:access_token_validity
     * remarks:access过期时长
     */
    private Integer accessTokenValidity;

    /**
     * columnName:refresh_token_validity
     * remarks:refresh过期时长
     */
    private Integer refreshTokenValidity;

    /**
     * columnName:status
     * remarks:请求认证的status
     */
    private String status;

    /**
     * columnName:scope
     * remarks:范围[暂时不可用]
     */
    private String scope;

    /**
     * columnName:create_datetime
     * remarks:创建token时间
     */
    private Date createDatetime;

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
        sb.append("]");
        return sb.toString();
    }
}