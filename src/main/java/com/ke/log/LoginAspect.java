package com.ke.log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/8/10.
 */

@Aspect
@Component
public class LoginAspect {

    //Service层切点
    @Pointcut("@annotation(com.ke.log.LogService)")
    private void serviceLog(){}

    //Controller层切点
    @Pointcut("@annotation(com.ke.log.LogController)")
    private void controllerLog(){}


    @Before("controllerLog()")
    public void dobefore(JoinPoint joinPoint){
        //获得方法名
        System.out.println("joinPoint.getSignature().getName()="+joinPoint.getSignature().getName());
        //获得类全限定名
        System.out.println("joinPoint.getTarget().getClass().getName()="+joinPoint.getTarget().getClass().getName());
        System.out.println("前置通知");

    }
    @AfterReturning("controllerLog()")
    public void doAfter(){
        System.out.println("后置通知");
    }






}
