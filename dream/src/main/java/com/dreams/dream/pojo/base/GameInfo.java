package com.dreams.dream.pojo.base;

import java.io.Serializable;

public class GameInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    private String gameId;

    private String gameName;

    private String gameLogoMin;

    private String gameLogoMax;

    /**
     * (公会管理中游戏分类)
     */
    private String gameUrl;

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
}