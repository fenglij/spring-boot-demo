package com.xpower.iot.demo.controller;

import com.xpower.iot.demo.common.base.Result;
import com.xpower.iot.demo.common.base.ResultEnum;
import com.xpower.iot.demo.common.base.ResultUtil;
import com.xpower.iot.demo.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/{username}/{password}")
    @ResponseBody
    public Result login(@PathVariable String username, @PathVariable String password){
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        try {
            subject.login(token);
        } catch (AuthenticationException e) {
            token.clear();
            return ResultUtil.result(ResultEnum.LOGIN_EXCEPTION, e);
        }
        return ResultUtil.success();

    }
}
