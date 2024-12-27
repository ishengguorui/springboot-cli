package com.company.project.model;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import javax.persistence.*;

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "user_name")
    private String userName;

    private String password;

    /**
     * 头像连接
     */
    private String avatar;

    /**
     * 个人简介
     */
    private String introduction;

    /**
     * 0:普通用户 1:咨询师
     */
    private Byte role;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return user_name
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取头像连接
     *
     * @return avatar - 头像连接
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * 设置头像连接
     *
     * @param avatar 头像连接
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    /**
     * 获取个人简介
     *
     * @return introduction - 个人简介
     */
    public String getIntroduction() {
        return introduction;
    }

    /**
     * 设置个人简介
     *
     * @param introduction 个人简介
     */
    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    /**
     * 获取0:普通用户 1:咨询师
     *
     * @return role - 0:普通用户 1:咨询师
     */
    public Byte getRole() {
        return role;
    }

    /**
     * 设置0:普通用户 1:咨询师
     *
     * @param role 0:普通用户 1:咨询师
     */
    public void setRole(Byte role) {
        this.role = role;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}