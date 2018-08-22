package com.spring.boot.demo.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.spring.boot.demo.mapper.DemoMapper;
import com.spring.boot.demo.service.DemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class DemoServiceImpl implements DemoService {

    private static final Logger logger = LoggerFactory.getLogger(DemoServiceImpl.class);

    @Autowired
    private DemoMapper demoMapper;

    @Override
    public PageInfo<Map> findPage() {
        PageHelper.startPage(1, 10);
        List<Map> list = demoMapper.findPage();
        PageInfo<Map> page = new PageInfo<>(list);
        return page;
    }

}
