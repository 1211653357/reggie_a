package com.example.reggie_a.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.reggie_a.enity.Category;
import com.example.reggie_a.mapper.CategoryMapper;

public interface CategoryService extends IService<Category> {
    public void remove(Long id);
}
