package com.spring.boot.demo.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Data
@Entity
@Table(name = "t_order_bill", schema = "xpower_platform", catalog = "")
public class TOrderBillEntity {
    @Id
    @Column(name = "ID")
    private int id;
    @Column(name = "DAY")
    private String day;
    @Column(name = "ORDER_ID")
    private String orderId;
    @Column(name = "BILL_TYPE")
    private Integer billType;
    @Column(name = "BILL_USER_ID")
    private String billUserId;
    @Column(name = "STUB_GROUP_ID")
    private String stubGroupId;
    @Column(name = "FEE")
    private BigDecimal fee;
    @Column(name = "POWER")
    private BigDecimal power;
    @Column(name = "EXPRESSION_TYPE")
    private Integer expressionType;
    @Column(name = "EXPRESSION_INFO")
    private String expressionInfo;
    @Column(name = "CREATE_TIME")
    private Timestamp createTime;
    @Column(name = "CAN_MODIFY")
    private Integer canModify;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TOrderBillEntity that = (TOrderBillEntity) o;
        return id == that.id &&
                Objects.equals(day, that.day) &&
                Objects.equals(orderId, that.orderId) &&
                Objects.equals(billType, that.billType) &&
                Objects.equals(billUserId, that.billUserId) &&
                Objects.equals(stubGroupId, that.stubGroupId) &&
                Objects.equals(fee, that.fee) &&
                Objects.equals(power, that.power) &&
                Objects.equals(expressionType, that.expressionType) &&
                Objects.equals(expressionInfo, that.expressionInfo) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(canModify, that.canModify);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, day, orderId, billType, billUserId, stubGroupId, fee, power, expressionType, expressionInfo, createTime, canModify);
    }
}
