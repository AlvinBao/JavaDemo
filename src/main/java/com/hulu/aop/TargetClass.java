package com.hulu.aop;

import org.springframework.stereotype.Component;

@Component
public class TargetClass {
    public void hello() {
        System.out.println("Say Hello to the world!");
    }

    public String returnHello(String username) {
        return "Hello, " + username + "!";
    }

    public String throwHello(String username) throws Exception {
        if ("xianqiang.bao".equals(username)) {
            return "Hello, boss!";
        } else {
            throw new Exception("Illegal ");
        }
    }
}
