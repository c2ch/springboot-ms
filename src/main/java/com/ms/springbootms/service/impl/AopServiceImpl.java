package com.ms.springbootms.service.impl;

import com.ms.springbootms.entity.User;
import com.ms.springbootms.mapper.UserMapper;
import com.ms.springbootms.service.AopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AopServiceImpl implements AopService {

    @Autowired
    UserMapper userMapper;

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public void a() {
        User user = new User();
        user.setUsername("a");
        user.setPassword("aa");
        userMapper.insertUser(user);
        b();
        int i = 1/0;
    }

    @Override
    public void b() {
      User user = new User();
      user.setUsername("b");
      user.setPassword("bb");
      userMapper.insertUser(user);
    }
}
