package com.infitecs.spring.xml.service.impl;

import com.infitecs.spring.xml.service.MessageService;

/**
 * @author peter pan on 10/20/2016.
 */
public class MessageServiceImpl implements MessageService {

    @Override
    public void sendMessage(String content) {
        System.out.println("send message:" + content);
    }
}
