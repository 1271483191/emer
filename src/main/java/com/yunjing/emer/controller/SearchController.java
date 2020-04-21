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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

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


    @RequestMapping("/companysearchBytime")
    @ResponseBody
    public ModelAndView companysearchBytime(String totalpro,String time1,String time2,HttpServletRequest request)throws ParseException {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("search");
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        System.out.print("---------"+totalpro+"|"+time1+"|"+time2);
        System.out.print("---------"+user.getName());
        List<CompanyInfo> companyInfoList = new ArrayList<>();
        if(!totalpro.equals("[]")){
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            if(time1!=""&&time2!=""){
                System.out.print("tnum,time1num,time2num");
                Date date1 = simpleDateFormat.parse(time1);
                Date date2 = simpleDateFormat.parse(time2);
                companyInfoList = new ArrayList<>();
                //String ins = totalpro.replace("[\"", "").replace("\",\"", ",").replace("\"]", "");
                if(totalpro.contains("3")){
                    List<CompanyInfo> list=companyInfoService.selectCompanyInfoByStoreage(user,date1,date2);
                    for(CompanyInfo e : list){
                        companyInfoList.add(e);
                    }
                }
                if(totalpro.contains("4")){
                    List<CompanyInfo> list=companyInfoService.selectCompanyInfoByMachine(user,date1,date2);
                    for(CompanyInfo e : list){
                        companyInfoList.add(e);
                    }
                }
                if(totalpro.contains("1")){
                    List<CompanyInfo> list=companyInfoService.selectCompanyInfoByWebsite(user,date1,date2);
                    for(CompanyInfo e : list){
                        companyInfoList.add(e);
                    }
                }
                if(totalpro.contains("2")){
                    List<CompanyInfo> list=companyInfoService.selectCompanyInfoByDelivery(user,date1,date2);
                    for(CompanyInfo e : list){
                        companyInfoList.add(e);
                    }
                }
            }else if(time1==""&&time2!=""){
                System.out.print("tnum,time1null,time2num");
                Date date2 = simpleDateFormat.parse(time2);
                companyInfoList = new ArrayList<>();
                if(totalpro.contains("3")){
                    List<CompanyInfo> list=companyInfoService.selectCompanyInfoByStoreageDate2(user,date2);
                    for(CompanyInfo e : list){
                        companyInfoList.add(e);
                    }
                }
                if(totalpro.contains("4")){
                    List<CompanyInfo> list=companyInfoService.selectCompanyInfoByMachineDate2(user,date2);
                    for(CompanyInfo e : list){
                        companyInfoList.add(e);
                    }
                }
                if(totalpro.contains("1")){
                    List<CompanyInfo> list=companyInfoService.selectCompanyInfoByWebsiteDate2(user,date2);
                    for(CompanyInfo e : list){
                        companyInfoList.add(e);
                    }
                }
                if(totalpro.contains("2")){
                    List<CompanyInfo> list=companyInfoService.selectCompanyInfoByDeliveryDate2(user,date2);
                    for(CompanyInfo e : list){
                        companyInfoList.add(e);
                    }
                }
            }else if(time1!=""&&time2==""){
                System.out.print("tnum,time1num,time2ull");
                Date date1 = simpleDateFormat.parse(time1);
                companyInfoList = new ArrayList<>();
                if(totalpro.contains("3")){
                    List<CompanyInfo> list=companyInfoService.selectCompanyInfoByStoreageDate1(user,date1);
                    for(CompanyInfo e : list){
                        companyInfoList.add(e);
                    }
                }
                if(totalpro.contains("4")){
                    List<CompanyInfo> list=companyInfoService.selectCompanyInfoByMachineDate1(user,date1);
                    for(CompanyInfo e : list){
                        companyInfoList.add(e);
                    }
                }
                if(totalpro.contains("1")){
                    List<CompanyInfo> list=companyInfoService.selectCompanyInfoByWebsiteDate1(user,date1);
                    for(CompanyInfo e : list){
                        companyInfoList.add(e);
                    }
                }
                if(totalpro.contains("2")){
                    List<CompanyInfo> list=companyInfoService.selectCompanyInfoByDeliveryDate1(user,date1);
                    for(CompanyInfo e : list){
                        companyInfoList.add(e);
                    }
                }
            }else if(time1==""&&time2==""){
                System.out.print("tnum,time1null,time2null");
                List<Storeage> storeageList = storeageService.selectAll(user);
                List<Machine> machineList = machineService.selectAll(user);
                List<Website> websiteList = websiteService.selectAll(user);
                List<Delivery> deliveryList = deliveryService.selectAll(user);
                companyInfoList = new ArrayList<>();
                if(totalpro.contains("3")){
                    for(Storeage e : storeageList){
                        companyInfoList.add(companyInfoService.selectById(e.getCompanyId()));
                    }
                }
                if(totalpro.contains("4")){
                    for(Machine e : machineList){
                        companyInfoList.add(companyInfoService.selectById(e.getCompanyId()));
                    }
                }
                if(totalpro.contains("1")){
                    for(Website e : websiteList){
                        companyInfoList.add(companyInfoService.selectById(e.getCompanyId()));
                    }
                }
                if(totalpro.contains("2")){
                    for(Delivery e : deliveryList){
                        companyInfoList.add(companyInfoService.selectById(e.getCompanyId()));
                    }
                }
            }
        } else{
            System.out.print("tnull,time1null,time2null");
            companyInfoList = new ArrayList<>();
            companyInfoList=companyInfoService.selectAll(user);
        }

        modelAndView.addObject("companys", companyInfoList);

        return modelAndView;
    }

}

