package com.stan.mybatis.mapper;

import com.stan.mybatis.pojo.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface SelectMapper {
    /**
     * use map get all users
     * @return
     */
    @MapKey("id")
    Map<String,Object> getAllUserToMap();

    /**
     * get user by id transfer to map
     * @param id
     * @return
     */
    Map<String,Object> getUserByIdToMap(@Param("id")Integer id);

    /**
     * get table count
     * @return
     */
    Integer getCount();


    /**
     * get user by id
     * @param id
     * @return
     */
    User getUserById(@Param("id") Integer id);

    /**
     * get all users
     * @return
     */
    List<User> getAllUser();
}
