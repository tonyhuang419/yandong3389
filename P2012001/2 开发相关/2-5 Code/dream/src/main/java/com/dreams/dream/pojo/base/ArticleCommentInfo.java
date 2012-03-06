package com.dreams.dream.pojo.base;

import java.io.Serializable;
import java.util.Date;

public class ArticleCommentInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer articleCommentId;

    private Integer articleId;

    private String commentContent;

    private Integer commentUserId;

    private Date commentTime;

    /**
     * 0
     */
    private Integer verifyState;

    public Integer getArticleCommentId() {
        return articleCommentId;
    }

    public void setArticleCommentId(Integer articleCommentId) {
        this.articleCommentId = articleCommentId;
    }

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public Integer getCommentUserId() {
        return commentUserId;
    }

    public void setCommentUserId(Integer commentUserId) {
        this.commentUserId = commentUserId;
    }

    public Date getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }

    /**
     * @return 0
     */
    public Integer getVerifyState() {
        return verifyState;
    }

    /**
     * @param verifyState 
	 *            0
     */
    public void setVerifyState(Integer verifyState) {
        this.verifyState = verifyState;
    }
}