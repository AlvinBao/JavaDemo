package com.hulu.aop;

import org.springframework.stereotype.Component;

@Component
public class HelloService {

    public void shortMethod() {
        sleep((long) (Math.random() * 100));
    }

    public void longMethod() {
        sleep(100 + (long) (Math.random() * 1000));
    }

    public void exceptionMethod() throws Exception {
        throw new Exception("Dummy Exception");
    }

    private void sleep(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
