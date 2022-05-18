package com.example.reggie_a.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.reggie_a.enity.Orders;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper extends BaseMapper<Orders> {

}