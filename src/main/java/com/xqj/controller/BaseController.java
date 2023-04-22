package com.xqj.controller;


import java.util.HashMap;
import java.util.Map;

public class BaseController {


    public Map<String, Object> setResultSuccess(Object data){
        return setResult(200,"success",data);
    }


    public Map<String, Object> setResultSuccess1(String msg){
        return setResult(200,msg,null);
    }

    public Map<String, Object> setResultError(String msg){
        return setResult(500,msg,null);
    }


    public Map<String, Object> setResult(Integer code, String msg, Object data){
        HashMap<String, Object> result = new HashMap<>();
        result.put("code", code);
        result.put("msg", msg);
        result.put("data", data);
        return result;
    }
}
