package com.yunjing.emer.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yunjing.emer.dao.CompanyInfoDao;
import com.yunjing.emer.dao.DeliveryDao;
import com.yunjing.emer.dao.MachineDao;
import com.yunjing.emer.dao.ProvincesDao;
import com.yunjing.emer.entity.*;
import com.yunjing.emer.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by yinwenyao on 20/4/17.
 */

@Controller
public class SearchController {
    @Autowired
    CompanyInfoService companyInfoService;

    @Autowired
    DeliveryService deliveryService;

    @Autowired
    MachineService machineService;

    @Autowired
    StoreageService storeageService;

    @Autowired
    UserService userService;

    @Autowired
    WebsiteService websiteService;

    @Autowired
    ProvincesDao provincesDao;

    @Autowired
    DeliveryDao deliveryDao;

    @Autowired
    MachineDao machineDao;

    @Autowired
    CompanyInfoDao companyInfoDao;

    @RequestMapping("/companysearch")
    @ResponseBody
    public ModelAndView companySearch(String totalpro,String time1,String time2,HttpServletRequest request){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("search");
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        System.out.print("---------"+totalpro+time1+time2);
        List<Storeage> storeageList = storeageService.selectAll(user);
        List<Machine> machineList = machineService.selectAll(user);
        List<Website> websiteList = websiteService.selectAll(user);
        List<Delivery> deliveryList = deliveryService.selectAll(user);
        List<CompanyInfo> companyInfoList = new ArrayList<>();
        if(totalpro!=null){
            companyInfoList = new ArrayList<>();
            //String ins = totalpro.replace("[\"", "").replace("\",\"", ",").replace("\"]", "");
            if(totalpro.contains("3")){
                for(Storeage e : storeageList){
                    companyInfoList.add(companyInfoService.selectById(e.getCompanyId()));
                }
            }else if(totalpro.contains("4")){
                for(Machine e : machineList){
                    companyInfoList.add(companyInfoService.selectById(e.getCompanyId()));
                }
            }else if(totalpro.contains("1")){
                for(Website e : websiteList){
                    companyInfoList.add(companyInfoService.selectById(e.getCompanyId()));
                }
            }else if(totalpro.contains("2")){
                for(Delivery e : deliveryList){
                    companyInfoList.add(companyInfoService.selectById(e.getCompanyId()));
                }
            }
        } else{
            companyInfoList = new ArrayList<>();
            companyInfoList=companyInfoService.selectAll(user);
        }

        modelAndView.addObject("companys", companyInfoList);

        return modelAndView;
    }


    @RequestMapping("/companysearch")
    @ResponseBody
    public ModelAndView companySearch1(String totalpro,String time1,String time2,HttpServletRequest request){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("search");
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        System.out.print("---------"+totalpro+time1+time2);
        List<Storeage> storeageList = storeageService.selectAll(user);
        List<Machine> machineList = machineService.selectAll(user);
        List<Website> websiteList = websiteService.selectAll(user);
        List<Delivery> deliveryList = deliveryService.selectAll(user);
        List<CompanyInfo> companyInfoList = new ArrayList<>();
        if(totalpro!=null){
            companyInfoList = new ArrayList<>();
            //String ins = totalpro.replace("[\"", "").replace("\",\"", ",").replace("\"]", "");
            if(totalpro.contains("3")){
                for(Storeage e : storeageList){
                    companyInfoList.add(companyInfoService.selectById(e.getCompanyId()));
                }
            }else if(totalpro.contains("4")){
                for(Machine e : machineList){
                    companyInfoList.add(companyInfoService.selectById(e.getCompanyId()));
                }
            }else if(totalpro.contains("1")){
                for(Website e : websiteList){
                    companyInfoList.add(companyInfoService.selectById(e.getCompanyId()));
                }
            }else if(totalpro.contains("2")){
                for(Delivery e : deliveryList){
                    companyInfoList.add(companyInfoService.selectById(e.getCompanyId()));
                }
            }
        } else{
            companyInfoList = new ArrayList<>();
            companyInfoList=companyInfoService.selectAll(user);
        }

        modelAndView.addObject("companys", companyInfoList);

        return modelAndView;
    }

}

