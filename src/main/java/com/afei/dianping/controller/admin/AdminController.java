package com.afei.dianping.controller.admin;

import com.afei.dianping.common.BusinessException;
import com.afei.dianping.common.EmBusinessError;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

@Controller("/admin/admin")
@RequestMapping("/admin/admin")
public class AdminController {

    @Value("${admin.email}")
    private String email;

    @Value("${admin.encryptPassword}")
    private String encryptPassword;

    @Autowired
    private HttpServletRequest httpServletRequest;

    public static String CURRENT_ADMIN_SESSION = "currentAdminSession";

    @RequestMapping("/index")
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView("/admin/admin/index");
        return modelAndView;
    }


    @RequestMapping("/loginpage")
    public ModelAndView loginpage(){
        ModelAndView modelAndView = new ModelAndView("/admin/admin/login");
        return modelAndView;
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestParam("email")String email,
                              @RequestParam("password")String password) throws BusinessException, UnsupportedEncodingException, NoSuchAlgorithmException {
        if(StringUtils.isEmpty(email) || StringUtils.isEmpty(password)){
            throw new BusinessException(EmBusinessError.PARAMETER_VALIDATION_ERROR,"用户名密码不能为空");
        }
        if(email.equals(this.email) && encodeByMd5(password).equals(this.encryptPassword)){
            //登录成功，重定向
            httpServletRequest.getSession().setAttribute(CURRENT_ADMIN_SESSION,email);
            return "redirect:/admin/admin/index";
        }else{
            throw new BusinessException(EmBusinessError.PARAMETER_VALIDATION_ERROR,"用户名密码错误");
        }

    }

    private String encodeByMd5(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        //确认计算方法MD5
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        Base64.Encoder encoder = Base64.getEncoder();

        return encoder.encodeToString(messageDigest.digest(str.getBytes("utf-8")));
    }

}
