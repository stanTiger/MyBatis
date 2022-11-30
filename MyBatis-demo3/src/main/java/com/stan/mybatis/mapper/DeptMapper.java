package com.stan.mybatis.mapper;

import com.stan.mybatis.pojo.Dept;
import org.apache.ibatis.annotations.Param;

public interface DeptMapper {

    Dept getDeptById(@Param("did")Integer did);

    Dept getDeptAndEmp(@Param("did")Integer did);

    Dept getDeptAndEmpByStep(@Param("did") Integer did);
}
