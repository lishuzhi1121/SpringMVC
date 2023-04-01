package com.quvideo.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ServiceAdvice {

    @Pointcut("execution(* com.quvideo.service.*Service.*(..))")
    private void servicePt() {}

    @Around("ServiceAdvice.servicePt()")
    public Object runSpeed(ProceedingJoinPoint pjp) throws Throwable {
        Signature signature = pjp.getSignature();
        String typeName = signature.getDeclaringTypeName();
        String signatureName = signature.getName();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            pjp.proceed();
        }
        long endTime = System.currentTimeMillis();
        long costTime = endTime - startTime;
        System.out.println("执行万次: "+typeName+"."+signatureName+" ---> "+"消耗时间: "+costTime+"ms");
        Object res = pjp.proceed();
        return res;
    }
}
