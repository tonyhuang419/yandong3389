package com.dreams.dream.pojo.base;

import java.io.Serializable;

public class SocietyDutyInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    private String societyDutyId;

    private String societyDutyName;

    private String powerId;

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
}