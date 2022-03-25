package com.kuang.dao;

import com.kuang.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    //查询全部用户
    List<User> getUserList();
    //根据id查询用户
    User getUserById(int id);
    //增加user
    int addUser(User user);
    //修改user
    int updateUser(User user);
    //删除user
    int deleteUser(int id);
    //万能的map
    int addUser2(Map<String,Object> map);
    //模糊查询
    List<User> getUserLike(String value);
}
