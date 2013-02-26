package com.dreams.dream.pojo.base;

import java.io.Serializable;

public class SociatyDutyInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    private String sociatyDutyId;

    private String sociatyDutyName;

    private String powerId;

    public String getSociatyDutyId() {
        return sociatyDutyId;
    }

    public void setSociatyDutyId(String sociatyDutyId) {
        this.sociatyDutyId = sociatyDutyId;
    }

    public String getSociatyDutyName() {
        return sociatyDutyName;
    }

    public void setSociatyDutyName(String sociatyDutyName) {
        this.sociatyDutyName = sociatyDutyName;
    }

    public String getPowerId() {
        return powerId;
    }

    public void setPowerId(String powerId) {
        this.powerId = powerId;
    }
}