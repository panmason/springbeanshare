package com.infitecs.spring.annotation;

import com.infitecs.spring.annotation.pojo.User;
import com.infitecs.spring.annotation.service.MessageService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author peter pan on 10/20/2016.
 */
@Configuration
@ComponentScan
public class Application {

    @Bean
    MessageService mockMessageService() {
        return content -> System.out.println("send message:" + content);
    }

    @Bean
    User user() {
        return new User("1","peter","yanan St.");
    }
}
