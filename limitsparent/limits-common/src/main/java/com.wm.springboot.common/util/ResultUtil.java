package com.wm.springboot.common.util;


import com.wm.springboot.common.config.ExceptionEnum;
import com.wm.springboot.common.model.Result;

/**
 * @ClassName:ResultUtil
 * @Description 返回报文工具类
 */
public class ResultUtil {

    /**
     * 返回成功，传入返回体具体出参
     * @param data
     * @return
     */
    public static Result success(Object data) {
        Result result = new Result();
        result.setFlag(true);
        result.setMsg("success");
        result.setCode(0);
        result.setData(data);
        return result;
    }

    /**
     * 自定义错误信息
     *
     * @param code
     * @param msg
     * @return
     */
    public static Result error(Integer code, String msg) {
        Result result = new Result();
        result.setFlag(false);
        result.setMsg(msg);
        result.setCode(code);
        result.setData(null);
        return result;
    }

    public static Result error(Throwable throwable) {
        int code = ExceptionEnum.ERROR.getCode();
        Result result = new Result();
        result.setFlag(false);
        result.setMsg(throwable.getMessage());
        result.setCode(code);
        result.setData(null);
        return result;
    }

    /**
     * 返回异常信息，在已知的范围内
     *
     * @param ex
     * @return
     */
    public static Result error(ExceptionEnum ex) {
        Result result = new Result();
        result.setFlag(false);
        result.setMsg(ex.getMsg());
        result.setCode(ex.getCode());
        result.setData(null);
        return result;
    }
}
