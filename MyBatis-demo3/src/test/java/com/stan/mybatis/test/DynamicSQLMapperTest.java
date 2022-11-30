package com.stan.mybatis.test;

import com.stan.mybatis.mapper.DynamicSQLMapper;
import com.stan.mybatis.pojo.Emp;
import com.stan.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class DynamicSQLMapperTest {

    @Test
    public void testForeach2(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        Emp e1 = new Emp(null, "a", 30, "female", "a@12s.com", null);
        Emp e2 = new Emp(null, "b", 30, "female", "a@12s.com", null);
        Emp e3 = new Emp(null, "c", 30, "female", "a@12s.com", null);
        List<Emp> emps = Arrays.asList(e1, e2, e3);
        System.out.println(mapper.addEmp(emps));
    }

    @Test
    public void testForeach(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        int i = mapper.delEmp(new Integer[]{6, 7, 8});
        System.out.println(i);
    }



    @Test
    public void testGetEmpByCond(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        List<Emp> emps = mapper.getEmpByCond(new Emp(null, "bill", null, "", null, null));
        System.out.println(emps);
    }



    @Test
    public void testGetEmpByCondition(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        List<Emp> emps = mapper.getEmpByCondition(new Emp(null, "", null, "", null, null));
        System.out.println(emps);
    }
}
