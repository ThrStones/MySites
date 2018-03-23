package com.thrstones.app.api;

import com.thrstones.bean.User;
import com.thrstones.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * App用户管理
 *
 * @Author ThrStones
 * @Created by ThrStones on 2018-03-22 13:49.
 */
@Controller
@RequestMapping("/appUser")
public class AppUserController {

    @Autowired
    private UserService userService;

    /**
     * 用户通过app登录
     *
     * @param
     */
    @ResponseBody
    @RequestMapping("/login.json")
    public User login(Model model,
                      @RequestParam(value = "name", required = true) String name,
                      @RequestParam(value = "password", required = true) String password
    ) {
        User user = userService.findUserByNameAndPassword(name, password);
        model.addAttribute("user", user);
        return user;
    }

}
