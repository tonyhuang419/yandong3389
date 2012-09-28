package com.tony.jee.pojo.base;

import java.io.Serializable;
import java.util.Date;

/**
 * 问题状态规则表
 */
public class AgQuestionStateRule implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 系统主键
     */
    private String pkId;

    /**
     * 状态ID
     */
    private String sId;

    /**
     * 下一状态
     */
    private String nextS;

    /**
     * 上一状态
     */
    private String prevS;

    /**
     * 状态规则
     */
    private String sRule;

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
     * @return 状态ID
     */
    public String getsId() {
        return sId;
    }

    /**
     * @param sId 
	 *            状态ID
     */
    public void setsId(String sId) {
        this.sId = sId;
    }

    /**
     * @return 下一状态
     */
    public String getNextS() {
        return nextS;
    }

    /**
     * @param nextS 
	 *            下一状态
     */
    public void setNextS(String nextS) {
        this.nextS = nextS;
    }

    /**
     * @return 上一状态
     */
    public String getPrevS() {
        return prevS;
    }

    /**
     * @param prevS 
	 *            上一状态
     */
    public void setPrevS(String prevS) {
        this.prevS = prevS;
    }

    /**
     * @return 状态规则
     */
    public String getsRule() {
        return sRule;
    }

    /**
     * @param sRule 
	 *            状态规则
     */
    public void setsRule(String sRule) {
        this.sRule = sRule;
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