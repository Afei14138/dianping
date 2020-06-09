package com.afei.dianping.common;

public enum EmBusinessError {

    NO_OBJECT_FOUND(1000,"请求对象不存在"),
    ;
    private Integer errCode;

    private String errMsg;

    EmBusinessError(Integer errCode, String errMsg) {
        this.errCode = errCode;
        this.errMsg = errMsg;
    }

    public Integer getErrCode() {
        return errCode;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrCode(Integer errCode) {
        this.errCode = errCode;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }
}
