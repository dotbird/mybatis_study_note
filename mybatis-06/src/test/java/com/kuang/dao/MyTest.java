package com.kuang.dao;

import com.kuang.pojo.Student;
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
        //System.out.println(teacherMapper);
        Teacher teacher = teacherMapper.getTeacher(1);
        System.out.println(teacher);
        //关闭SqlSession
        sqlSession.close();
    }

    @Test
    public void testStudent(){
        //第一步：获得SqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //执行SQL  方式一：getMapper
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> studentList = studentMapper.getStudent();
        for (Student student : studentList) {
            System.out.println(student);
        }
        //关闭SqlSession
        sqlSession.close();
    }



}
