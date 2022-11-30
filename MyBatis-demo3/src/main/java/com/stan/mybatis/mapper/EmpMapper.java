package com.stan.mybatis.mapper;

import com.stan.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmpMapper {

    /**
     * get employee and department by employee_id
     * @param eid
     * @return
     */
    Emp getEmpAndDept(@Param("eid")Integer eid);

    /**
     * get all employee
     */
    List<Emp> getAllEmp();

    Emp getEmpAndDeptByStep(@Param("eid")Integer eid);

    List<Emp> getDeptAndEmpByStep(@Param("did") Integer did);
}
