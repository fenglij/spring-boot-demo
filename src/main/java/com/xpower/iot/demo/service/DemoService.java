package com.xpower.iot.demo.service;

import com.github.pagehelper.PageInfo;

import java.util.Map;

public interface DemoService {

    public PageInfo<Map> findPage();
}
