package com.dreams.dream.pojo.base;

import java.io.Serializable;
import java.util.Date;

public class SocietyAnnouncementHis implements Serializable {
    private static final long serialVersionUID = 1L;

    private String announcementId;

    private String announcementContent;

    private String announcementCreateUserId;

    private Date announcementCreateDate;

    private Date createDate;

    private Date updateDate;

    private String createUserId;

    private String updateUserId;

    public String getAnnouncementId() {
        return announcementId;
    }

    public void setAnnouncementId(String announcementId) {
        this.announcementId = announcementId;
    }

    public String getAnnouncementContent() {
        return announcementContent;
    }

    public void setAnnouncementContent(String announcementContent) {
        this.announcementContent = announcementContent;
    }

    public String getAnnouncementCreateUserId() {
        return announcementCreateUserId;
    }

    public void setAnnouncementCreateUserId(String announcementCreateUserId) {
        this.announcementCreateUserId = announcementCreateUserId;
    }

    public Date getAnnouncementCreateDate() {
        return announcementCreateDate;
    }

    public void setAnnouncementCreateDate(Date announcementCreateDate) {
        this.announcementCreateDate = announcementCreateDate;
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