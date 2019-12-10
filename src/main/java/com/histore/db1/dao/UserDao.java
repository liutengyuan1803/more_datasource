package com.histore.db1.dao;

import com.histore.db1.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Qualifier;

@Qualifier("db1SqlSessionTemplate")
public interface UserDao {
    /**
     * 通过名字查询用户信息
     */
    //@Select("SELECT * FROM user WHERE name = #{name}")
    User findUserByName (String name);

    //@Insert("INSERT INTO `user` ( `name`, `age`, `money`) VALUES (#{name},#{age},#{money})")
    int insert(User user);
}