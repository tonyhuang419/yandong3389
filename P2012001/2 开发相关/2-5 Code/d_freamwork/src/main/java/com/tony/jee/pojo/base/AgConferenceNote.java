package com.tony.jee.pojo.base;

import java.io.Serializable;
import java.util.Date;

/**
 * 会议纪要表
 */
public class AgConferenceNote implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 系统主键
     */
    private String pkId;

    /**
     * 会议纪要id
     */
    private String conferenceId;

    /**
     * 文档名称
     */
    private String docName;

    /**
     * 所属分类
     */
    private String sortType;

    /**
     * 提供者
     */
    private String provider;

    /**
     * 内容
     */
    private String confContent;

    /**
     * 附件id
     */
    private String fileId;

    /**
     * 保密级别
     */
    private String securityClass;

    /**
     * 提供时间
     */
    private Date provideTime;

    /**
     * 录制人
     */
    private String makeEmp;

    /**
     * 录制时间
     */
    private Date makeDate;

    /**
     * 末次修改人
     */
    private String modifyEmp;

    /**
     * 末次修改时间
     */
    private Date modifyDate;

    /**
     * 公司码
     */
    private String compCode;

    /**
     * 系统码
     */
    private String sysCode;

    /**
     * @return 系统主键
     */
    public String getPkId() {
        return pkId;
    }

    /**
     * @param pkId 
	 *            系统主键
     */
    public void setPkId(String pkId) {
        this.pkId = pkId;
    }

    /**
     * @return 会议纪要id
     */
    public String getConferenceId() {
        return conferenceId;
    }

    /**
     * @param conferenceId 
	 *            会议纪要id
     */
    public void setConferenceId(String conferenceId) {
        this.conferenceId = conferenceId;
    }

    /**
     * @return 文档名称
     */
    public String getDocName() {
        return docName;
    }

    /**
     * @param docName 
	 *            文档名称
     */
    public void setDocName(String docName) {
        this.docName = docName;
    }

    /**
     * @return 所属分类
     */
    public String getSortType() {
        return sortType;
    }

    /**
     * @param sortType 
	 *            所属分类
     */
    public void setSortType(String sortType) {
        this.sortType = sortType;
    }

    /**
     * @return 提供者
     */
    public String getProvider() {
        return provider;
    }

    /**
     * @param provider 
	 *            提供者
     */
    public void setProvider(String provider) {
        this.provider = provider;
    }

    /**
     * @return 内容
     */
    public String getConfContent() {
        return confContent;
    }

    /**
     * @param confContent 
	 *            内容
     */
    public void setConfContent(String confContent) {
        this.confContent = confContent;
    }

    /**
     * @return 附件id
     */
    public String getFileId() {
        return fileId;
    }

    /**
     * @param fileId 
	 *            附件id
     */
    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    /**
     * @return 保密级别
     */
    public String getSecurityClass() {
        return securityClass;
    }

    /**
     * @param securityClass 
	 *            保密级别
     */
    public void setSecurityClass(String securityClass) {
        this.securityClass = securityClass;
    }

    /**
     * @return 提供时间
     */
    public Date getProvideTime() {
        return provideTime;
    }

    /**
     * @param provideTime 
	 *            提供时间
     */
    public void setProvideTime(Date provideTime) {
        this.provideTime = provideTime;
    }

    /**
     * @return 录制人
     */
    public String getMakeEmp() {
        return makeEmp;
    }

    /**
     * @param makeEmp 
	 *            录制人
     */
    public void setMakeEmp(String makeEmp) {
        this.makeEmp = makeEmp;
    }

    /**
     * @return 录制时间
     */
    public Date getMakeDate() {
        return makeDate;
    }

    /**
     * @param makeDate 
	 *            录制时间
     */
    public void setMakeDate(Date makeDate) {
        this.makeDate = makeDate;
    }

    /**
     * @return 末次修改人
     */
    public String getModifyEmp() {
        return modifyEmp;
    }

    /**
     * @param modifyEmp 
	 *            末次修改人
     */
    public void setModifyEmp(String modifyEmp) {
        this.modifyEmp = modifyEmp;
    }

    /**
     * @return 末次修改时间
     */
    public Date getModifyDate() {
        return modifyDate;
    }

    /**
     * @param modifyDate 
	 *            末次修改时间
     */
    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    /**
     * @return 公司码
     */
    public String getCompCode() {
        return compCode;
    }

    /**
     * @param compCode 
	 *            公司码
     */
    public void setCompCode(String compCode) {
        this.compCode = compCode;
    }

    /**
     * @return 系统码
     */
    public String getSysCode() {
        return sysCode;
    }

    /**
     * @param sysCode 
	 *            系统码
     */
    public void setSysCode(String sysCode) {
        this.sysCode = sysCode;
    }
}