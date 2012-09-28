package com.tony.jee.pojo.base;

import java.io.Serializable;
import java.util.Date;

/**
 * 问题标准评分规则表
 */
public class AgQuestionScoreRule implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 系统主键
     */
    private String pkId;

    /**
     * 规则ID
     */
    private String ruleId;

    /**
     * 评分项
     */
    private String ruleProject;

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
     * 规则类别
     */
    private String ruleType;

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
     * @return 规则ID
     */
    public String getRuleId() {
        return ruleId;
    }

    /**
     * @param ruleId 
	 *            规则ID
     */
    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    /**
     * @return 评分项
     */
    public String getRuleProject() {
        return ruleProject;
    }

    /**
     * @param ruleProject 
	 *            评分项
     */
    public void setRuleProject(String ruleProject) {
        this.ruleProject = ruleProject;
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
     * @return 规则类别
     */
    public String getRuleType() {
        return ruleType;
    }

    /**
     * @param ruleType 
	 *            规则类别
     */
    public void setRuleType(String ruleType) {
        this.ruleType = ruleType;
    }
}