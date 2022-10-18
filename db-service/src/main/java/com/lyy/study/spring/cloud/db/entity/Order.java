package com.lyy.study.spring.cloud.db.entity;

import java.io.Serializable;

/**
 * @author langyongya
 * @className Order
 * @description 订单对象
 * @date 2022/10/17
 **/
public class Order implements Serializable {

    public Long serialVersionUID = 2345123456745634345L;

    private String orderId;

    private Integer stockCount;

    private String memo;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Integer getStockCount() {
        return stockCount;
    }

    public void setStockCount(Integer stockCount) {
        this.stockCount = stockCount;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", stockCount=" + stockCount +
                ", memo='" + memo + '\'' +
                '}';
    }
}