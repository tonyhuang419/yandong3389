package com.dreams.dream.pojo.base;

import java.io.Serializable;
import java.util.Date;

public class ArticleInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer articleId;

    private String articleImage;

    private Date publishTime;

    private Integer userId;

    private Integer articleTypeId;

    private String videoAddress;

    private String articleKeywords;

    /**
     * 0
     */
    private Integer verifyState;

    private String articleContent;

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public String getArticleImage() {
        return articleImage;
    }

    public void setArticleImage(String articleImage) {
        this.articleImage = articleImage;
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getArticleTypeId() {
        return articleTypeId;
    }

    public void setArticleTypeId(Integer articleTypeId) {
        this.articleTypeId = articleTypeId;
    }

    public String getVideoAddress() {
        return videoAddress;
    }

    public void setVideoAddress(String videoAddress) {
        this.videoAddress = videoAddress;
    }

    public String getArticleKeywords() {
        return articleKeywords;
    }

    public void setArticleKeywords(String articleKeywords) {
        this.articleKeywords = articleKeywords;
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

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent;
    }
}