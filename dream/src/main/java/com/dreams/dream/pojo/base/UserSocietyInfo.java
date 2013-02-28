package com.dreams.dream.pojo.base;

import java.io.Serializable;
import java.util.Date;

public class UserSocietyInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    private String userSocietyId;

    private String userId;

    private String societyId;

    private String societyDutyId;

    private Date createDate;

    private Date updateDate;

    private String createUserId;

    private String updateUserId;

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