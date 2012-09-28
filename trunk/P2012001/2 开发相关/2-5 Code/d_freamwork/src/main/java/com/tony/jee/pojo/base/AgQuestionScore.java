package com.tony.jee.pojo.base;

import java.io.Serializable;
import java.util.Date;

/**
 * 问题评分表
 */
public class AgQuestionScore implements Serializable {
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
     * 评分人ID
     */
    private String scorePerson;

    /**
     * 评分时间
     */
    private Date scoreTime;

    /**
     * 规则ID
     */
    private String scoreRuleId;

    /**
     * 得分
     */
    private String resScore;

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
     * @return 评分人ID
     */
    public String getScorePerson() {
        return scorePerson;
    }

    /**
     * @param scorePerson 
	 *            评分人ID
     */
    public void setScorePerson(String scorePerson) {
        this.scorePerson = scorePerson;
    }

    /**
     * @return 评分时间
     */
    public Date getScoreTime() {
        return scoreTime;
    }

    /**
     * @param scoreTime 
	 *            评分时间
     */
    public void setScoreTime(Date scoreTime) {
        this.scoreTime = scoreTime;
    }

    /**
     * @return 规则ID
     */
    public String getScoreRuleId() {
        return scoreRuleId;
    }

    /**
     * @param scoreRuleId 
	 *            规则ID
     */
    public void setScoreRuleId(String scoreRuleId) {
        this.scoreRuleId = scoreRuleId;
    }

    /**
     * @return 得分
     */
    public String getResScore() {
        return resScore;
    }

    /**
     * @param resScore 
	 *            得分
     */
    public void setResScore(String resScore) {
        this.resScore = resScore;
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