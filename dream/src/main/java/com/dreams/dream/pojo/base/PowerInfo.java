package com.dreams.dream.pojo.base;

import java.io.Serializable;

public class PowerInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    private String powerId;

    private String powerUrl;

    public String getPowerId() {
        return powerId;
    }

    public void setPowerId(String powerId) {
        this.powerId = powerId;
    }

    public String getPowerUrl() {
        return powerUrl;
    }

    public void setPowerUrl(String powerUrl) {
        this.powerUrl = powerUrl;
    }
}