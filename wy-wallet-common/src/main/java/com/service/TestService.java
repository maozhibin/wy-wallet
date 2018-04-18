package com.service;

import com.model.User;

import javax.annotation.Resource;

public interface TestService {

    String sayHello(String str);

    User findUser();
}
