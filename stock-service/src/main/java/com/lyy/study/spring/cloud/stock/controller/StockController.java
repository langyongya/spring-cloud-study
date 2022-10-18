package com.lyy.study.spring.cloud.stock.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @author langyongya
 */
@RestController
@RequestMapping("stock/")
public class StockController {

    @GetMapping("reduce/{productId}/{stockCount}")
    public String reduce(@PathVariable("productId") String productId, @PathVariable("stockCount") String stockCount){

        return "减少库存";
    }
}
