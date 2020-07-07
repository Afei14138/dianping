package com.afei.dianping.controller.admin;

import com.afei.dianping.common.AdminPermission;
import com.afei.dianping.model.SellerModel;
import com.afei.dianping.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller("/admin/seller")
@RequestMapping("/admin/seller")
public class SellerController {

    @Autowired
    private SellerService sellerService;

    @RequestMapping("/index")
    @AdminPermission
    public ModelAndView index(){
        List<SellerModel> sellerModelList = sellerService.selectAll();
        ModelAndView modelAndView = new ModelAndView("/admin/seller/index.html");
        modelAndView.addObject("data", sellerModelList);
        modelAndView.addObject("CONTROLLER_NAME","seller");
        modelAndView.addObject("ACTION_NAME","index");
        return modelAndView;
    }

    @RequestMapping("/createpage")
    @AdminPermission
    public ModelAndView createPage(){
        List<SellerModel> sellerModelList = sellerService.selectAll();
        ModelAndView modelAndView = new ModelAndView("/admin/seller/create.html");
        modelAndView.addObject("CONTROLLER_NAME","seller");
        modelAndView.addObject("ACTION_NAME","create");
        return modelAndView;
    }

    @RequestMapping(value = "create", method = RequestMethod.POST)
    @AdminPermission
    public String create(){
        //TODO: 商家入驻接口
        return null;
    }

}
