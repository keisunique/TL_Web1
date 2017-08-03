package com.ke.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2017/7/28.
 */
public class DefaultExceptionHandler implements HandlerExceptionResolver {

    private String err_message = null;

    public ModelAndView resolveException(
            HttpServletRequest request, HttpServletResponse response,
            Object handler, Exception ex) {

        CustomException customException = null;
        //如果是自定义异常则取出异常信息，如果是未知异常则构造异常
        if(ex instanceof CustomException){
            customException = (CustomException) ex;
        }else{
            customException = new CustomException("未知错误");
        }
        err_message = customException.getErr_message();

        ModelAndView mv = new ModelAndView();
        mv.addObject("err_message",err_message);
        mv.setViewName("error");
        //TODO:错误页面还没编写
        return mv;
    }
}
