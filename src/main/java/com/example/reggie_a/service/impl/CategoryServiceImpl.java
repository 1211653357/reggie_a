package com.example.reggie_a.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.reggie_a.common.CustomException;
import com.example.reggie_a.enity.Category;
import com.example.reggie_a.enity.Dish;
import com.example.reggie_a.enity.Setmeal;
import com.example.reggie_a.mapper.CategoryMapper;
import com.example.reggie_a.service.CategoryService;
import com.example.reggie_a.service.DishService;
import com.example.reggie_a.service.SetmealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {

    @Autowired
    private DishService dishService;


    @Autowired
    private SetmealService setmealService;

    /**
     * 根据id删除分类，删除之前要进行判断
     *
     * @param ids
     */
    @Override
    public void remove(Long ids) {

        LambdaQueryWrapper<Dish> dishLambdaQueryWrapper = new LambdaQueryWrapper<>();
        //添加查询条件，根据id查询
        dishLambdaQueryWrapper.eq(Dish::getCategoryId, ids);
        int count1 = dishService.count(dishLambdaQueryWrapper);

        //查询当前分类是否关联了菜品，如果已经关联，抛出一个业务异常
        if (count1 > 0) {
            //已经关联菜品，抛出一个业务异常
            throw new CustomException("当前分类下关联了菜品，不能删除");
        }


        LambdaQueryWrapper<Setmeal> setmealLambdaQueryWrapper = new LambdaQueryWrapper<>();
        //添加查询条件，根据id查询
        setmealLambdaQueryWrapper.eq(Setmeal::getCategoryId, ids);
        int count2 = setmealService.count(setmealLambdaQueryWrapper);


        //查询当前分类是否关联了套餐，如果已经关联，抛出一个业务异常
        if (count1 > 0) {
            //已经关联套餐，抛出一个业务异常
            throw new CustomException("当前分类下关联了套餐，不能删除");
        }


        //正常删除分类
        super.removeById(ids);

    }

}
