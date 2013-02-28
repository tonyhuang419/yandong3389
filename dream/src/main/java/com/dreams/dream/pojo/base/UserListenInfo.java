package com.dreams.dream.pojo.base;

import java.io.Serializable;
import java.util.Date;

public class UserListenInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    private String userListenId;

    private String userId;

    private String listenUserId;

    private Date listenDate;

    private Date createDate;

    private Date updateDate;

    private String createUserId;

    private String updateUserId;

    public String getUserListenId() {
        return userListenId;
    }

    public void setUserListenId(String userListenId) {
        this.userListenId = userListenId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getListenUserId() {
        return listenUserId;
    }

    public void setListenUserId(String listenUserId) {
        this.listenUserId = listenUserId;
    }

    public Date getListenDate() {
        return listenDate;
    }

    public void setListenDate(Date listenDate) {
        this.listenDate = listenDate;
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