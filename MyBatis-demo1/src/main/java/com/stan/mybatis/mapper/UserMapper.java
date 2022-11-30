package com.stan.mybatis.mapper;

import com.stan.mybatis.pojo.User;

import java.util.List;

public interface UserMapper {

    int insertUser();

    /**
     * 更改用户信息
     */
    void updateUser();

    /**
     * 删除用户
     */
    void deleteUser();

    /**
     * 根据id查询用户
     * @return
     */
    User getUserById();

    /**
     * 查询所有用户
     * @return
     */
    List<User> getUsers();
}
