package com.markerhub.common.lang;

import lombok.Data;

import java.io.Serializable;

/*统一结果封装*/

@Data       //可以用过lombok的@Data注解省略set和get方法了
public class Result implements Serializable {

    private int code;
    private String msg;
    private Object data;

    public static  Result succ(Object data){
        return  succ(200,"操作成功",data);
    }

    public static  Result succ(int code,String msg,Object data){
        Result r=new Result();
        r.setCode(code);
        r.setMsg(msg);
        r.setData(data);
        return  r;
    }

    public static  Result fail(String msg){
        return  fail(msg,null);
    }

    public static  Result fail(String msg,Object data){
        return  fail(400,msg,data);
    }

    public static  Result fail(int code,String msg,Object data){
        Result r=new Result();
        r.setCode(code);
        r.setMsg(msg);
        r.setData(data);
        return  r;
    }
}
