package com.thrstones.bean;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 角色表
 *
 * @Author ThrStones
 * @Created by ThrStones on 2017-12-04 13:14.
 */
@Entity
@Table(name = "ts_role")
public class Role extends Base {

    public Role() {
    }

    @Override
    public String toString() {
        return "Role{} " + super.toString();
    }
}
