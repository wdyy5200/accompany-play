package com.yasen.entity.result;

import com.yasen.entity.enums.ResponseCodeEnum;

public class ResultVo {

    private Integer code;

    private String message;

    private Object data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public ResultVo(Integer code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static ResultVo Ok(Object data){
        return new ResultVo(ResponseCodeEnum.CODE_200.getCode(),ResponseCodeEnum.CODE_200.getMsg(),data);
    }

    public static ResultVo error(ResponseCodeEnum responseCodeEnum){
        return new ResultVo(responseCodeEnum.getCode(),responseCodeEnum.getMsg(),null);
    }
}
