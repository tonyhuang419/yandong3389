package com.dreams.dream.pojo.base;

import java.io.Serializable;
import java.util.Date;

public class SocietyAnnouncementHis implements Serializable {
    private static final long serialVersionUID = 1L;

    private String announcementId;

    private String announcementContent;

    private String announcementCreateUserId;

    private Date announcementCreateDate;

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
}