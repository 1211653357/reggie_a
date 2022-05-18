package com.example.reggie_a.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.reggie_a.enity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
