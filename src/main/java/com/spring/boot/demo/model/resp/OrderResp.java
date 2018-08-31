package com.spring.boot.demo.model.resp;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class OrderResp implements Serializable {
    // t_order_bill columns
    private String id;

    private String orderId;

    private BigDecimal fee;

    // t_order_info columns
    private String userId;

    private BigDecimal feeTotal;
}
