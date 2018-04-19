package com.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.model.User;
import com.service.RedisService;
import com.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TestController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Reference(version = "1.0.0")
    private TestService testService;
    @Reference(version = "1.0.0")
    private RedisService redisService;
    @GetMapping("hello")
    public String hello() {
        return testService.sayHello("Hello springboot and dubbo!");
    }


    @GetMapping("redistest")
    public Object redistest() {
        redisService.set("11","sdada");
        return redisService.get("11");
    }

    @GetMapping("user")
    public User user() {
        logger.info("qqqqqq");
        return testService.findUser();
    }
}

