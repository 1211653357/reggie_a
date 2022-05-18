package com.example.reggie_a.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.reggie_a.enity.Employee;
import com.example.reggie_a.mapper.EmployeeMapper;
import com.example.reggie_a.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper,Employee> implements EmployeeService {


}
