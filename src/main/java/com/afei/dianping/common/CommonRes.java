package com.afei.dianping.common;

public class CommonRes {

    //status=success表明成功，返回data中的数据
    //status=fail时返回固定格式的错误信息
    private String status;

    private Object data;

    //定义一个通用的创建返回对象的方法
    public static CommonRes create(Object result){
        return create(result,"success");
    }

    public static CommonRes create(Object result, String status){
        CommonRes commonRes = new CommonRes();
        commonRes.setData(result);
        commonRes.setStatus(status);
        return commonRes;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
