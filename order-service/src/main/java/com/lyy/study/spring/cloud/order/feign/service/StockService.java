package com.lyy.study.spring.cloud.order.feign.service;

import com.lyy.study.spring.cloud.order.feign.fallback.StockServiceFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author langyongya
 */
@FeignClient(value = "stock-service", fallback = StockServiceFallBack.class)
public interface StockService {

    @GetMapping("/stock/reduce/{productId}/{stockCount}")
    public String reduceStock(@PathVariable("productId") String productId, @PathVariable("stockCount") String stockCount);
}
