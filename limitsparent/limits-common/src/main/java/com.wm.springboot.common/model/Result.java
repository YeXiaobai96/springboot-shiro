package com.wm.springboot.common.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Result {

    private boolean flag;
    private int code;
    private String msg;
    private Object data;

    public Result() {}
    public Result(Object data) {
        super();
        this.flag = true;
        this.code = 200;
        this.msg = "success";
        this.data = data;
    }

    public Result(String msg, Object data) {
        super();
        this.flag = true;
        this.code = 200;
        this.msg = msg;
        this.data = data;
    }

    public Result(Integer code, String msg, Object data) {
        super();
        this.flag = false;
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
}
