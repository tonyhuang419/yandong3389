package com.dreams.dream.pojo.base;

import java.io.Serializable;
import java.util.Date;

public class UserLevelDetailHis implements Serializable {
    private static final long serialVersionUID = 1L;

    private String levelDetailId;

    private String userId;

    private Integer levelDetailVal;

    private Date levelDetailDate;

    private String levelDetailType;

    public String getLevelDetailId() {
        return levelDetailId;
    }

    public void setLevelDetailId(String levelDetailId) {
        this.levelDetailId = levelDetailId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getLevelDetailVal() {
        return levelDetailVal;
    }

    public void setLevelDetailVal(Integer levelDetailVal) {
        this.levelDetailVal = levelDetailVal;
    }

    public Date getLevelDetailDate() {
        return levelDetailDate;
    }

    public void setLevelDetailDate(Date levelDetailDate) {
        this.levelDetailDate = levelDetailDate;
    }

    public String getLevelDetailType() {
        return levelDetailType;
    }

    public void setLevelDetailType(String levelDetailType) {
        this.levelDetailType = levelDetailType;
    }
}