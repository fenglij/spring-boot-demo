package com.spring.boot.demo.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.spring.boot.demo.mapper.TUserMapper;
import com.spring.boot.demo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private TUserMapper userMapper;

    @Override
    public String getPasswordByUsername(String userName) {
        String password = null;
        if ("hello".equals(userName)){
            password = "world";
        }
        return password;
    }

    @Override
    public PageInfo<Map> findPageInfo() {
        logger.info("UserService findPageInfo");
        PageHelper.startPage(1, 10);
        List<Map> list = userMapper.findPage();
        PageInfo<Map> page = new PageInfo<>(list);
        return page;
    }
}
