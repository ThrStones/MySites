package com.thrstones.web.controller;

import com.thrstones.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * 用户CRUD
 *
 * @Author ThrStones
 * @Created by ThrStones on 2017-12-04 14:59.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    /**
     * 返回user list页面
     */
    @RequestMapping("/userList.html")
    public String userlistHtml() {
        return "user/user";
    }
    /**
     * 获取user数据
     */
    @ResponseBody
    @RequestMapping("/userList")
    public List<User> userList() {
        List<User> userList = new ArrayList<User>();

        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setId(i);
            user.setName("张三"+i);

            userList.add(user);
        }

        return userList;
    }


}
