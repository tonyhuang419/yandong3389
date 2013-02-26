package com.dreams.dream.pojo.base;

import java.io.Serializable;
import java.util.Date;

public class UserOperateLog implements Serializable {
    private static final long serialVersionUID = 1L;

    private String userOperateId;

    private String userOperateContent;

    private Date userOperateDate;

    private String userId;

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
}