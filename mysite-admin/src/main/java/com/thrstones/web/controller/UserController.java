package com.thrstones.web.controller;

import com.thrstones.bean.User;
import com.thrstones.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 用户CRUD
 *
 * @Author ThrStones
 * @Created by ThrStones on 2017-12-04 14:59.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;


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
    public Page<User> userList(
            @RequestParam(value = "limit", required = true) int limit,
            @RequestParam(value = "offset", required = true) int offset,
            @RequestParam(value = "sort", required = false) String sort,
            @RequestParam(value = "sortOrder", required = false) String sortOrder,
            @RequestParam(value = "name", required = false) String name,
            @RequestParam(value = "email", required = false) String email,
            @RequestParam(value = "qq", required = false) String qq
    ) {

        Pageable pageable = new PageRequest((offset / limit), limit);
        Page<User> datas = userService.findAll(pageable);

        return datas;
    }

    /**
     * 返回user list页面
     */
    @RequestMapping("/getUserById.html")
    public String getUserById(Model model, @RequestParam(value = "id", required = true) int id) {
        User user = userService.findOne(id);
        model.addAttribute("user", user);
        return "user/detail";
    }

}
