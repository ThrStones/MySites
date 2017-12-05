package com.thrstones.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;

/**
 * 用户表
 *
 * @Author ThrStones
 * @Created by ThrStones on 2017-12-04 11:58.
 */
@Entity
@Table(name = "user")
public class User extends Base {

    /**
     * 用户密码
     */
    @Column(name = "user_password")
    private String userPassword;

    /**
     * 用户性别
     */
    @Column(name = "user_sex")
    private int userSex;

    /**
     * 用户邮箱
     */
    @Column(name = "user_email")
    private String userEmail;

    /**
     * 用户电话
     */
    @Column(name = "user_phone")
    private String userPhone;

    /**
     * 用户最新登录IP
     */
    @Column(name = "user_last_login_ip")
    private String userLastLoginIP;

    /**
     * 用户头像
     */
    @Column(name = "user_avatar")
    private String userAvatar;

    /**
     * 用户注册IP
     */
    @Column(name = "user_register_ip")
    private String userRegisterIP;

    /**
     * 用户最后登录时间
     */
    @Column(name = "user_last_login_time")
    private Timestamp userLastLoginTime;

    /**
     * 用户QQ
     */
    @Column(name = "user_QQ")
    private String userQQ;

    /**
     * 用户微博
     */
    @Column(name = "user_weibo")
    private String userWeiBo;

    /**
     * 用户微信
     */
    @Column(name = "user_weichat")
    private String userWeiChat;

    /**
     * 用户Github
     */
    @Column(name = "user_github")
    private String userGithub;

    /**
     * 用户个性签名
     */
    @Column(name = "user_says")
    private String userSays;

    /**
     * 是否锁定
     */
    @Column(name = "user_lock")
    private int userLock;

    /**
     * 组ID
     */
    @Column(name = "user_group_id")
    private int groupID;

    /**
     * 角色ID
     */
    @Column(name = "user_role_id")
    private int roleID;

    public User() {
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public int getUserSex() {
        return userSex;
    }

    public void setUserSex(int userSex) {
        this.userSex = userSex;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserLastLoginIP() {
        return userLastLoginIP;
    }

    public void setUserLastLoginIP(String userLastLoginIP) {
        this.userLastLoginIP = userLastLoginIP;
    }

    public String getUserAvatar() {
        return userAvatar;
    }

    public void setUserAvatar(String userAvatar) {
        this.userAvatar = userAvatar;
    }

    public String getUserRegisterIP() {
        return userRegisterIP;
    }

    public void setUserRegisterIP(String userRegisterIP) {
        this.userRegisterIP = userRegisterIP;
    }

    public Timestamp getUserLastLoginTime() {
        return userLastLoginTime;
    }

    public void setUserLastLoginTime(Timestamp userLastLoginTime) {
        this.userLastLoginTime = userLastLoginTime;
    }

    public String getUserQQ() {
        return userQQ;
    }

    public void setUserQQ(String userQQ) {
        this.userQQ = userQQ;
    }

    public String getUserWeiBo() {
        return userWeiBo;
    }

    public void setUserWeiBo(String userWeiBo) {
        this.userWeiBo = userWeiBo;
    }

    public String getUserWeiChat() {
        return userWeiChat;
    }

    public void setUserWeiChat(String userWeiChat) {
        this.userWeiChat = userWeiChat;
    }

    public String getUserGithub() {
        return userGithub;
    }

    public void setUserGithub(String userGithub) {
        this.userGithub = userGithub;
    }

    public String getUserSays() {
        return userSays;
    }

    public void setUserSays(String userSays) {
        this.userSays = userSays;
    }

    public int getUserLock() {
        return userLock;
    }

    public void setUserLock(int userLock) {
        this.userLock = userLock;
    }

    public int getGroupID() {
        return groupID;
    }

    public void setGroupID(int groupID) {
        this.groupID = groupID;
    }

    public int getRoleID() {
        return roleID;
    }

    public void setRoleID(int roleID) {
        this.roleID = roleID;
    }

    @Override
    public String toString() {
        return "User{" +
                "userPassword='" + userPassword + '\'' +
                ", userSex=" + userSex +
                ", userEmail='" + userEmail + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", userLastLoginIP='" + userLastLoginIP + '\'' +
                ", userAvatar='" + userAvatar + '\'' +
                ", userRegisterIP='" + userRegisterIP + '\'' +
                ", userLastLoginTime=" + userLastLoginTime +
                ", userQQ='" + userQQ + '\'' +
                ", userWeiBo='" + userWeiBo + '\'' +
                ", userWeiChat='" + userWeiChat + '\'' +
                ", userGithub='" + userGithub + '\'' +
                ", userSays='" + userSays + '\'' +
                ", userLock=" + userLock +
                ", groupID=" + groupID +
                ", roleID=" + roleID +
                "} " + super.toString();
    }
}