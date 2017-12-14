package com.thrstones.frontend.web.controller;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 实现ErrorController接口，处理404，500
 *
 * @Author ThrStones
 * @Created by ThrStones on 2017-12-14 17:28.
 */
@Controller
public class MainsiteErrorController implements ErrorController {
    private static final String ERROR_PATH = "/error";

    @RequestMapping(value = ERROR_PATH)
    public String handleError() {
        return "errorpage/error";
    }

    @Override
    public String getErrorPath() {
        return ERROR_PATH;
    }
}
