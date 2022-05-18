package com.example.reggie_a.common;

/**
 * 自定义业务异常
 */
public class CustomException extends RuntimeException {

    public CustomException(String message) {
        super(message);
    }

}
