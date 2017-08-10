package com.ke.log;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/8/10.
 */

@Aspect
@Component
public class LoginInterceptor {

    //Service层切点
    @Pointcut("@annotation(com.ke.log.LogService)")
    private void serviceLog(){}

    //Controller层切点
    @Pointcut("@annotation(com.ke.log.LogController)")
    private void controllerLog(){}


    @Before("controllerLog()")
    public void dobefore(){
        System.out.println("前置通知");

    }
    @AfterReturning("controllerLog()")
    public void doAfter(){
        System.out.println("后置通知");
    }




}
