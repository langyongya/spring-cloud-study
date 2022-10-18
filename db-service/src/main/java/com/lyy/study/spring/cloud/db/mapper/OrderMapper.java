package com.lyy.study.spring.cloud.db.mapper;

import com.lyy.study.spring.cloud.db.entity.Order;
import org.springframework.stereotype.Repository;

/**
 * @author langyongya
 * @className OrderMapper
 * @description TODO
 * @date 2022/10/17
 **/
@Repository
public interface OrderMapper {

    /**
     * 根据id查找订单
     * @author langyongya
     * @date 2022/10/17
     * @param orderId 订单id
     * @return com.lyy.study.spring.cloud.db.entity.Order 
     **/
    Order selectOrderById(String orderId);
}