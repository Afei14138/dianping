package com.afei.dianping.controller;

import com.afei.dianping.common.BusinessException;
import com.afei.dianping.common.CommonRes;
import com.afei.dianping.common.EmBusinessError;
import com.afei.dianping.model.UserModel;
import com.afei.dianping.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("get")
    @ResponseBody
    public CommonRes getUser(@RequestParam(name = "id") Integer id) throws BusinessException {
        UserModel userModel = userService.getUser(id);
        if(userModel == null){
            //return CommonRes.create(new CommonError(EmBusinessError.NO_OBJECT_FOUND),"fail");
            throw new BusinessException(EmBusinessError.NO_OBJECT_FOUND);
        } else {
            return CommonRes.create(userModel);
        }

    }
}
