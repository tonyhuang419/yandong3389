package com.tony.jee.pojo.base;

import java.io.Serializable;
import java.util.Date;

/**
 * 问题所属表
 */
public class AgQuestionBelong implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 系统主键
     */
    private String pkId;

    /**
     * 问题ID
     */
    private String qId;

    /**
     * 组织ID
     */
    private String organCode;

    /**
     * 分区ID
     */
    private String areaCode;

    /**
     * 领域ID
     */
    private String domainCode;

    /**
     * 当前标示
     */
    private String isvaild;

    /**
     * 审核人ID
     */
    private String checkPerson;

    /**
     * 审核人意见
     */
    private String checkProposal;

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
     * @return 问题ID
     */
    public String getqId() {
        return qId;
    }

    /**
     * @param qId 
	 *            问题ID
     */
    public void setqId(String qId) {
        this.qId = qId;
    }

    /**
     * @return 组织ID
     */
    public String getOrganCode() {
        return organCode;
    }

    /**
     * @param organCode 
	 *            组织ID
     */
    public void setOrganCode(String organCode) {
        this.organCode = organCode;
    }

    /**
     * @return 分区ID
     */
    public String getAreaCode() {
        return areaCode;
    }

    /**
     * @param areaCode 
	 *            分区ID
     */
    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    /**
     * @return 领域ID
     */
    public String getDomainCode() {
        return domainCode;
    }

    /**
     * @param domainCode 
	 *            领域ID
     */
    public void setDomainCode(String domainCode) {
        this.domainCode = domainCode;
    }

    /**
     * @return 当前标示
     */
    public String getIsvaild() {
        return isvaild;
    }

    /**
     * @param isvaild 
	 *            当前标示
     */
    public void setIsvaild(String isvaild) {
        this.isvaild = isvaild;
    }

    /**
     * @return 审核人ID
     */
    public String getCheckPerson() {
        return checkPerson;
    }

    /**
     * @param checkPerson 
	 *            审核人ID
     */
    public void setCheckPerson(String checkPerson) {
        this.checkPerson = checkPerson;
    }

    /**
     * @return 审核人意见
     */
    public String getCheckProposal() {
        return checkProposal;
    }

    /**
     * @param checkProposal 
	 *            审核人意见
     */
    public void setCheckProposal(String checkProposal) {
        this.checkProposal = checkProposal;
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