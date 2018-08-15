package com.xpower.iot.demo.common.base;

public enum ResultEnum {
    SUCCESS(0, "操作成功"),
    FAILUIRE(1, "系统异常"),
    PARAMETER_EXCEPTION(100001, "参数异常"),
    ;

    private Integer code;

    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
