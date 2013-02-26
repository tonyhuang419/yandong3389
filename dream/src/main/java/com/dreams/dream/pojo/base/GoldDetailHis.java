package com.dreams.dream.pojo.base;

import java.io.Serializable;
import java.util.Date;

public class GoldDetailHis implements Serializable {
    private static final long serialVersionUID = 1L;

    private String goldDetailId;

    private Integer gold;

    private Date goldDetailDate;

    private String goldDetailType;

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
}