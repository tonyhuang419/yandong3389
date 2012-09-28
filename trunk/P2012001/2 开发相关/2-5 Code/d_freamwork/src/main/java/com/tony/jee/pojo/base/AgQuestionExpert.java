package com.tony.jee.pojo.base;

import java.io.Serializable;
import java.util.Date;

/**
 * 专家意见表
 */
public class AgQuestionExpert implements Serializable {
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
     * 专家用户ID
     */
    private String expertPerson;

    /**
     * 专家意见
     */
    private String expertProposal;

    /**
     * 求助意见
     */
    private String helpProposal;

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
     * 是否有效
     */
    private String iscurrent;

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
     * @return 专家用户ID
     */
    public String getExpertPerson() {
        return expertPerson;
    }

    /**
     * @param expertPerson 
	 *            专家用户ID
     */
    public void setExpertPerson(String expertPerson) {
        this.expertPerson = expertPerson;
    }

    /**
     * @return 专家意见
     */
    public String getExpertProposal() {
        return expertProposal;
    }

    /**
     * @param expertProposal 
	 *            专家意见
     */
    public void setExpertProposal(String expertProposal) {
        this.expertProposal = expertProposal;
    }

    /**
     * @return 求助意见
     */
    public String getHelpProposal() {
        return helpProposal;
    }

    /**
     * @param helpProposal 
	 *            求助意见
     */
    public void setHelpProposal(String helpProposal) {
        this.helpProposal = helpProposal;
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

    /**
     * @return 是否有效
     */
    public String getIscurrent() {
        return iscurrent;
    }

    /**
     * @param iscurrent 
	 *            是否有效
     */
    public void setIscurrent(String iscurrent) {
        this.iscurrent = iscurrent;
    }
}