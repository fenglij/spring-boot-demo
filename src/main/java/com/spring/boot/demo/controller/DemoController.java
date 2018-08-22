package com.spring.boot.demo.controller;

import com.github.pagehelper.PageInfo;
import com.spring.boot.demo.common.base.BusinessException;
import com.spring.boot.demo.common.base.Result;
import com.spring.boot.demo.common.base.ResultEnum;
import com.spring.boot.demo.common.base.ResultUtil;
import com.spring.boot.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    private DemoService demoService;

    @RequestMapping(value = "/test/{id}")
    @ResponseBody
    public Result test(@PathVariable Integer id){
        if (id==1){
            throw new BusinessException(ResultEnum.PARAMETER_EXCEPTION);
        }else{
            return ResultUtil.success();
        }

    }

    @RequestMapping(value = "/test/page")
    @ResponseBody
    public Result<PageInfo<Map>> page(){
        PageInfo<Map> pageInfo = demoService.findPage();

        return ResultUtil.success(pageInfo);
    }
}
