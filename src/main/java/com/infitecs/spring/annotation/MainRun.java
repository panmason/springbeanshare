package com.infitecs.spring.annotation;

import com.infitecs.spring.annotation.pojo.User;
import com.infitecs.spring.annotation.service.MessageService;
import com.infitecs.spring.annotation.service.UserCusService;
import com.infitecs.spring.annotation.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author peter pan on 10/20/2016.
 */
public class MainRun {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
        MessageService messageService = context.getBean(MessageService.class);
        messageService.sendMessage("Hello World");
        User user = context.getBean(User.class);
        UserService userService = context.getBean(UserService.class);
        userService.addUser(user);
        userService.editUser(user);
        userService.deleteUser(user);
        UserCusService userCusService = context.getBean(UserCusService.class);
        userCusService.addUser(user);
        userCusService.editUser(user);
        userCusService.deleteUser(user);
    }

}
