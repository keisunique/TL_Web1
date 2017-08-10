package com.ke.log;

import java.lang.annotation.*;

/**
 * Created by Administrator on 2017/8/10.
 *
 * 自定义注解 拦截service
 */


@Target({ElementType.PARAMETER, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface LogService {

    String description() default "";

}
