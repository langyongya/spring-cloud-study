package com.lyy.study.spring.cloud.order.feign.fallback;

import com.lyy.study.spring.cloud.order.feign.service.StockService;
import org.springframework.stereotype.Component;

/**
 * @author langyongya
 */
@Component
public class StockServiceFallBack implements StockService {

    @Override
    public String reduceStock(String productId, String stockCount) {
        System.out.println("减库存失败，执行处理逻辑。。。。");
        return "error";
    }
}
