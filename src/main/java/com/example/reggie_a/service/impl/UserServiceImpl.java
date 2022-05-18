package com.example.reggie_a.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.reggie_a.enity.User;
import com.example.reggie_a.mapper.UserMapper;
import com.example.reggie_a.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
