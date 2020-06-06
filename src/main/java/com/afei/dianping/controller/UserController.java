package com.afei.dianping.controller;

import com.afei.dianping.model.UserModel;
import com.afei.dianping.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("get")
    @ResponseBody
    public UserModel getUser(@RequestParam(name = "id") Integer id){
        return userService.getUser(id);
    }
}
