package com.ke.log;


import java.lang.annotation.*;

/**
 * Created by Administrator on 2017/8/10.
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface Log {

    String operateModelNm() default "";
    String operateFuncNm() default "";
    String operateDescribe() default "";



}
