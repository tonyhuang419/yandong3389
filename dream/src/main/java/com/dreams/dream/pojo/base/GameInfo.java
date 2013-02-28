package com.dreams.dream.pojo.base;

import java.io.Serializable;
import java.util.Date;

public class GameInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    private String gameId;

    private String gameName;

    private String gameNameEn;

    private String gameLogoMin;

    private String gameLogoMax;

    /**
     * (公会管理中游戏分类)
     */
    private String gameUrl;

    private Date createDate;

    private Date updateDate;

    private String createUserId;

    private String updateUserId;

    public String getGameId() {
        return gameId;
    }

    public void setGameId(String gameId) {
        this.gameId = gameId;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getGameNameEn() {
        return gameNameEn;
    }

    public void setGameNameEn(String gameNameEn) {
        this.gameNameEn = gameNameEn;
    }

    public String getGameLogoMin() {
        return gameLogoMin;
    }

    public void setGameLogoMin(String gameLogoMin) {
        this.gameLogoMin = gameLogoMin;
    }

    public String getGameLogoMax() {
        return gameLogoMax;
    }

    public void setGameLogoMax(String gameLogoMax) {
        this.gameLogoMax = gameLogoMax;
    }

    /**
     * @return (公会管理中游戏分类)
     */
    public String getGameUrl() {
        return gameUrl;
    }

    /**
     * @param gameUrl 
	 *            (公会管理中游戏分类)
     */
    public void setGameUrl(String gameUrl) {
        this.gameUrl = gameUrl;
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