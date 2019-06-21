package com.hulu.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Component
@Aspect
public class ServiceProfiler {
    @Around("execution(* com.hulu.aop.*.*(..))")
    public Object profile(ProceedingJoinPoint joinPoint) {
        StopWatch watch = new StopWatch();
        boolean hasException = false;
        try {
            watch.start(joinPoint.toShortString());
            return joinPoint.proceed();
        } catch (Throwable throwable) {
            hasException = true;
        } finally {
            watch.stop();
            String message = watch.getLastTaskName() + ":" + watch.getLastTaskTimeMillis() + "ms" + ", exception:" + hasException;
            System.out.println(message);
            return null;
        }
    }
}
