package com.thrstones.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/11/30.
 */
@Controller
@RequestMapping("/")
public class IndexController {
    /**
     * 返回login页面
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
}
