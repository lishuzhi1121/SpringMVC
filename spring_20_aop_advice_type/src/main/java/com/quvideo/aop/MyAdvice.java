package com.quvideo.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * 通知类
 */
@Component
@Aspect
public class MyAdvice {
    @Pointcut("execution(* com.quvideo.*.*Dao.*te(..))") // 切入点表达式
    private void pt() {}

    @Pointcut("execution(* com.quvideo.*.*Dao.select(..))")
    private void selectPt() {}

    /**
     * 通知(Advice)
     */
    @Before("pt()") // 前置通知
    public void before() {
        System.out.println("Before advice..."+System.currentTimeMillis());
    }

    @After("pt()") // 后置通知
    public void after() {
        System.out.println("After advice..."+System.currentTimeMillis());
    }

    @Around("selectPt()") // 环绕通知
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("Around before advice..."+System.currentTimeMillis());
        Integer res = (Integer) pjp.proceed();
        System.out.println("Around after advice..."+System.currentTimeMillis());
        return res * 33;
    }

    @AfterReturning("selectPt())") // 返回后通知
    public void afterReturning() {
        System.out.println("After returning advice..."+System.currentTimeMillis());
    }

    @AfterThrowing("pt()") // 抛出异常后通知
    public void afterThrowing() {
        System.out.println("After throwing advice..."+System.currentTimeMillis());
    }

}
