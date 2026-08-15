package com.yasen.entity.enums;


public enum ResponseCodeEnum {
    CODE_200(200, "请求成功"),
    CODE_401(401, "未登录或Token已过期"),
    CODE_403(403, "无权限访问"),
    CODE_404(404, "请求地址不存在"),
    CODE_500(500, "服务器返回错误，请联系管理员"),
    CODE_600(600, "请求参数错误"),
    CODE_601(601, "信息已经存在"),
    CODE_602(602, "验证码错误"),
    CODE_603(603, "用户名或密码错误"),
    CODE_604(604, "账号已被禁用"),
    CODE_605(605, "微信登录失败");

    private Integer code;

    private String msg;

    ResponseCodeEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
