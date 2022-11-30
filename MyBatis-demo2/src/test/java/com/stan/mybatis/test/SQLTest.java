package com.stan.mybatis.test;

import com.stan.mybatis.mapper.SQLMapper;
import com.stan.mybatis.pojo.User;
import com.stan.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class SQLTest {

    @Test
    public void testInsertUser(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SQLMapper mapper = sqlSession.getMapper(SQLMapper.class);
        User user = new User(null, "bob", "abc234", 29, "男", "bob@gmail.com");
        mapper.insertUser(user);
        System.out.println(user);
    }





    @Test
    public void testGetUser(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SQLMapper mapper = sqlSession.getMapper(SQLMapper.class);
        System.out.println(mapper.getUser("t_user"));
    }




    @Test
    public void testDeleteUser(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SQLMapper mapper = sqlSession.getMapper(SQLMapper.class);
        System.out.println(mapper.deleteUsers("1,2,3"));
    }



    @Test
    public void testGetUserByLike(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SQLMapper mapper = sqlSession.getMapper(SQLMapper.class);
        System.out.println(mapper.getUserByLike("a"));
    }
}
