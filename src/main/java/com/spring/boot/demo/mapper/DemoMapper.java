package com.spring.boot.demo.mapper;

import com.github.pagehelper.PageInfo;

import java.util.List;
import java.util.Map;

public interface DemoMapper {

    public List<Map> findPage();
}
