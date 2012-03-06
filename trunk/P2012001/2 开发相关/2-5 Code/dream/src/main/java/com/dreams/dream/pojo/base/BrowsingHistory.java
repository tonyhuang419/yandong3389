package com.dreams.dream.pojo.base;

import java.io.Serializable;
import java.util.Date;

public class BrowsingHistory implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer browsingHistoryId;

    private Integer articleId;

    private Integer userId;

    private Date browseTime;

    private String ipAddress;

    public Integer getBrowsingHistoryId() {
        return browsingHistoryId;
    }

    public void setBrowsingHistoryId(Integer browsingHistoryId) {
        this.browsingHistoryId = browsingHistoryId;
    }

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getBrowseTime() {
        return browseTime;
    }

    public void setBrowseTime(Date browseTime) {
        this.browseTime = browseTime;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }
}