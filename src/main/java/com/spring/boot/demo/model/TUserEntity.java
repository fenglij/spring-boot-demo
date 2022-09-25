package com.spring.boot.demo.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Data
@Entity
@Table(name = "t_user", schema = "demo", catalog = "")
public class TUserEntity {
    @Id
    @Column(name = "ID")
    private String id;

    @Column(name = "ACCOUNT")
    private String account;

    @Column(name = "NAME")
    private String name;

    @Column(name = "PHONE")
    private String phone;

    @Column(name = "PASSWORD")
    private String password;

}
