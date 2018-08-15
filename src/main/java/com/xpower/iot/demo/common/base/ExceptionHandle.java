package com.xpower.iot.demo.common.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ExceptionHandle {
    private final static Logger logger = LoggerFactory.getLogger(ExceptionHandle.class);

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handle (Exception e){
        if (e instanceof BusinessException){
            BusinessException businessException = (BusinessException) e;
            return ResultUtil.result(businessException.getCode(), businessException.getMessage(), e);
        }else{
            logger.error("[系统异常]:{}", e);
            return ResultUtil.failure(e);
        }
    }
}
