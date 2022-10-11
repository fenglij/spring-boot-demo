package com.spring.boot.demo.controller;

import com.github.pagehelper.PageInfo;
import com.spring.boot.demo.common.base.BusinessException;
import com.spring.boot.demo.common.base.Result;
import com.spring.boot.demo.common.base.ResultEnum;
import com.spring.boot.demo.common.base.R;
import com.spring.boot.demo.common.redis.RedisHelper;
import com.spring.boot.demo.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Api(value = "/demo", tags = "样例模块")
@RestController
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    private UserService userService;
    @Autowired
    private RedisHelper redisHelper;

    @ApiOperation(httpMethod = "GET",value = "自定义异常", notes = "自定义异常测试")
    @RequestMapping(value = "/test/{id}")
    @ResponseBody
    public Result test(@PathVariable Integer id){
        if (id==1){
            throw new BusinessException(ResultEnum.PARAMETER_EXCEPTION);
        }else{
            return R.success();
        }

    }

    @ApiOperation(httpMethod = "GET",value = "pageInfo分页", notes = "pageInfo分页测试")
    @RequestMapping(value = "/test/pageInfo")
    @ResponseBody
    public Result<PageInfo<Map>> pageInfo(){
        PageInfo<Map> pageInfo = userService.findPageInfo();

        return R.success(pageInfo);
    }

    @ApiOperation(httpMethod = "GET",value = "redis测试 set", notes = "redis测试 set")
    @RequestMapping(value = "/redis/set")
    @ResponseBody
    public Result redisSet(@ApiParam("key")String key, @ApiParam("value")String value){
        redisHelper.set(key, value);
        return R.success();
    }

    @ApiOperation(httpMethod = "GET",value = "redis测试 get", notes = "redis测试 get")
    @RequestMapping(value = "/redis/get")
    @ResponseBody
    public Result<Object> redisGet(@ApiParam("key")String key){
        Object o = redisHelper.get(key);
        return R.success(o);
    }

}
