package com.kuang.dao;

import com.kuang.pojo.Teacher;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MyTest {

    @Test
    public void test(){
        //第一步：获得SqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //执行SQL  方式一：getMapper
        TeacherMapper teacherMapper = sqlSession.getMapper(TeacherMapper.class);
        List<Teacher> teacherList = teacherMapper.getTeacher2(1);
        for (Teacher teacher : teacherList) {
            System.out.println(teacher);
        }
        /*
        Teacher(
                id=1,
                name=秦老师,
                students=[Student(id=1, name=小明, tid=1),
                          Student(id=2, name=小红, tid=1),
                          Student(id=3, name=小张, tid=1),
                          Student(id=4, name=小李, tid=1),
                          Student(id=5, name=小王, tid=1)]
                )
         */
        //关闭SqlSession
        sqlSession.close();
    }




}
