package com.spring.boot.demo.service;

import com.github.pagehelper.PageInfo;

import java.util.Map;

public interface DemoService {

    PageInfo<Map> findPageInfo();

}
