package com.thrstones.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 登录注册
 *
 * @Author ThrStones
 * @Created by ThrStones on 2017-12-01 17:25.
 */
@Controller
@RequestMapping("/login")
public class LoginController {
    /**
     * 返回login页面
     * 如果session中有用户,直接跳转index
     */
    @RequestMapping("/")
    public String login() {
        return "login/login";
    }

    /**
     * 返回index页面
     */
    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    /**
     * 返回register页面
     */
    @RequestMapping("/register")
    public String register() {
        return "login/login";
    }
}
