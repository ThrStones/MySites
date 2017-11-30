package com.thrstones.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.sql.Timestamp;

/**
 * Created by Administrator on 2017/11/16.
 */
@SuppressWarnings("serial")
@MappedSuperclass()
public class Base {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private Timestamp createtime;
    private Timestamp modifytime;
    private String remark;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Timestamp getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Timestamp createtime) {
        this.createtime = createtime;
    }

    public Timestamp getModifytime() {
        return modifytime;
    }

    public void setModifytime(Timestamp modifytime) {
        this.modifytime = modifytime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Base{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", createtime=" + createtime +
                ", modifytime=" + modifytime +
                ", remark='" + remark + '\'' +
                '}';
    }
}