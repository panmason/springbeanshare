package com.infitecs.spring.annotation.dao.impl;

import com.infitecs.spring.annotation.dao.UserDao;
import com.infitecs.spring.annotation.pojo.User;
import com.infitecs.spring.annotation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author peter pan on 10/20/2016.
 */
@Repository
public class UserDaoImpl implements UserDao {

//    private UserService userService;
//
//    @Autowired
//    public void setUserService(UserService userService) {
//        this.userService = userService;
//    }

    @Override
    public int addUser(User user) {
        System.out.println(user.toString() + "添加成功");
        return 0;
    }

    @Override
    public int editUser(User user) {
        System.out.println(user.toString() + "修改成功");
        return 0;
    }

    @Override
    public int deleteUser(User user) {
        System.out.println(user.toString() + "删除成功");
        return 0;
    }
}
