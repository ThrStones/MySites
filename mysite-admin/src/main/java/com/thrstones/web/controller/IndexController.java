package com.thrstones.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author ThrStones
 * Created by Administrator on 2017/11/30.
 */
@Controller
@RequestMapping("/index")
public class IndexController {

    /**
     * 返回index页面
     */
    @RequestMapping("/index.html")
    public String indexHtml() {
        return "index";
    }
}
