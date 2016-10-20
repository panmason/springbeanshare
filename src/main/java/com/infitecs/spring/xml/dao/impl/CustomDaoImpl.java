package com.infitecs.spring.xml.dao.impl;

import com.infitecs.spring.xml.dao.CustomDao;
import com.infitecs.spring.xml.pojo.Custom;

/**
 * @author peter pan on 10/20/2016.
 */
public class CustomDaoImpl implements CustomDao {
    @Override
    public void addCustom(Custom custom) {
        System.out.println(custom + "添加成功");
    }

    @Override
    public void editCustom(Custom custom) {
        System.out.println(custom + "修改成功");
    }

    @Override
    public void deleteCustom(Custom custom) {
        System.out.println(custom + "删除成功");
    }
}
