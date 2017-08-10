package com.ke.log;


import java.lang.annotation.*;

/**
 * Created by Administrator on 2017/8/10.
 *
 *自定义注解 拦截Controller
 *
 */

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.PARAMETER, ElementType.METHOD})
@Documented
public @interface LogController {

    String description() default "";

}
