package com.example.reggie_a.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.reggie_a.dto.SetmealDto;
import com.example.reggie_a.enity.Setmeal;

import java.util.List;

public interface SetmealService extends IService<Setmeal> {

    /**
     * 新增套餐
     *
     * @param setmealDto
     * @return
     */
    public void saveWithDish(SetmealDto setmealDto);

    /**
     * 删除套餐
     *
     * @param ids
     */
    public void removeWithDish(List<Long> ids);

}
