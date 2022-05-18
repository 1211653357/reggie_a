package com.example.reggie_a.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.reggie_a.enity.DishFlavor;
import com.example.reggie_a.mapper.DishFlavorMapper;
import com.example.reggie_a.service.DishFlavorService;
import org.springframework.stereotype.Service;

@Service
public class DishFlavorServiceImpl extends ServiceImpl<DishFlavorMapper, DishFlavor> implements DishFlavorService {
}
