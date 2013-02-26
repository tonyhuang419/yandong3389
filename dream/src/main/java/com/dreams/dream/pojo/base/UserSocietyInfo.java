package com.dreams.dream.pojo.base;

import java.io.Serializable;

public class UserSocietyInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    private String userSocietyId;

    private String userId;

    private String societyId;

    private String societyDutyId;

    public String getUserSocietyId() {
        return userSocietyId;
    }

    public void setUserSocietyId(String userSocietyId) {
        this.userSocietyId = userSocietyId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getSocietyId() {
        return societyId;
    }

    public void setSocietyId(String societyId) {
        this.societyId = societyId;
    }

    public String getSocietyDutyId() {
        return societyDutyId;
    }

    public void setSocietyDutyId(String societyDutyId) {
        this.societyDutyId = societyDutyId;
    }
}