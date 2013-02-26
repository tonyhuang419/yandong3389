package com.dreams.dream.pojo.base;

import java.io.Serializable;
import java.util.Date;

public class UserListenInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    private String userListenId;

    private String userId;

    private String listenUserId;

    private Date listenDate;

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
}