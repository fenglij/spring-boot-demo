package com.spring.boot.demo.service;

import com.github.pagehelper.PageInfo;

import java.util.Map;

public interface UserService {

    String getPasswordByUsername(String userName);

    PageInfo<Map> findPageInfo();
}
