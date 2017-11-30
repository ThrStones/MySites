package com.thrstones.web.controller;

import com.thrstones.bean.Demo;
import com.thrstones.services.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by yl on 2017/7/7.
 */
@Controller
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    DemoService demoService;

    /**
     * 返回list页面html
     */
    @RequestMapping("/demoHtml")
    public String demoHtml() {
        return "demo/list";
    }

    /**
     * 返回所有Demo List
     */
    @RequestMapping("/demoList")
    @ResponseBody
    public List<Demo> demoList() {
        return demoService.findAll();
    }
    /**
     * 新增、修改、删除
     */
    @RequestMapping(value = "/saveDemo", method = RequestMethod.POST)
    public String saveDemo(
            @RequestParam(value = "demoId", required = true) int demoId,
            @RequestParam(value = "account", required = true) String account,
            @RequestParam(value = "password", required = true) String password,
            @RequestParam(value = "activeYear", required = true) int activeYear,
            @RequestParam(value = "deleteFlag") String deleteFlag,
            ModelMap model) {

        if (deleteFlag.equals("")){
            Demo demo = null;
            if (demoId == 0) {
                demo = new Demo();
                demo.setAccount(account);
                demo.setPassword(password);
                demo.setActivite(false);
                demo.setActiveYear(activeYear);
                demo = demoService.save(demo);

                if (demo == null) {
                    model.put("msg", "fail");
                } else {
                    model.put("msg", "success");
                }

            } else {
//                Integer result = demoService.update(demoId,account,password,activeYear);

                demo = new Demo();
                demo.setDemoId(demoId);
                demo.setAccount(account);
                demo.setPassword(password);
                demo.setActivite(false);
                demo.setActiveYear(activeYear);

                Demo result = demoService.saveAndFlush(demo);

                if (result == null) {
                    model.put("msg", "fail");
                } else {
                    model.put("msg", "success");
                }

//                if (result == 0) {
//                    model.put("msg", "fail");
//                } else {
//                    model.put("msg", "success");
//                }
            }
        } else {
            demoService.deleteDemoById(demoId);
        }
        return "redirect:demoHtml";
    }

    /**
     * 返回demo
     */
    @RequestMapping("/getDemoById")
    @ResponseBody
    public Demo getdemoById(@RequestParam(value = "demoId", required = true) int demoId) {
        return demoService.findOne(demoId);
    }

}
