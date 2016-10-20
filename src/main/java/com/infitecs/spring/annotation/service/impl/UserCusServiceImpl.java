package com.infitecs.spring.annotation.service.impl;

import com.infitecs.spring.annotation.dao.UserDao;
import com.infitecs.spring.annotation.pojo.User;
import com.infitecs.spring.annotation.service.UserCusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author peter pan on 10/20/2016.
 */
@Service
public class UserCusServiceImpl implements UserCusService {


    private UserDao userDao;


    @Autowired
    public UserCusServiceImpl(@Qualifier("userDaoOrcaleImpl") UserDao userDao) {
        this.userDao = userDao;
    }


    @Override
    public int addUser(User user) {
        userDao.addUser(user);
        return 0;
    }

    @Override
    public int editUser(User user) {
        userDao.editUser(user);
        return 0;
    }

    @Override
    public int deleteUser(User user) {
        userDao.deleteUser(user);
        return 0;
    }
}
