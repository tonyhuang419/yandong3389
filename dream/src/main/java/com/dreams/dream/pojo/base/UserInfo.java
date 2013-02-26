package com.dreams.dream.pojo.base;

import java.io.Serializable;

public class UserInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    private String userId;

    private String userName;

    private String userSex;

    private String userAccountId;

    private String userIntro;

    private Integer userLevel;

    private Integer userLevelDetail;

    private Integer userGold;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getUserAccountId() {
        return userAccountId;
    }

    public void setUserAccountId(String userAccountId) {
        this.userAccountId = userAccountId;
    }

    public String getUserIntro() {
        return userIntro;
    }

    public void setUserIntro(String userIntro) {
        this.userIntro = userIntro;
    }

    public Integer getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(Integer userLevel) {
        this.userLevel = userLevel;
    }

    public Integer getUserLevelDetail() {
        return userLevelDetail;
    }

    public void setUserLevelDetail(Integer userLevelDetail) {
        this.userLevelDetail = userLevelDetail;
    }

    public Integer getUserGold() {
        return userGold;
    }

    public void setUserGold(Integer userGold) {
        this.userGold = userGold;
    }
}