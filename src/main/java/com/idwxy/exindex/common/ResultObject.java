package com.idwxy.exindex.common;

public class ResultObject {

    // 返回状态码
    private Integer codoe;

    // 相关信息
    private String msg;

    // 结果
    private Object result;

    // 构造函数
    public ResultObject() {
        super();
    }

    public ResultObject(Integer code, String msg, Object result) {
        super();
        this.codoe = code;
        this.msg = msg;
        this.result = result;
    }

    public Integer getCodoe() {
        return codoe;
    }

    public void setCodoe(Integer codoe) {
        this.codoe = codoe;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    // 重写 toString 方法
    @Override
    public String toString() {
        return "ResultObject [code=" + codoe +
                ",msg=" + msg +
                ",result=" + result + "]";
    }
}
