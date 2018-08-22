package com.spring.boot.demo.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Data
@Entity
@Table(name = "b_user", schema = "xpower_platform", catalog = "")
public class BUserEntity {
    @Id
    @Column(name = "ID")
    private String id;

    @Column(name = "ACCOUNT")
    private String account;

    @Column(name = "NAME")
    private String name;

    @Column(name = "PHONE_NO")
    private String phoneNo;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "PASSWORD_SALT")
    private String passwordSalt;

    @Column(name = "VERIFY_CODE")
    private String verifyCode;

    @Column(name = "HEAD_IMG")
    private String headImg;

    @Column(name = "SEX")
    private Integer sex;

    @Column(name = "BIRTHDAY")
    private String birthday;

    @Column(name = "NATIVE_PLACE")
    private String nativePlace;

    @Column(name = "JOB")
    private String job;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "POINT")
    private Integer point;

    @Column(name = "CREDIT")
    private Integer credit;

    @Column(name = "COMPANY_NAME")
    private String companyName;

    @Column(name = "COMPANY_DEPT")
    private String companyDept;

    @Column(name = "COMPANY_ROLE")
    private String companyRole;

    @Column(name = "ROLE")
    private Integer role;

    @Column(name = "LOGIN_TIME")
    private Timestamp loginTime;

    @Column(name = "LOGIN_CNT")
    private Integer loginCnt;

    @Column(name = "REGIST_TIME")
    private Timestamp registTime;

    @Column(name = "LNG")
    private String lng;

    @Column(name = "LAT")
    private String lat;

    @Column(name = "IS_COMPLETED")
    private Integer isCompleted;

    @Column(name = "STATUS")
    private Integer status;

    @Column(name = "ORDER_ID")
    private Timestamp orderId;

    @Column(name = "CREATE_ACCOUNT")
    private String createAccount;

    @Column(name = "CREATE_TIME")
    private Timestamp createTime;

    @Column(name = "MODIFY_ACCOUNT")
    private String modifyAccount;

    @Column(name = "MODIFY_TIME")
    private Timestamp modifyTime;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BUserEntity that = (BUserEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(account, that.account) &&
                Objects.equals(name, that.name) &&
                Objects.equals(phoneNo, that.phoneNo) &&
                Objects.equals(email, that.email) &&
                Objects.equals(password, that.password) &&
                Objects.equals(passwordSalt, that.passwordSalt) &&
                Objects.equals(verifyCode, that.verifyCode) &&
                Objects.equals(headImg, that.headImg) &&
                Objects.equals(sex, that.sex) &&
                Objects.equals(birthday, that.birthday) &&
                Objects.equals(nativePlace, that.nativePlace) &&
                Objects.equals(job, that.job) &&
                Objects.equals(address, that.address) &&
                Objects.equals(point, that.point) &&
                Objects.equals(credit, that.credit) &&
                Objects.equals(companyName, that.companyName) &&
                Objects.equals(companyDept, that.companyDept) &&
                Objects.equals(companyRole, that.companyRole) &&
                Objects.equals(role, that.role) &&
                Objects.equals(loginTime, that.loginTime) &&
                Objects.equals(loginCnt, that.loginCnt) &&
                Objects.equals(registTime, that.registTime) &&
                Objects.equals(lng, that.lng) &&
                Objects.equals(lat, that.lat) &&
                Objects.equals(isCompleted, that.isCompleted) &&
                Objects.equals(status, that.status) &&
                Objects.equals(orderId, that.orderId) &&
                Objects.equals(createAccount, that.createAccount) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(modifyAccount, that.modifyAccount) &&
                Objects.equals(modifyTime, that.modifyTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, account, name, phoneNo, email, password, passwordSalt, verifyCode, headImg, sex, birthday, nativePlace, job, address, point, credit, companyName, companyDept, companyRole, role, loginTime, loginCnt, registTime, lng, lat, isCompleted, status, orderId, createAccount, createTime, modifyAccount, modifyTime);
    }
}
