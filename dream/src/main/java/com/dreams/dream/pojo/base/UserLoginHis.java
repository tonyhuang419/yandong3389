package com.dreams.dream.pojo.base;

import java.io.Serializable;
import java.util.Date;

public class UserLoginHis implements Serializable {
    private static final long serialVersionUID = 1L;

    private String loginHisId;

    private Date loginDate;

    private String loginIp;

    private String userId;

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
}