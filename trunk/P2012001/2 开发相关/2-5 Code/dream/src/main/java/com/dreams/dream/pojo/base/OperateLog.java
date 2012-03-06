package com.dreams.dream.pojo.base;

import java.io.Serializable;
import java.util.Date;

public class OperateLog implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer operateLogId;

    private String operateContent;

    private String operateTarget;

    private Date operateTime;

    private String operateResult;

    private Integer operateUserId;

    public Integer getOperateLogId() {
        return operateLogId;
    }

    public void setOperateLogId(Integer operateLogId) {
        this.operateLogId = operateLogId;
    }

    public String getOperateContent() {
        return operateContent;
    }

    public void setOperateContent(String operateContent) {
        this.operateContent = operateContent;
    }

    public String getOperateTarget() {
        return operateTarget;
    }

    public void setOperateTarget(String operateTarget) {
        this.operateTarget = operateTarget;
    }

    public Date getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(Date operateTime) {
        this.operateTime = operateTime;
    }

    public String getOperateResult() {
        return operateResult;
    }

    public void setOperateResult(String operateResult) {
        this.operateResult = operateResult;
    }

    public Integer getOperateUserId() {
        return operateUserId;
    }

    public void setOperateUserId(Integer operateUserId) {
        this.operateUserId = operateUserId;
    }
}