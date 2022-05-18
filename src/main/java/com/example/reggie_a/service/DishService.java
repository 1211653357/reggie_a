package com.example.reggie_a.service;

import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.reggie_a.dto.DishDto;
import com.example.reggie_a.enity.Dish;
import com.example.reggie_a.enity.Setmeal;
import org.apache.ibatis.annotations.Mapper;

public interface DishService extends IService<Dish> {

    //新增菜品，同时插入菜品对应的口味数据，需要操作两张表：dish、dish_flavor'
    public void saveWithFlavor(DishDto dishDto);

    //根据id查询菜品信息和对应口味信息
    public DishDto getByIdWithFlavor(Long id);

    //更新菜品信息，同时更新对应的口味信息
    public DishDto updateWithFlavor(DishDto dishDto);

}
