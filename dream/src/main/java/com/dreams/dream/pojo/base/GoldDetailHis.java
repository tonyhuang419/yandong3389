package com.dreams.dream.pojo.base;

import java.io.Serializable;
import java.util.Date;

public class GoldDetailHis implements Serializable {
    private static final long serialVersionUID = 1L;

    private String goldDetailId;

    private Integer gold;

    private Date goldDetailDate;

    private String goldDetailType;

    private Date createDate;

    private Date updateDate;

    private String createUserId;

    private String updateUserId;

    public String getGoldDetailId() {
        return goldDetailId;
    }

    public void setGoldDetailId(String goldDetailId) {
        this.goldDetailId = goldDetailId;
    }

    public Integer getGold() {
        return gold;
    }

    public void setGold(Integer gold) {
        this.gold = gold;
    }

    public Date getGoldDetailDate() {
        return goldDetailDate;
    }

    public void setGoldDetailDate(Date goldDetailDate) {
        this.goldDetailDate = goldDetailDate;
    }

    public String getGoldDetailType() {
        return goldDetailType;
    }

    public void setGoldDetailType(String goldDetailType) {
        this.goldDetailType = goldDetailType;
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