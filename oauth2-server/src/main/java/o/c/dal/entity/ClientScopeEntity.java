package o.c.dal.entity;

import java.util.Date;

/**
 * tableName:t_client_connect_scope
 * remarks:app 范围
 */
public class ClientScopeEntity {
    /**
     * columnName:connect_id
     * remarks:主键
     */
    private String connectId;

    /**
     * columnName:scope_id
     * remarks:范围ID
     */
    private String scopeId;

    /**
     * columnName:client_id
     * remarks:客户端ID
     */
    private String clientId;

    /**
     * columnName:status
     * remarks:o.c.b.model.Status
     */
    private String status;

    /**
     * columnName:update_user_id
     * remarks:更新操作员
     */
    private String updateUserId;

    /**
     * columnName:create_user_id
     * remarks:创建操作员
     */
    private String createUserId;

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

    public String getConnectId() {
        return connectId;
    }

    public void setConnectId(String connectId) {
        this.connectId = connectId == null ? null : connectId.trim();
    }

    public String getScopeId() {
        return scopeId;
    }

    public void setScopeId(String scopeId) {
        this.scopeId = scopeId == null ? null : scopeId.trim();
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId == null ? null : clientId.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(String updateUserId) {
        this.updateUserId = updateUserId == null ? null : updateUserId.trim();
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId == null ? null : createUserId.trim();
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
        sb.append(", connectId=").append(connectId);
        sb.append(", scopeId=").append(scopeId);
        sb.append(", clientId=").append(clientId);
        sb.append(", status=").append(status);
        sb.append(", updateUserId=").append(updateUserId);
        sb.append(", createUserId=").append(createUserId);
        sb.append(", updateDatetime=").append(updateDatetime);
        sb.append(", createDatetime=").append(createDatetime);
        sb.append("]");
        return sb.toString();
    }
}