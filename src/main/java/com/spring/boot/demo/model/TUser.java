package com.spring.boot.demo.model;

import lombok.Data;

import javax.persistence.Entity;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class TUser {

    private String id;

    private String account;

    private String name;

    private String password;

    private String phone;


}