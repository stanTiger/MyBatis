package com.stan.mybatis.mapper;

import com.stan.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SQLMapper {

    void insertUser(User user);


    List<User> getUserByLike(@Param("username") String username);

    Integer deleteUsers(@Param("ids")String ids);

    /**
     *
     */
    List<User> getUser(@Param("tbl_name")String tbl_name);
}
