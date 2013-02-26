package com.dreams.dream.pojo.base;

import java.io.Serializable;
import java.util.Date;

public class WeiboCommentInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    private String weiboCommentId;

    private String weiboId;

    private String userId;

    private String weiboCommentContent;

    private String citeUserId;

    private Date weiboCommentDate;

    public String getWeiboCommentId() {
        return weiboCommentId;
    }

    public void setWeiboCommentId(String weiboCommentId) {
        this.weiboCommentId = weiboCommentId;
    }

    public String getWeiboId() {
        return weiboId;
    }

    public void setWeiboId(String weiboId) {
        this.weiboId = weiboId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getWeiboCommentContent() {
        return weiboCommentContent;
    }

    public void setWeiboCommentContent(String weiboCommentContent) {
        this.weiboCommentContent = weiboCommentContent;
    }

    public String getCiteUserId() {
        return citeUserId;
    }

    public void setCiteUserId(String citeUserId) {
        this.citeUserId = citeUserId;
    }

    public Date getWeiboCommentDate() {
        return weiboCommentDate;
    }

    public void setWeiboCommentDate(Date weiboCommentDate) {
        this.weiboCommentDate = weiboCommentDate;
    }
}