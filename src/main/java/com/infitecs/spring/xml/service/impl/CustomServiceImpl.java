package com.infitecs.spring.xml.service.impl;

import com.infitecs.spring.xml.dao.CustomDao;
import com.infitecs.spring.xml.pojo.Custom;
import com.infitecs.spring.xml.service.CustomService;

/**
 * @author peter pan on 10/20/2016.
 */
public class CustomServiceImpl implements CustomService {


    private CustomDao customDao;

    public void setCustomDao(CustomDao customDao) {
        this.customDao = customDao;
    }


    @Override
    public void addCustom(Custom custom) {
        customDao.addCustom(custom);
    }

    @Override
    public void editCustom(Custom custom) {
        customDao.editCustom(custom);
    }

    @Override
    public void deleteCustom(Custom custom) {
        customDao.deleteCustom(custom);
    }
}
