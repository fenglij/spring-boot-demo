package com.xpower.iot.demo.controller;

import com.xpower.iot.demo.common.base.Result;
import com.xpower.iot.demo.common.base.ResultEnum;
import com.xpower.iot.demo.common.base.ResultUtil;
import com.xpower.iot.demo.service.UserService;
import io.swagger.annotations.*;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(value = "/user", tags = "用户模块")
@RestController
@RequestMapping("/user")
public class UserController {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @ApiOperation(httpMethod = "POST",value = "用户登陆", notes = "用户登陆")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "username", paramType = "query", value = "hello", dataType="string", required = true),
            @ApiImplicitParam(name = "password", paramType = "query", value = "world", dataType="string", required = true)})
    @RequestMapping(value = "/login")
    @ResponseBody
    public Result login(@ApiParam("username")String username, @ApiParam("password")String password){
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        try {
            subject.login(token);
        } catch (AuthenticationException e) {
            token.clear();
            return ResultUtil.result(ResultEnum.LOGIN_EXCEPTION, e);
        }
        // 是否认证通过
        boolean isAuthenticated = subject.isAuthenticated();
        logger.info("用户：{} 认证结果：{}", username, isAuthenticated);

        return ResultUtil.success();

    }

    @ApiOperation(httpMethod = "POST",value = "用户登出", notes = "用户登出")
    @RequestMapping(value = "/logout")
    @ResponseBody
    public Result logout(){
        Subject subject = SecurityUtils.getSubject();
        subject.logout();

        return ResultUtil.success();

    }
}
