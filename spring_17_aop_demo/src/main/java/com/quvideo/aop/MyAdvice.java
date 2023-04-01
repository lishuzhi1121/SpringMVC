package com.quvideo.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 通知类
 */
@Component
@Aspect
public class MyAdvice {
    /**
     * 切入点(Pointcut)
     */
    @Pointcut("execution(* com.quvideo.dao.*Dao.*te(..))") // 切入delete和update方法
    private void daoPt(){}

    /**
     * 通知(Advice)
     */
    @Around("MyAdvice.daoPt()") // 切面(Aspect)
    public void costTime(ProceedingJoinPoint pjp) throws Throwable {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            // 执行原始方法
            pjp.proceed();
        }
        long endTime = System.currentTimeMillis();
        long costTime = endTime - startTime;
        System.out.println("执行万次消耗时间: "+costTime+"ms");
    }

}
