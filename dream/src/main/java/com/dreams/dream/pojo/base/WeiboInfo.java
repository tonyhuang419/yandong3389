package com.dreams.dream.pojo.base;

import java.io.Serializable;
import java.util.Date;

public class WeiboInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    private String weiboId;

    private String weiboContent;

    private Integer weiboBrowseCount;

    private Integer weiboCommentCount;

    private String userId;

    private Date weiboCreateDate;

    public String getWeiboId() {
        return weiboId;
    }

    public void setWeiboId(String weiboId) {
        this.weiboId = weiboId;
    }

    public String getWeiboContent() {
        return weiboContent;
    }

    public void setWeiboContent(String weiboContent) {
        this.weiboContent = weiboContent;
    }

    public Integer getWeiboBrowseCount() {
        return weiboBrowseCount;
    }

    public void setWeiboBrowseCount(Integer weiboBrowseCount) {
        this.weiboBrowseCount = weiboBrowseCount;
    }

    public Integer getWeiboCommentCount() {
        return weiboCommentCount;
    }

    public void setWeiboCommentCount(Integer weiboCommentCount) {
        this.weiboCommentCount = weiboCommentCount;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Date getWeiboCreateDate() {
        return weiboCreateDate;
    }

    public void setWeiboCreateDate(Date weiboCreateDate) {
        this.weiboCreateDate = weiboCreateDate;
    }
}