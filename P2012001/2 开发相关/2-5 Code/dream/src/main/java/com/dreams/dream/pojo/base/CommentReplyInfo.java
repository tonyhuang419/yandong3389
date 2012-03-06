package com.dreams.dream.pojo.base;

import java.io.Serializable;
import java.util.Date;

public class CommentReplyInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer replyId;

    private Integer articleCommentId;

    private Integer commentType;

    private String replyContent;

    private Date replyTime;

    private Integer replyUserId;

    /**
     * 0
     */
    private Integer verifyState;

    public Integer getReplyId() {
        return replyId;
    }

    public void setReplyId(Integer replyId) {
        this.replyId = replyId;
    }

    public Integer getArticleCommentId() {
        return articleCommentId;
    }

    public void setArticleCommentId(Integer articleCommentId) {
        this.articleCommentId = articleCommentId;
    }

    public Integer getCommentType() {
        return commentType;
    }

    public void setCommentType(Integer commentType) {
        this.commentType = commentType;
    }

    public String getReplyContent() {
        return replyContent;
    }

    public void setReplyContent(String replyContent) {
        this.replyContent = replyContent;
    }

    public Date getReplyTime() {
        return replyTime;
    }

    public void setReplyTime(Date replyTime) {
        this.replyTime = replyTime;
    }

    public Integer getReplyUserId() {
        return replyUserId;
    }

    public void setReplyUserId(Integer replyUserId) {
        this.replyUserId = replyUserId;
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