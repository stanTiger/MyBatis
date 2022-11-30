package com.stan.mybatis.test;

import com.stan.mybatis.mapper.ParameterMapper;
import com.stan.mybatis.pojo.User;
import com.stan.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

public class ParameterTest {



    @Test
    public void testCheckLoginByParam(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        User user = mapper.checkLoginByParam("stan","acb123");
        System.out.println(user);
    }



    @Test
    public void testAddUser(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        int i = mapper.addUser(new User(0, "james", "abc123", 20, "男", "james@163.com"));
        System.out.println(i);
    }

    @Test
    public void testCheckLoginByMap(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        HashMap<String, Object> map = new HashMap<>();
        map.put("username","stan");
        map.put("password","acb123");
        User user = mapper.checkLoginByMap(map);
        System.out.println(user);
    }




    @Test
    public void testCheckLogin(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        User user = mapper.checkLogin("blue", "acb123");
        System.out.println(user);
    }




    @Test
    public void testGetUserByUsername(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        User user = mapper.getUserByUsername("blue");
        System.out.println(user);
    }




    @Test
    public void testGetUsers(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        List<User> users = mapper.getUsers();
        users.forEach(System.out :: println);
    }
}
