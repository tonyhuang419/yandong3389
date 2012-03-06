package com.dreams.dream.pojo.base;

import java.io.Serializable;
import java.util.Date;

public class UserInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer userId;

    private String loginName;

    private String loginPass;

    private String userMail;

    private String userName;

    /**
     * 0
     */
    private Integer userSex;

    private Date userBirthday;

    private String aboutMyself;

    /**
     * 0
     */
    private Integer isPublicMail;

    /**
     * 0
     */
    private Integer isSendMail;

    private Date registerTime;

    private byte[] nation;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getLoginPass() {
        return loginPass;
    }

    public void setLoginPass(String loginPass) {
        this.loginPass = loginPass;
    }

    public String getUserMail() {
        return userMail;
    }

    public void setUserMail(String userMail) {
        this.userMail = userMail;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return 0
     */
    public Integer getUserSex() {
        return userSex;
    }

    /**
     * @param userSex 
	 *            0
     */
    public void setUserSex(Integer userSex) {
        this.userSex = userSex;
    }

    public Date getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(Date userBirthday) {
        this.userBirthday = userBirthday;
    }

    public String getAboutMyself() {
        return aboutMyself;
    }

    public void setAboutMyself(String aboutMyself) {
        this.aboutMyself = aboutMyself;
    }

    /**
     * @return 0
     */
    public Integer getIsPublicMail() {
        return isPublicMail;
    }

    /**
     * @param isPublicMail 
	 *            0
     */
    public void setIsPublicMail(Integer isPublicMail) {
        this.isPublicMail = isPublicMail;
    }

    /**
     * @return 0
     */
    public Integer getIsSendMail() {
        return isSendMail;
    }

    /**
     * @param isSendMail 
	 *            0
     */
    public void setIsSendMail(Integer isSendMail) {
        this.isSendMail = isSendMail;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public byte[] getNation() {
        return nation;
    }

    public void setNation(byte[] nation) {
        this.nation = nation;
    }
}