package com.dreams.dream.pojo.base;

import java.io.Serializable;
import java.util.Date;

public class UserLoginHis implements Serializable {
    private static final long serialVersionUID = 1L;

    private String loginHisId;

    private Date loginDate;

    private String loginIp;

    private String userId;

    private Date createDate;

    private Date updateDate;

    private String createUserId;

    private String updateUserId;

    public String getLoginHisId() {
        return loginHisId;
    }

    public void setLoginHisId(String loginHisId) {
        this.loginHisId = loginHisId;
    }

    public Date getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
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