package com.dreams.dream.pojo.base;

import java.io.Serializable;
import java.util.Date;

public class UserCommentInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer userCommentId;

    private Integer userId;

    private String commentContent;

    private String videoAddress;

    private Integer giftId;

    private String giftAddress;

    private String imagesAddress;

    private Integer commentUserId;

    private Date commentTime;

    /**
     * 0
     */
    private Integer verifyState;

    public Integer getUserCommentId() {
        return userCommentId;
    }

    public void setUserCommentId(Integer userCommentId) {
        this.userCommentId = userCommentId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public String getVideoAddress() {
        return videoAddress;
    }

    public void setVideoAddress(String videoAddress) {
        this.videoAddress = videoAddress;
    }

    public Integer getGiftId() {
        return giftId;
    }

    public void setGiftId(Integer giftId) {
        this.giftId = giftId;
    }

    public String getGiftAddress() {
        return giftAddress;
    }

    public void setGiftAddress(String giftAddress) {
        this.giftAddress = giftAddress;
    }

    public String getImagesAddress() {
        return imagesAddress;
    }

    public void setImagesAddress(String imagesAddress) {
        this.imagesAddress = imagesAddress;
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