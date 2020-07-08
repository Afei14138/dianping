package com.afei.dianping.request;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

public class SellerCreateReq implements Serializable {

    @NotBlank(message = "手机号不能为空")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
