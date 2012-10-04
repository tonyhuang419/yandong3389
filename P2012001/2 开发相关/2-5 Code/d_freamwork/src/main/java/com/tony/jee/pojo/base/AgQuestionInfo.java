package com.tony.jee.pojo.base;

import java.io.Serializable;
import java.util.Date;

/**
 * 问题信息表
 */
public class AgQuestionInfo implements Serializable {
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
     * 问题名称
     */
    private String qName;

    /**
     * 问题描述
     */
    private String qDescription;

    /**
     * 问题状态
     */
    private String qState;

    /**
     * 提出人ID
     */
    private String dishId;

    /**
     * 提出人联系方式
     */
    private String dishContact;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 提出人部门
     */
    private String dishDept;

    /**
     * 共同完成人
     */
    private String othenDish;

    /**
     * 初步方案
     */
    private String initProgram;

    /**
     * 负责人ID
     */
    private String resId;

    /**
     * 是否分享
     */
    private String isshare;

    /**
     * 创建人ID
     */
    private String createPersonId;

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
     * 总评分
     */
    private String allcount;

    /**
     * 提出人职务
     */
    private String dishDuty;

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
     * @return 问题名称
     */
    public String getqName() {
        return qName;
    }

    /**
     * @param qName 
	 *            问题名称
     */
    public void setqName(String qName) {
        this.qName = qName;
    }

    /**
     * @return 问题描述
     */
    public String getqDescription() {
        return qDescription;
    }

    /**
     * @param qDescription 
	 *            问题描述
     */
    public void setqDescription(String qDescription) {
        this.qDescription = qDescription;
    }

    /**
     * @return 问题状态
     */
    public String getqState() {
        return qState;
    }

    /**
     * @param qState 
	 *            问题状态
     */
    public void setqState(String qState) {
        this.qState = qState;
    }

    /**
     * @return 提出人ID
     */
    public String getDishId() {
        return dishId;
    }

    /**
     * @param dishId 
	 *            提出人ID
     */
    public void setDishId(String dishId) {
        this.dishId = dishId;
    }

    /**
     * @return 提出人联系方式
     */
    public String getDishContact() {
        return dishContact;
    }

    /**
     * @param dishContact 
	 *            提出人联系方式
     */
    public void setDishContact(String dishContact) {
        this.dishContact = dishContact;
    }

    /**
     * @return 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime 
	 *            创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return 提出人部门
     */
    public String getDishDept() {
        return dishDept;
    }

    /**
     * @param dishDept 
	 *            提出人部门
     */
    public void setDishDept(String dishDept) {
        this.dishDept = dishDept;
    }

    /**
     * @return 共同完成人
     */
    public String getOthenDish() {
        return othenDish;
    }

    /**
     * @param othenDish 
	 *            共同完成人
     */
    public void setOthenDish(String othenDish) {
        this.othenDish = othenDish;
    }

    /**
     * @return 初步方案
     */
    public String getInitProgram() {
        return initProgram;
    }

    /**
     * @param initProgram 
	 *            初步方案
     */
    public void setInitProgram(String initProgram) {
        this.initProgram = initProgram;
    }

    /**
     * @return 负责人ID
     */
    public String getResId() {
        return resId;
    }

    /**
     * @param resId 
	 *            负责人ID
     */
    public void setResId(String resId) {
        this.resId = resId;
    }

    /**
     * @return 是否分享
     */
    public String getIsshare() {
        return isshare;
    }

    /**
     * @param isshare 
	 *            是否分享
     */
    public void setIsshare(String isshare) {
        this.isshare = isshare;
    }

    /**
     * @return 创建人ID
     */
    public String getCreatePersonId() {
        return createPersonId;
    }

    /**
     * @param createPersonId 
	 *            创建人ID
     */
    public void setCreatePersonId(String createPersonId) {
        this.createPersonId = createPersonId;
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
     * @return 总评分
     */
    public String getAllcount() {
        return allcount;
    }

    /**
     * @param allcount 
	 *            总评分
     */
    public void setAllcount(String allcount) {
        this.allcount = allcount;
    }

    /**
     * @return 提出人职务
     */
    public String getDishDuty() {
        return dishDuty;
    }

    /**
     * @param dishDuty 
	 *            提出人职务
     */
    public void setDishDuty(String dishDuty) {
        this.dishDuty = dishDuty;
    }
}