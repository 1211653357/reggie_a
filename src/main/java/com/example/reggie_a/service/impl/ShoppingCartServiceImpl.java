package com.example.reggie_a.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.reggie_a.enity.ShoppingCart;
import com.example.reggie_a.mapper.ShoppingCartMapper;
import com.example.reggie_a.service.ShoppingCartService;
import org.springframework.stereotype.Service;

@Service
public class ShoppingCartServiceImpl extends ServiceImpl<ShoppingCartMapper, ShoppingCart> implements ShoppingCartService {
}
