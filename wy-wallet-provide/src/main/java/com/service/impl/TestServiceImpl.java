package com.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dao.UserMapper;
import com.model.User;
import com.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service(version = "1.0.0")
public class TestServiceImpl implements TestService {
    @Resource
    private UserMapper userMapper;

    @Override
    public String sayHello(String str) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        return dateFormat.format(new Date()) + ": " + str;
    }

    @Override
    public User findUser() {
        User user = userMapper.selectByPrimaryKey((long) 1);
        return user;
    }
}
