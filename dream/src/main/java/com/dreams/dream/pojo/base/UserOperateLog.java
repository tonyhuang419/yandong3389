package com.dreams.dream.pojo.base;

import java.io.Serializable;
import java.util.Date;

public class UserOperateLog implements Serializable {
    private static final long serialVersionUID = 1L;

    private String userOperateId;

    private String userOperateContent;

    private Date userOperateDate;

    private String userId;

    private Date createDate;

    private Date updateDate;

    private String createUserId;

    private String updateUserId;

    public String getUserOperateId() {
        return userOperateId;
    }

    public void setUserOperateId(String userOperateId) {
        this.userOperateId = userOperateId;
    }

    public String getUserOperateContent() {
        return userOperateContent;
    }

    public void setUserOperateContent(String userOperateContent) {
        this.userOperateContent = userOperateContent;
    }

    public Date getUserOperateDate() {
        return userOperateDate;
    }

    public void setUserOperateDate(Date userOperateDate) {
        this.userOperateDate = userOperateDate;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    public String getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(String updateUserId) {
        this.updateUserId = updateUserId;
    }
}