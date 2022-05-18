package com.example.reggie_a.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.example.reggie_a.enity.OrderDetail;
import com.example.reggie_a.mapper.OrderDetailMapper;
import com.example.reggie_a.service.OrderDetailService;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail> implements OrderDetailService {

}