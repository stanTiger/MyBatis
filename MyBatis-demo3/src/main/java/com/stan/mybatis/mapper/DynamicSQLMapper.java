package com.stan.mybatis.mapper;

import com.stan.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DynamicSQLMapper {

    /**
     * get Emp by conditions
     */
    List<Emp> getEmpByCondition(Emp emp);

    List<Emp> getEmpByCond(Emp emp);

    int delEmp(@Param("eids") Integer[] eids);

    int addEmp(@Param("emps")List<Emp> emps);
}
