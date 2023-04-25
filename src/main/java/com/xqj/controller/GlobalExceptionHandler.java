package com.xqj.controller;


import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;

@ControllerAdvice
public class GlobalExceptionHandler extends BaseController {

    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public HashMap<String, Object> handleException(Exception exception){
        System.out.println("e:" + exception);
        return (HashMap<String, Object>) setResultError("系统产生错误!");
    }
}
