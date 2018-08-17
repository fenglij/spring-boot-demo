package com.xpower.iot.demo.service.impl;

import com.xpower.iot.demo.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public String getPasswordByUsername(String userName) {
        String password = null;
        if ("hello".equals(userName)){
            password = "world";
        }
        return password;
    }
}
