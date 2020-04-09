package com.ms.springbootms.mapper;

import com.ms.springbootms.entity.User;

import java.util.List;

//@Mapper
public interface UserMapper {

    List<User> findAllUser();

    Integer updateUser(User user);

    Integer insertUser(User user);

    Integer deleteUser(Integer id);
}
