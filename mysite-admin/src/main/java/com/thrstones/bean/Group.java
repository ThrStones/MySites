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
@Table(name = "ts_group")
public class Group extends Base {
    /**
     * 角色ID
     */
    @Column(name = "role_id")
    private int roleId;

    public Group() {
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }
}
