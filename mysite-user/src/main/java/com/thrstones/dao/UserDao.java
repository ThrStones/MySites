package com.thrstones.dao;

import com.thrstones.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * 用户数据库查询
 *
 * @Author ThrStones
 * @Created by ThrStones on 2017-12-05 14:17.
 */

public interface UserDao extends JpaRepository<User,Integer> , JpaSpecificationExecutor<User> {

    //SELECT *  FROM user  WHERE name like '%admin%' AND id > 0 ORDER BY id ASC LIMIT 10;  order by ?3 ?4 limit ?2
//    @Query(value = "select bean from User bean where bean.name like ?5 and bean.email like ?6 and bean.qq like ?7 and id > ( ?1 * ?2 ) ")
//    List<User> getUserListByPage(int limit, int offset, String sort, String sortOrder, String name, String email, String qq);
}
