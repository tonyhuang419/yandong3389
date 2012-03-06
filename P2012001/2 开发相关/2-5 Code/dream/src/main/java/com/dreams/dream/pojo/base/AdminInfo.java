package com.dreams.dream.pojo.base;

import java.io.Serializable;

public class AdminInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer userId;

    private String loginName;

    private String loginPass;

    /**
     * 0
     */
    private Integer isInvalid;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getLoginPass() {
        return loginPass;
    }

    public void setLoginPass(String loginPass) {
        this.loginPass = loginPass;
    }

    /**
     * @return 0
     */
    public Integer getIsInvalid() {
        return isInvalid;
    }

    /**
     * @param isInvalid 
	 *            0
     */
    public void setIsInvalid(Integer isInvalid) {
        this.isInvalid = isInvalid;
    }
}