package com.hulu.reflect;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class ReflectMain {
    public static void main(String[] args) throws Exception {
       List list = new ArrayList();
       System.out.println(list.getClass());
    }

    public static void doRegular() {
        long startTime = System.currentTimeMillis();
        A a = new A();
        for (int i = 0; i < 100000; ++i) {
            a.doSomething();
        }
        System.out.println(System.currentTimeMillis() - startTime);
    }

    public static void doReflect() throws Exception {
        long startTime = System.currentTimeMillis();
        Class clz = Class.forName("com.hulu.reflect.A");
        Method method = clz.getMethod("doSomething");
        Object obj = clz.newInstance();
        for (int i = 0; i < 100000; ++i) {
            method.invoke(obj);
        }
        System.out.println(System.currentTimeMillis() - startTime);
    }
}
