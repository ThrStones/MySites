package com.thrstones.dao;

import com.thrstones.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

/**
 * 用户数据库查询
 *
 * @Author ThrStones
 * @Created by ThrStones on 2017-12-05 14:17.
 */

public interface UserDao extends JpaRepository<User,Integer> , JpaSpecificationExecutor<User> {

    @Query(value = "select bean from User bean where bean.name=?1 and bean.password=?2")
    User findUserByNameAndPassword(String name, String password);

}
