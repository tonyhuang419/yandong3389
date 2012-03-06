package com.dreams.dream.pojo.base;

import java.io.Serializable;

public class SystemConfigInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer systemConfigId;

    public Integer getSystemConfigId() {
        return systemConfigId;
    }

    public void setSystemConfigId(Integer systemConfigId) {
        this.systemConfigId = systemConfigId;
    }
}