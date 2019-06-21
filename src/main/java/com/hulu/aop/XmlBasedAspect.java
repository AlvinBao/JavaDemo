package com.hulu.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class XmlBasedAspect {
    public void before(JoinPoint joinPoint) {
        System.out.println("Before exection:" + joinPoint.toShortString());
    }

    public void after(JoinPoint joinPoint) {
        System.out.println("After exection:" + joinPoint.toShortString());
    }

    public void afterReturn(JoinPoint joinPoint) {
        System.out.println("After return:" + joinPoint.toShortString());
    }

    public void afterThrowing(JoinPoint joinPoint) {
        System.out.println("After throw:" + joinPoint.toShortString());
    }

    public String around(ProceedingJoinPoint joinPoint) {
        try {
            Object result = joinPoint.proceed();
            return "Result: " + result + ", " + joinPoint.toShortString();
        } catch (Throwable throwable) {
            return "Exception throwed, " + joinPoint.toShortString();
        }
    }
}
