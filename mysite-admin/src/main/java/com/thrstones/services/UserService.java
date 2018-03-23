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

    public Page<User> findAll(Pageable pageable) {
        return userDao.findAll(pageable);
    }

    public User findOne(int id) {
        return userDao.findOne(id);
    }

    public User findUserByNameAndPassword(String name, String password) {
        return userDao.findUserByNameAndPassword(name, password);
    }
}
