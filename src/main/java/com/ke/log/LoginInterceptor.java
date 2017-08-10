package com.ke.log;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/8/10.
 */

@Aspect
@Component
public class LoginInterceptor {

    @Pointcut("execution( * com.ke.controller.bs.BsLoginController.*(..))")
    private void LoginLog(){}

    @Before("LoginLog()")
    public void dobefore(){
        System.out.println("前置通知");

    }
    @AfterReturning("LoginLog()")
    public void doAfter(){
        System.out.println("后置通知");
    }




}
