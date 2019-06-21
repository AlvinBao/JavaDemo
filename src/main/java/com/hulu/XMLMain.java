package com.hulu;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XMLMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MyXMLApplication application = context.getBean(MyXMLApplication.class);
        application.process("xianqiang.bao", "You are the best!");
        context.close();
    }
}
