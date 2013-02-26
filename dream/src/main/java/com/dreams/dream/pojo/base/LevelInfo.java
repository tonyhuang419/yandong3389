package com.dreams.dream.pojo.base;

import java.io.Serializable;

public class LevelInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    private String levelId;

    private Integer level;

    private Integer levelDetailStart;

    private Integer levelDetailEnd;

    private String levelName;

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
}