package com.thrstones.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
    @RequestMapping("/list.html")
    public String list() {
        return "user/list";
    }
}
