package com.example.reggie_a.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.reggie_a.enity.AddressBook;
import com.example.reggie_a.mapper.AddressBookMapper;
import com.example.reggie_a.service.AddressBookService;
import org.springframework.stereotype.Service;

@Service
public class AddressBookServiceImpl extends ServiceImpl<AddressBookMapper, AddressBook> implements AddressBookService {
}
