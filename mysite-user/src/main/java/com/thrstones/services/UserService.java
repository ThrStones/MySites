package com.thrstones.services;

import com.thrstones.bean.User;
import com.thrstones.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户业务处理
 *
 * @Author ThrStones
 * @Created by ThrStones on 2017-12-05 14:13.
 */
@Service
public class UserService {

    @Autowired
    UserDao userDao;


//    public List<User> getUserListByPage(int limit, int offset, String sort, String sortOrder, String name, String email, String qq) {
//        List<User> userList = userDao.getUserListByPage(limit, offset, sort, sortOrder, name, email, qq);
//        return  userList;
//    }

    public Integer getUserCount() {
        Integer userCount = userDao.findAll().size();
        return userCount;
    }

    public Page<User> findAll(Pageable pageable) {
        return userDao.findAll(pageable);
    }
}
