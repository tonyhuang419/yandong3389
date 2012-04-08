package com.dreams.dream.pojo.base;

import java.io.Serializable;

public class SystemConfigInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer systemConfigId;

    private String testName;

    public Integer getSystemConfigId() {
        return systemConfigId;
    }

    public void setSystemConfigId(Integer systemConfigId) {
        this.systemConfigId = systemConfigId;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }
}