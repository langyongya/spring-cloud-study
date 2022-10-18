package com.lyy.study.spring.cloud.order.controller;

import com.lyy.study.spring.cloud.order.feign.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author langyongya
 */
@RestController
@RequestMapping("order/")
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private StockService stockService;

    @GetMapping("addOrder/{productId}/{stockCount}")
    public String addOrder(@PathVariable("productId") String productId, @PathVariable("stockCount") String stockCount) {
        return stockService.reduceStock(productId, stockCount);
    }
}
