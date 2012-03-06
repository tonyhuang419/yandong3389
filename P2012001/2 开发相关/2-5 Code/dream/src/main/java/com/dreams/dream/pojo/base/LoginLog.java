package com.dreams.dream.pojo.base;

import java.io.Serializable;
import java.util.Date;

public class LoginLog implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer loginLogId;

    private Date loginTime;

    private String loginIpAddress;

    private Integer loginUserId;

    public Integer getLoginLogId() {
        return loginLogId;
    }

    public void setLoginLogId(Integer loginLogId) {
        this.loginLogId = loginLogId;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public String getLoginIpAddress() {
        return loginIpAddress;
    }

    public void setLoginIpAddress(String loginIpAddress) {
        this.loginIpAddress = loginIpAddress;
    }

    public Integer getLoginUserId() {
        return loginUserId;
    }

    public void setLoginUserId(Integer loginUserId) {
        this.loginUserId = loginUserId;
    }
}