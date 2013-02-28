package com.dreams.dream.pojo.base;

import java.io.Serializable;
import java.util.Date;

public class LevelInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    private String levelId;

    private Integer level;

    private Integer levelDetailStart;

    private Integer levelDetailEnd;

    private String levelName;

    private Date createDate;

    private Date updateDate;

    private String createUserId;

    private String updateUserId;

    public String getLevelId() {
        return levelId;
    }

    public void setLevelId(String levelId) {
        this.levelId = levelId;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getLevelDetailStart() {
        return levelDetailStart;
    }

    public void setLevelDetailStart(Integer levelDetailStart) {
        this.levelDetailStart = levelDetailStart;
    }

    public Integer getLevelDetailEnd() {
        return levelDetailEnd;
    }

    public void setLevelDetailEnd(Integer levelDetailEnd) {
        this.levelDetailEnd = levelDetailEnd;
    }

    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName;
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