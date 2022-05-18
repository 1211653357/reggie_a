package com.example.reggie_a.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.reggie_a.enity.Orders;


public interface OrderService extends IService<Orders> {

    /**
     * 用户下单
     * @param orders
     */
    public void submit(Orders orders);
}
