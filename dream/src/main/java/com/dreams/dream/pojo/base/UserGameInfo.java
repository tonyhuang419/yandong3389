package com.dreams.dream.pojo.base;

import java.io.Serializable;
import java.util.Date;

public class UserGameInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    private String userGameId;

    private String userId;

    private String gameId;

    private Date gameStartDate;

    private Date gameEndDate;

    /**
     * (0:以前玩的,1:正在玩)
     */
    private String gameFlag;

    private String gameServer;

    private String nickname;

    private String profession;

    public String getUserGameId() {
        return userGameId;
    }

    public void setUserGameId(String userGameId) {
        this.userGameId = userGameId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getGameId() {
        return gameId;
    }

    public void setGameId(String gameId) {
        this.gameId = gameId;
    }

    public Date getGameStartDate() {
        return gameStartDate;
    }

    public void setGameStartDate(Date gameStartDate) {
        this.gameStartDate = gameStartDate;
    }

    public Date getGameEndDate() {
        return gameEndDate;
    }

    public void setGameEndDate(Date gameEndDate) {
        this.gameEndDate = gameEndDate;
    }

    /**
     * @return (0:以前玩的,1:正在玩)
     */
    public String getGameFlag() {
        return gameFlag;
    }

    /**
     * @param gameFlag 
	 *            (0:以前玩的,1:正在玩)
     */
    public void setGameFlag(String gameFlag) {
        this.gameFlag = gameFlag;
    }

    public String getGameServer() {
        return gameServer;
    }

    public void setGameServer(String gameServer) {
        this.gameServer = gameServer;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }
}