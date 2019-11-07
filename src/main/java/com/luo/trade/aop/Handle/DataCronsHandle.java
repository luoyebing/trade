package com.luo.trade.aop.Handle;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class DataCronsHandle {

    private final static Logger LOGGER = LoggerFactory.getLogger(DataCronsHandle.class);

    @Pointcut("@annotation (com.luo.trade.aop.annotation.DataCrons)")
    private void exec(){

    }
    @Around("exec()")

    public Object doAround(ProceedingJoinPoint joinPoint) throws Throwable{
        Signature signature = joinPoint.getSignature();
        return null;
    }
}