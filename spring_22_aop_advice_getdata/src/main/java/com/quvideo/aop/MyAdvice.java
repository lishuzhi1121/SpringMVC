package com.quvideo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * 通知类
 */
@Component
@Aspect
public class MyAdvice {

    @Pointcut("execution(* com.quvideo.dao.*Dao.find*(..))")
    private void daoPt() {
    }

    /**
     * 1. 在前置通知和后置通知中使用 JoinPoint 对象获取参数
     */
    @Before("daoPt()")
    public void before(JoinPoint jp) {
        Object[] args = jp.getArgs();
        System.out.println(Arrays.toString(args));
        System.out.println("Before advice..." + System.currentTimeMillis());
    }

    @After("daoPt()")
    public void after(JoinPoint jp) {
        Object[] args = jp.getArgs();
        System.out.println(Arrays.toString(args));
        System.out.println("After advice..." + System.currentTimeMillis());
    }


    /**
     * 2. 在环绕通知中使用 ProceedingJoinPoint 对象获取参数(ProceedingJoinPoint是JoinPoint的子接口)
     */
    @Around("MyAdvice.daoPt()") // 切面(Aspect)
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        Object[] args = pjp.getArgs();
        System.out.println(Arrays.toString(args));
        args[0] = 12345;
        /**
         * 注意: 这里的proceed方法是可以传参数的, 默认就是传了getArgs的参数
         * 我们可以在这里修改参数后再传给proceed方法, 达到参数校验的目的, 甚至还可以修改返回值
         */
        // 执行原始方法
        Object res = pjp.proceed(args);
        return res+" Lee";
    }

    /**
     * 3. 使用形参接收方法返回值, 并且形参只能在第一个参数连接点的后面
     */
    @AfterReturning(value = "daoPt()", returning = "ret")
    public void afterReturning(JoinPoint jp, Object ret) {
        System.out.println("After returning advice..."+ret);
    }

    @AfterThrowing(value = "daoPt()", throwing = "t")
    public void afterThrowing(JoinPoint jp,Throwable t) {
        System.out.println("After throwing advice..."+t);
    }


    @Pointcut("execution(* com.quvideo.service.*Service.*(..))")
    private void servicePt() {}

    @Around("servicePt()")
    public Object trimStr(ProceedingJoinPoint pjp) throws Throwable {
        Object[] args = pjp.getArgs();
        System.out.println(Arrays.toString(args));
        for (int i = 0; i < args.length; i++) {
            if (args[i].getClass().equals(String.class)) {
                args[i] = args[i].toString().trim();
            }
        }
        Object res = pjp.proceed(args);
        return res;
    }


}
