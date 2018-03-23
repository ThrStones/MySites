package com.thrstones.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;
import java.sql.Timestamp;

/**
 * 用户表
 *
 * @Author ThrStones
 * @Created by ThrStones on 2017-12-04 11:58.
 */
@Entity
@Table(name = "ts_user")
public class User extends Base {

    /**
     * 用户昵称
     */
    @Column(name = "nickname", length = 50)
    private String nickname;
    /**
     * 用户密码
     */
    @Column(name = "password", length = 50)
    private String password;
    /**
     * 用户描述
     */
    @Lob
    @Column(name = "description")
    private String description;

    /**
     * 用户性别
     */
    @Column(name = "sex")
    private boolean sex;

    /**
     * 用户邮箱
     */
    @Column(name = "email", length = 20)
    private String email;

    /**
     * 用户电话
     */
    @Column(name = "phone", length = 20)
    private String phone;

    /**
     * 用户最新登录IP
     */
    @Column(name = "last_login_ip", length = 15)
    private String lastLoginIP;

    /**
     * 用户头像
     */
    @Column(name = "avatar")
    private String avatar;

    /**
     * 用户注册IP
     */
    @Column(name = "register_ip", length = 15)
    private String registerIP;

    /**
     * 用户最后登录时间
     */
    @Column(name = "last_login_time")
    private Timestamp lastLoginTime;

    /**
     * 用户QQ
     */
    @Column(name = "QQ", length = 15)
    private String qq;

    /**
     * 用户微博
     */
    @Column(name = "weibo")
    private String weibo;

    /**
     * 用户微信
     */
    @Column(name = "weichat")
    private String weichat;

    /**
     * 用户Github
     */
    @Column(name = "github")
    private String github;

    /**
     * 用户个性签名
     */
    @Lob
    @Column(name = "says")
    private String says;

    /**
     * 是否锁定
     */
    @Column(name = "isLock")
    private boolean isLock;

    /**
     * 组ID
     */
    @Column(name = "group_id")
    private int groupId;

    /**
     * 角色ID
     */
    @Column(name = "role_id")
    private int roleId;

    public User() {
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLastLoginIP() {
        return lastLoginIP;
    }

    public void setLastLoginIP(String lastLoginIP) {
        this.lastLoginIP = lastLoginIP;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getRegisterIP() {
        return registerIP;
    }

    public void setRegisterIP(String registerIP) {
        this.registerIP = registerIP;
    }

    public Timestamp getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Timestamp lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getWeibo() {
        return weibo;
    }

    public void setWeibo(String weibo) {
        this.weibo = weibo;
    }

    public String getWeichat() {
        return weichat;
    }

    public void setWeichat(String weichat) {
        this.weichat = weichat;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    public String getSays() {
        return says;
    }

    public void setSays(String says) {
        this.says = says;
    }

    public boolean isLock() {
        return isLock;
    }

    public void setLock(boolean lock) {
        isLock = lock;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }
}