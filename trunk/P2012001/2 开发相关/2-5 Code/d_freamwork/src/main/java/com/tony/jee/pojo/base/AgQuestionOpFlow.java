package com.tony.jee.pojo.base;

import java.io.Serializable;
import java.util.Date;

/**
 * 问题操作流程表
 */
public class AgQuestionOpFlow implements Serializable {
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
     * 操作类型
     */
    private String opType;

    /**
     * 操作人ID
     */
    private String opPerson;

    /**
     * 操作时间
     */
    private Date opTime;

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
     * @return 操作类型
     */
    public String getOpType() {
        return opType;
    }

    /**
     * @param opType 
	 *            操作类型
     */
    public void setOpType(String opType) {
        this.opType = opType;
    }

    /**
     * @return 操作人ID
     */
    public String getOpPerson() {
        return opPerson;
    }

    /**
     * @param opPerson 
	 *            操作人ID
     */
    public void setOpPerson(String opPerson) {
        this.opPerson = opPerson;
    }

    /**
     * @return 操作时间
     */
    public Date getOpTime() {
        return opTime;
    }

    /**
     * @param opTime 
	 *            操作时间
     */
    public void setOpTime(Date opTime) {
        this.opTime = opTime;
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