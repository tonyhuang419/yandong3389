package com.dreams.dream.pojo.base;

import java.io.Serializable;

public class SupportInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer supportId;

    private Integer articleId;

    private Integer supportUserId;

    public Integer getSupportId() {
        return supportId;
    }

    public void setSupportId(Integer supportId) {
        this.supportId = supportId;
    }

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public Integer getSupportUserId() {
        return supportUserId;
    }

    public void setSupportUserId(Integer supportUserId) {
        this.supportUserId = supportUserId;
    }
}