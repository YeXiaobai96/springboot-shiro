package com.wm.springboot.model.entity;

import java.io.Serializable;
import java.util.Date;

public class SysUser implements Serializable {
    /**
     * ID
     *
     * @mbggenerated
     */
    private String id;

    /**
     * 组织id
     *
     * @mbggenerated
     */
    private String orgId;

    /**
     * 编码
     *
     * @mbggenerated
     */
    private String code;

    /**
     * 姓名
     *
     * @mbggenerated
     */
    private String name;

    /**
     * 密码
     *
     * @mbggenerated
     */
    private String password;

    /**
     * 密码盐
     *
     * @mbggenerated
     */
    private String salt;

    /**
     * 联系方式
     *
     * @mbggenerated
     */
    private String mobile;

    /**
     * 用户1 系统 0普通
     *
     * @mbggenerated
     */
    private Integer isSysUser;

    /**
     * 创建者id
     *
     * @mbggenerated
     */
    private String createdByID;

    /**
     * 创建时间
     *
     * @mbggenerated
     */
    private Date createdOn;

    /**
     * 修改者id
     *
     * @mbggenerated
     */
    private String modifiedByID;

    /**
     * 修改时间
     *
     * @mbggenerated
     */
    private Date modifiedOn;

    /**
     * 序列
     *
     * @mbggenerated
     */
    private Integer seq;

    /**
     * 备注
     *
     * @mbggenerated
     */
    private String memo;

    /**
     * 状态值
     *
     * @mbggenerated
     */
    private Integer status;

    /**
     * 0有效,1删除
     *
     * @mbggenerated
     */
    private Integer delFlag;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Integer getIsSysUser() {
        return isSysUser;
    }

    public void setIsSysUser(Integer isSysUser) {
        this.isSysUser = isSysUser;
    }

    public String getCreatedByID() {
        return createdByID;
    }

    public void setCreatedByID(String createdByID) {
        this.createdByID = createdByID;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public String getModifiedByID() {
        return modifiedByID;
    }

    public void setModifiedByID(String modifiedByID) {
        this.modifiedByID = modifiedByID;
    }

    public Date getModifiedOn() {
        return modifiedOn;
    }

    public void setModifiedOn(Date modifiedOn) {
        this.modifiedOn = modifiedOn;
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orgId=").append(orgId);
        sb.append(", code=").append(code);
        sb.append(", name=").append(name);
        sb.append(", password=").append(password);
        sb.append(", salt=").append(salt);
        sb.append(", mobile=").append(mobile);
        sb.append(", isSysUser=").append(isSysUser);
        sb.append(", createdByID=").append(createdByID);
        sb.append(", createdOn=").append(createdOn);
        sb.append(", modifiedByID=").append(modifiedByID);
        sb.append(", modifiedOn=").append(modifiedOn);
        sb.append(", seq=").append(seq);
        sb.append(", memo=").append(memo);
        sb.append(", status=").append(status);
        sb.append(", delFlag=").append(delFlag);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}