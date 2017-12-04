package com.thrstones.bean;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 权限表
 *
 * @Author ThrStones
 * @Created by ThrStones on 2017-12-04 13:17.
 */
@Entity
@Table(name = "permission")
public class Permission extends Base {

    public Permission() {
    }

    @Override
    public String toString() {
        return "Permission{} " + super.toString();
    }
}
