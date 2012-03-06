package com.dreams.dream.pojo.base;

import java.io.Serializable;

public class SubscribeInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer subscribeId;

    private Integer userId;

    private Integer subscribeUserId;

    public Integer getSubscribeId() {
        return subscribeId;
    }

    public void setSubscribeId(Integer subscribeId) {
        this.subscribeId = subscribeId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getSubscribeUserId() {
        return subscribeUserId;
    }

    public void setSubscribeUserId(Integer subscribeUserId) {
        this.subscribeUserId = subscribeUserId;
    }
}