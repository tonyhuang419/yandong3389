package com.dreams.dream.pojo.base;

import java.io.Serializable;
import java.util.Date;

public class SocietyInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    private String societyId;

    private String societyName;

    private String societyCreateUserId;

    private Date societyCreateDate;

    private String societyIntro;

    private String societyAnnouncement;

    private String societyLogo;

    private Integer societyUserCount;

    private Integer societyActive;

    private Integer societyActiveRanking;

    private Integer societyUserCountRanking;

    private String parentSocietyId;

    private String gameId;

    private String gameServer;

    private Date createDate;

    private Date updateDate;

    private String createUserId;

    private String updateUserId;

    public String getSocietyId() {
        return societyId;
    }

    public void setSocietyId(String societyId) {
        this.societyId = societyId;
    }

    public String getSocietyName() {
        return societyName;
    }

    public void setSocietyName(String societyName) {
        this.societyName = societyName;
    }

    public String getSocietyCreateUserId() {
        return societyCreateUserId;
    }

    public void setSocietyCreateUserId(String societyCreateUserId) {
        this.societyCreateUserId = societyCreateUserId;
    }

    public Date getSocietyCreateDate() {
        return societyCreateDate;
    }

    public void setSocietyCreateDate(Date societyCreateDate) {
        this.societyCreateDate = societyCreateDate;
    }

    public String getSocietyIntro() {
        return societyIntro;
    }

    public void setSocietyIntro(String societyIntro) {
        this.societyIntro = societyIntro;
    }

    public String getSocietyAnnouncement() {
        return societyAnnouncement;
    }

    public void setSocietyAnnouncement(String societyAnnouncement) {
        this.societyAnnouncement = societyAnnouncement;
    }

    public String getSocietyLogo() {
        return societyLogo;
    }

    public void setSocietyLogo(String societyLogo) {
        this.societyLogo = societyLogo;
    }

    public Integer getSocietyUserCount() {
        return societyUserCount;
    }

    public void setSocietyUserCount(Integer societyUserCount) {
        this.societyUserCount = societyUserCount;
    }

    public Integer getSocietyActive() {
        return societyActive;
    }

    public void setSocietyActive(Integer societyActive) {
        this.societyActive = societyActive;
    }

    public Integer getSocietyActiveRanking() {
        return societyActiveRanking;
    }

    public void setSocietyActiveRanking(Integer societyActiveRanking) {
        this.societyActiveRanking = societyActiveRanking;
    }

    public Integer getSocietyUserCountRanking() {
        return societyUserCountRanking;
    }

    public void setSocietyUserCountRanking(Integer societyUserCountRanking) {
        this.societyUserCountRanking = societyUserCountRanking;
    }

    public String getParentSocietyId() {
        return parentSocietyId;
    }

    public void setParentSocietyId(String parentSocietyId) {
        this.parentSocietyId = parentSocietyId;
    }

    public String getGameId() {
        return gameId;
    }

    public void setGameId(String gameId) {
        this.gameId = gameId;
    }

    public String getGameServer() {
        return gameServer;
    }

    public void setGameServer(String gameServer) {
        this.gameServer = gameServer;
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