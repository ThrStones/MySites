package com.thrstones.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 用户组表
 *
 * @Author ThrStones
 * @Created by ThrStones on 2017-12-04 13:15.
 */
@Entity
@Table(name = "group")
public class Group extends Base {
    /**
     * 角色ID
     */
    @Column(name = "user_role_id")
    private int roleID;

    public Group() {
    }

    @Override
    public String toString() {
        return "Group{" +
                "roleID=" + roleID +
                "} " + super.toString();
    }
}
