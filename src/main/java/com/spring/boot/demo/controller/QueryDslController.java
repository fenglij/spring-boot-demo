package com.spring.boot.demo.controller;

import com.spring.boot.demo.common.base.Result;
import com.spring.boot.demo.common.base.ResultUtil;
import com.spring.boot.demo.model.TUserEntity;
import com.spring.boot.demo.service.QuerydslService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(value = "/queryDsl", tags = "QueryDSL样例模块")
@RestController
@RequestMapping("/queryDsl")
public class QueryDslController {

    @Autowired
    private QuerydslService querydslService;

    @ApiOperation(httpMethod = "POST", value = "queryDsl查询测试", notes = "queryDsl查询测试")
    @RequestMapping(value = "/querydsl/list")
    @ResponseBody
    public Result querydslList(){
        List<TUserEntity> list = querydslService.findQuerydslList();
        return ResultUtil.success(list);
    }

    @ApiOperation(httpMethod = "POST", value = "queryDsl分页测试", notes = "queryDsl分页测试")
    @RequestMapping(value = "/querydsl/page/{offSet}/{pageSize}")
    @ResponseBody
    public Result<Page<TUserEntity>> querydslPage(@PathVariable Integer offSet, @PathVariable Integer pageSize){
        Page<TUserEntity> page = querydslService.findQuerydslPage(offSet, pageSize);
        return ResultUtil.success(page);
    }

    @ApiOperation(httpMethod = "POST", value = "queryDsl原生SQL查询测试", notes = "queryDsl原生SQL查询测试")
    @RequestMapping(value = "/querydsl/native/list")
    @ResponseBody
    public Result querydslNativeList(){
        List<TUserEntity> list = querydslService.findQuerydslNativeList();
        return ResultUtil.success(list);
    }

    @ApiOperation(httpMethod = "POST", value = "queryDsl关联JOIN查询测试", notes = "queryDsl关联JOIN查询测试")
    @RequestMapping(value = "/querydsl/join/list")
    @ResponseBody
    public Result querydslJoinList(){
        List<TUserEntity> list = querydslService.findQuerydslJoinList();
        return ResultUtil.success(list);
    }

}
