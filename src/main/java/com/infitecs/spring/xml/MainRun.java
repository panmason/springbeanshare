package com.infitecs.spring.xml;

import com.infitecs.spring.xml.pojo.Custom;
import com.infitecs.spring.xml.service.CustomService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author peter pan on 10/20/2016.
 */
public class MainRun {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"beans.xml"});
        Custom custom = context.getBean(Custom.class);
        CustomService customService = context.getBean(CustomService.class);
        customService.addCustom(custom);
        customService.editCustom(custom);
        customService.deleteCustom(custom);
    }

}
