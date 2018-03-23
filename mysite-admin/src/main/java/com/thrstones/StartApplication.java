package com.thrstones;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/11/30.
 */
@RestController
@SpringBootApplication
public class StartApplication extends SpringBootServletInitializer {

//    public static void main(String[] args) throws Exception {
//        SpringApplication.run(StartApplication.class, args);
//    }


    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        // 注意这里要指向原先用main方法执行的Application启动类
        return builder.sources(StartApplication.class);
    }
}