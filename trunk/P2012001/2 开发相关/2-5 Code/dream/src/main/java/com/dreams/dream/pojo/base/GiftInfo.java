package com.dreams.dream.pojo.base;

import java.io.Serializable;

public class GiftInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer giftId;

    private String giftName;

    private Integer giftQuantity;

    private String giftImageAddress;

    public Integer getGiftId() {
        return giftId;
    }

    public void setGiftId(Integer giftId) {
        this.giftId = giftId;
    }

    public String getGiftName() {
        return giftName;
    }

    public void setGiftName(String giftName) {
        this.giftName = giftName;
    }

    public Integer getGiftQuantity() {
        return giftQuantity;
    }

    public void setGiftQuantity(Integer giftQuantity) {
        this.giftQuantity = giftQuantity;
    }

    public String getGiftImageAddress() {
        return giftImageAddress;
    }

    public void setGiftImageAddress(String giftImageAddress) {
        this.giftImageAddress = giftImageAddress;
    }
}