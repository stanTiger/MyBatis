package com.stan.mybatis.mapper;

import com.stan.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface ParameterMapper {

    /**
     * use param annotation to check login info
     * @param username
     * @param password
     * @return
     */
    User checkLoginByParam(@Param("username") String username,@Param("password") String password);

    /**
     * add user
     * @param user
     * @return
     */
    int addUser(User user);

    /**
     * use map to check out login info
     * @param map
     * @return
     */
    User checkLoginByMap(Map<String,Object> map);

    /**
     * check login info
     * @param username
     * @param password
     * @return
     */
    User checkLogin(String username,String password);



    /**
     * get all users
     * @return
     */
    List<User> getUsers();

    /**
     * 根据用户名获取用户
     * @param username
     * @return
     */
    User getUserByUsername(String username);
}
