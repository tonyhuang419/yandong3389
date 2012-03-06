package com.dreams.dream.pojo.base;

import java.io.Serializable;

public class ArticleTypeInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer articleTypeId;

    private String articleTypeName;

    public Integer getArticleTypeId() {
        return articleTypeId;
    }

    public void setArticleTypeId(Integer articleTypeId) {
        this.articleTypeId = articleTypeId;
    }

    public String getArticleTypeName() {
        return articleTypeName;
    }

    public void setArticleTypeName(String articleTypeName) {
        this.articleTypeName = articleTypeName;
    }
}