package com.infitecs.spring.xml.service;

import com.infitecs.spring.xml.pojo.Custom;

/**
 * @author peter pan on 10/20/2016.
 */
public interface CustomService {

    void addCustom(Custom custom);

    void editCustom(Custom custom);

    void deleteCustom(Custom custom);

}
