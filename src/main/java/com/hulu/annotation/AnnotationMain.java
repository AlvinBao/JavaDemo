package com.hulu.annotation;

import java.lang.annotation.Annotation;

public class AnnotationMain {
    public static void main(String[] args) {
        Class a = A.class;
        Class b = B.class;
        Annotation[] annotations = b.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }
    }

    @Good
    @Good
    class A {

    }

    class B extends A {

    }
}
