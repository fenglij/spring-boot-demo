package com.spring.boot.demo.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Data
@Entity
@Table(name = "t_order_info", schema = "xpower_platform", catalog = "")
public class TOrderInfoEntity {
    @Id
    @Column(name = "ID")
    private String id;
    @Column(name = "APPKEY")
    private String appkey;
    @Column(name = "OUT_ORDER_ID")
    private String outOrderId;
    @Column(name = "USER_ID")
    private String userId;
    @Column(name = "CAR_TYPE_NO")
    private String carTypeNo;
    @Column(name = "START_TYPE")
    private Integer startType;
    @Column(name = "STUB_GROUP_ID")
    private String stubGroupId;
    @Column(name = "STUB_ID")
    private String stubId;
    @Column(name = "ELECTRIC_START")
    private BigDecimal electricStart;
    @Column(name = "ELECTRIC_END")
    private BigDecimal electricEnd;
    @Column(name = "TIME_START")
    private Timestamp timeStart;
    @Column(name = "TIME_END")
    private Timestamp timeEnd;
    @Column(name = "FEE_TOTAL")
    private BigDecimal feeTotal;
    @Column(name = "FEE_SERVICE")
    private BigDecimal feeService;
    @Column(name = "FEE_ELECTRIC")
    private BigDecimal feeElectric;
    @Column(name = "FEE_LIMIT")
    private BigDecimal feeLimit;
    @Column(name = "USER_AMOUNT")
    private BigDecimal userAmount;
    @Column(name = "CHARGE_TYPE")
    private Integer chargeType;
    @Column(name = "POWER")
    private BigDecimal power;
    @Column(name = "END_CODE")
    private String endCode;
    @Column(name = "END_INFO")
    private String endInfo;
    @Column(name = "SCORE")
    private Integer score;
    @Column(name = "STATUS")
    private Integer status;
    @Column(name = "CREATE_TIME")
    private Timestamp createTime;
    @Column(name = "MODIFY_TIME")
    private Timestamp modifyTime;
    @Column(name = "CAN_MODIFY")
    private Integer canModify;
    @Column(name = "CARD_NUMBER")
    private String cardNumber;
    @Column(name = "INFO")
    private String info;
    @Column(name = "CSP_ORDER_ID")
    private String cspOrderId;
    @Column(name = "ELECTRIC_POWER")
    private Integer electricPower;
    @Column(name = "TEMPERATURE")
    private Integer temperature;
    @Column(name = "OUTPUT_TYPE")
    private Integer outputType;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TOrderInfoEntity that = (TOrderInfoEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(appkey, that.appkey) &&
                Objects.equals(outOrderId, that.outOrderId) &&
                Objects.equals(userId, that.userId) &&
                Objects.equals(carTypeNo, that.carTypeNo) &&
                Objects.equals(startType, that.startType) &&
                Objects.equals(stubGroupId, that.stubGroupId) &&
                Objects.equals(stubId, that.stubId) &&
                Objects.equals(electricStart, that.electricStart) &&
                Objects.equals(electricEnd, that.electricEnd) &&
                Objects.equals(timeStart, that.timeStart) &&
                Objects.equals(timeEnd, that.timeEnd) &&
                Objects.equals(feeTotal, that.feeTotal) &&
                Objects.equals(feeService, that.feeService) &&
                Objects.equals(feeElectric, that.feeElectric) &&
                Objects.equals(feeLimit, that.feeLimit) &&
                Objects.equals(userAmount, that.userAmount) &&
                Objects.equals(chargeType, that.chargeType) &&
                Objects.equals(power, that.power) &&
                Objects.equals(endCode, that.endCode) &&
                Objects.equals(endInfo, that.endInfo) &&
                Objects.equals(score, that.score) &&
                Objects.equals(status, that.status) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(modifyTime, that.modifyTime) &&
                Objects.equals(canModify, that.canModify) &&
                Objects.equals(cardNumber, that.cardNumber) &&
                Objects.equals(info, that.info) &&
                Objects.equals(cspOrderId, that.cspOrderId) &&
                Objects.equals(electricPower, that.electricPower) &&
                Objects.equals(temperature, that.temperature) &&
                Objects.equals(outputType, that.outputType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, appkey, outOrderId, userId, carTypeNo, startType, stubGroupId, stubId, electricStart, electricEnd, timeStart, timeEnd, feeTotal, feeService, feeElectric, feeLimit, userAmount, chargeType, power, endCode, endInfo, score, status, createTime, modifyTime, canModify, cardNumber, info, cspOrderId, electricPower, temperature, outputType);
    }
}
