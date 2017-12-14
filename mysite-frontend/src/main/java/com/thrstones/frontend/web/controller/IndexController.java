package com.thrstones.frontend.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/11/30.
 */
@Controller
@RequestMapping("/")
public class IndexController {

    /**
     * 返回index页面
     */
    @RequestMapping("/")
    public String indexHtml() {
        return "index";
    }
}
