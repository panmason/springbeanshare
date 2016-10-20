package com.infitecs.spring.annotation.service;

import com.infitecs.spring.annotation.pojo.User;

/**
 * @author peter pan on 10/20/2016.
 */
public interface UserCusService {

    int addUser(User user);

    int editUser(User user);

    int deleteUser(User user);

}
