package com.itshidu.common.web;

import java.util.HashMap;

public class AjaxResult extends HashMap {
    public static AjaxResult ok(String msg){
        AjaxResult a=new AjaxResult();
        a.put("msg", msg);
        return a;
    }
    public static AjaxResult ok(){
        return ok("success");
    }
    public static AjaxResult error(){
        return ok("error");
    }
    public AjaxResult put(String key,Object value){
        super.put(key, value);
        return this;
    }
}
