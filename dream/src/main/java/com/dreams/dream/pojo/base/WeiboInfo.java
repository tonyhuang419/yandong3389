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

    private Date createDate;

    private Date updateDate;

    private String createUserId;

    private String updateUserId;

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