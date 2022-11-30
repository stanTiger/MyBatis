package com.stan.mybatis.test;

import com.stan.mybatis.mapper.DeptMapper;
import com.stan.mybatis.mapper.EmpMapper;
import com.stan.mybatis.pojo.Dept;
import com.stan.mybatis.pojo.Emp;
import com.stan.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class ResultMapTest {


    @Test
    public void testGetDeptAndEmp2(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
        Dept dept = mapper.getDeptAndEmpByStep(1);
        System.out.println(dept.getDeptName());

    }


    @Test
    public void testGetDeptAndEmp(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
        Dept dept = mapper.getDeptAndEmp(2);
        System.out.println(dept);
    }



    @Test
    public void testGetEmpAndDeptByStep(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp emp = mapper.getEmpAndDeptByStep(4);
        System.out.println(emp.getEmpName());

        System.out.println("---------------------");
        System.out.println(emp.getDept().getDeptName());
    }


    @Test
    public void testGetEmpAndDept(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp emp = mapper.getEmpAndDept(2);
        System.out.println(emp);
    }


    @Test
    public void testGetAllEmployee(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        List<Emp> emps = mapper.getAllEmp();
        emps.forEach(System.out :: println);
    }
}
