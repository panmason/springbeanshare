package com.infitecs.spring.annotation.dao;

import com.infitecs.spring.annotation.pojo.User;

/**
 * @author peter pan on 10/20/2016.
 */
public interface UserDao {

    int addUser(User user);

    int editUser(User user);

    int deleteUser(User user);

}
