package o.c.dal.entity;

import java.util.Date;

/**
 * tableName:t_client_scope
 * remarks:client权限
 */
public class ScopeEntity {
    /**
     * columnName:scope_id
     * remarks:主键
     */
    private String scopeId;

    /**
     * columnName:scope_name
     * remarks:权限名
     */
    private String scopeName;

    /**
     * columnName:scope_type
     * remarks:权限类型
     */
    private String scopeType;

    /**
     * columnName:scope_icon
     * remarks:权限图标
     */
    private String scopeIcon;

    /**
     * columnName:scope_url
     * remarks:权限路径
     */
    private String scopeUrl;

    /**
     * columnName:parent_id
     * remarks:权限父ID
     */
    private String parentId;

    /**
     * columnName:scope_desc
     * remarks:权限描述
     */
    private String scopeDesc;

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

    public String getScopeId() {
        return scopeId;
    }

    public void setScopeId(String scopeId) {
        this.scopeId = scopeId == null ? null : scopeId.trim();
    }

    public String getScopeName() {
        return scopeName;
    }

    public void setScopeName(String scopeName) {
        this.scopeName = scopeName == null ? null : scopeName.trim();
    }

    public String getScopeType() {
        return scopeType;
    }

    public void setScopeType(String scopeType) {
        this.scopeType = scopeType == null ? null : scopeType.trim();
    }

    public String getScopeIcon() {
        return scopeIcon;
    }

    public void setScopeIcon(String scopeIcon) {
        this.scopeIcon = scopeIcon == null ? null : scopeIcon.trim();
    }

    public String getScopeUrl() {
        return scopeUrl;
    }

    public void setScopeUrl(String scopeUrl) {
        this.scopeUrl = scopeUrl == null ? null : scopeUrl.trim();
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    public String getScopeDesc() {
        return scopeDesc;
    }

    public void setScopeDesc(String scopeDesc) {
        this.scopeDesc = scopeDesc == null ? null : scopeDesc.trim();
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
        sb.append(", scopeId=").append(scopeId);
        sb.append(", scopeName=").append(scopeName);
        sb.append(", scopeType=").append(scopeType);
        sb.append(", scopeIcon=").append(scopeIcon);
        sb.append(", scopeUrl=").append(scopeUrl);
        sb.append(", parentId=").append(parentId);
        sb.append(", scopeDesc=").append(scopeDesc);
        sb.append(", status=").append(status);
        sb.append(", updateUserId=").append(updateUserId);
        sb.append(", createUserId=").append(createUserId);
        sb.append(", updateDatetime=").append(updateDatetime);
        sb.append(", createDatetime=").append(createDatetime);
        sb.append("]");
        return sb.toString();
    }
}