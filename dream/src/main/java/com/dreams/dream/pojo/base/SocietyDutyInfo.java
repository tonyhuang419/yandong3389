package com.dreams.dream.pojo.base;

import java.io.Serializable;
import java.util.Date;

public class SocietyDutyInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    private String societyDutyId;

    private String societyDutyName;

    private String powerId;

    private Date createDate;

    private Date updateDate;

    private String createUserId;

    private String updateUserId;

    public String getSocietyDutyId() {
        return societyDutyId;
    }

    public void setSocietyDutyId(String societyDutyId) {
        this.societyDutyId = societyDutyId;
    }

    public String getSocietyDutyName() {
        return societyDutyName;
    }

    public void setSocietyDutyName(String societyDutyName) {
        this.societyDutyName = societyDutyName;
    }

    public String getPowerId() {
        return powerId;
    }

    public void setPowerId(String powerId) {
        this.powerId = powerId;
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