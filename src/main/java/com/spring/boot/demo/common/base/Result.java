package com.spring.boot.demo.common.base;

import lombok.Data;

@Data
public class Result<T> {
    private Integer code;

    private String msg;

    private T data;

}
