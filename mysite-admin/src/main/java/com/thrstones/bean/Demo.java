package com.thrstones.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Administrator on 2017/11/16.
 */
@Entity
@Table(name = "demo")
public class Demo {
    @Id
    @GeneratedValue
    private int demoId;
    private String account;
    private String password;
    private String imei;
    private String activeTime;
    private boolean activite;
    private int activeYear;

    public int getDemoId() {
        return demoId;
    }

    public void setDemoId(int demoId) {
        this.demoId = demoId;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getActiveTime() {
        return activeTime;
    }

    public void setActiveTime(String activeTime) {
        this.activeTime = activeTime;
    }

    public boolean isActivite() {
        return activite;
    }

    public void setActivite(boolean activite) {
        this.activite = activite;
    }

    public int getActiveYear() {
        return activeYear;
    }

    public void setActiveYear(int activeYear) {
        this.activeYear = activeYear;
    }

    @Override
    public String toString() {
        return "Demo{" +
                "demoId=" + demoId +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", imei='" + imei + '\'' +
                ", activeTime='" + activeTime + '\'' +
                ", activite=" + activite +
                ", activeYear=" + activeYear +
                '}';
    }
}