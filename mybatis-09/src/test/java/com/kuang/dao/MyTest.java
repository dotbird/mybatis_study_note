package com.kuang.dao;

import com.kuang.pojo.User;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class MyTest {


    @Test
    public void test(){
        //第一步：获得SqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //执行SQL  方式一：getMapper
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.queryUserById(1);
        System.out.println(user);

        //增删改操作，可能会改变原来的数据，所以必定会刷新缓存
        //userMapper.updateUser( new User(2,"aaa","bbb"));

        //手动清理缓存,缓存失效，需要重新查找
        sqlSession.clearCache();

        System.out.println("================================");
        User user2 = userMapper.queryUserById(1);
        System.out.println(user2);

        System.out.println(user == user2);
        //关闭SqlSession
        sqlSession.close();
    }



}
