package com.ke.exception;

/**
 * Created by Administrator on 2017/7/28.
 */
public class CustomException extends Exception{

    private String err_message;

    public CustomException(String err_message){
        super(err_message);
        this.err_message = err_message;
    }

    public String getErr_message() {
        return err_message;
    }

    public void setErr_message(String err_message) {
        this.err_message = err_message;
    }
}
