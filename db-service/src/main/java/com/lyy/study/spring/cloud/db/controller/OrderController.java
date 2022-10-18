package com.lyy.study.spring.cloud.db.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author langyongya
 * @className OrderController
 * @description TODO
 * @date 2022/10/17
 **/
@RestController
@RequestMapping("db/order/")
public class OrderController {

    @GetMapping("getOrderById/{orderId}")
    public String getOrderById(@PathVariable("orderId") String orderId){

    }
}