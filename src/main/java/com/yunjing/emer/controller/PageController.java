package com.yunjing.emer.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yunjing.emer.entity.*;
import com.yunjing.emer.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PageController {
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

    @RequestMapping("/toCompanyInfo")
    @ResponseBody
    public ModelAndView toCompanyInfo(Integer page){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("company_info");

        if(page == null){
            page = 1;
        }

        PageHelper.startPage(page,5);
        PageInfo<CompanyInfo> companyInfoList = new PageInfo<>(companyInfoService.selectByPage());
        //System.out.println(companyInfoList);
        System.out.println(companyInfoList.getList());

        modelAndView.addObject("companyInfos", companyInfoList);
        return modelAndView;
    }



    @RequestMapping("/updateCompanyInfo")
    public String updateCompanyInfo(CompanyInfo companyInfo){
        companyInfoService.update(companyInfo);

        return "redirect:/toCompanyInfo";
    }

    @RequestMapping("/toDelivery")
    @ResponseBody
    public ModelAndView toDelivery(Integer page){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("delivery");


        if(page == null){
            page = 1;
        }

        PageHelper.startPage(page,5);
        PageInfo<Delivery> deliveryList = new PageInfo<>(deliveryService.selectByPage());
        //System.out.println(companyInfoList);

        List<CompanyInfo> companyInfoList = new ArrayList<>();

        for(Delivery e : deliveryList.getList()){
            companyInfoList.add(companyInfoService.selectById(e.getCompanyId()));
        }

        modelAndView.addObject("companys", companyInfoList);
        modelAndView.addObject("deliverys", deliveryList);

        return modelAndView;
    }

    @RequestMapping("/deleteDelivery")
    public String deleteDelivery(String companyId){
        int id = companyId.trim() == null ? 0 : Integer.parseInt(companyId.trim());
        boolean result = deliveryService.deleteByCId(id);
        System.out.println(id);
        System.out.println(result);

        return "redirect:/toDelivery";
    }

    @RequestMapping("/updateDelivery")
    public String updateDelivery(Delivery delivery){
        System.out.println(delivery);
        deliveryService.update(delivery);

        return "redirect:/toDelivery";
    }

    @RequestMapping("/toIndex")
    @ResponseBody
    public ModelAndView toIndex(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @RequestMapping("/toMachine")
    @ResponseBody
    public ModelAndView toMachine(Integer page){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("machine");

        if(page == null){
            page = 1;
        }

        PageHelper.startPage(page,5);
        PageInfo<Machine> machineList = new PageInfo<>(machineService.selectByPage());
        //System.out.println(companyInfoList);

        List<CompanyInfo> companyInfoList = new ArrayList<>();

        for(Machine e : machineList.getList()){
            companyInfoList.add(companyInfoService.selectById(e.getCompanyId()));
        }

        modelAndView.addObject("companys", companyInfoList);
        modelAndView.addObject("machines", machineList);

        return modelAndView;
    }

    @RequestMapping("/deleteMachine")
    public String deleteMachine(String companyId){
        int id = companyId.trim() == null ? 0 : Integer.parseInt(companyId.trim());
        boolean result = machineService.deleteByCId(id);
        System.out.println(id);
        System.out.println(result);

        return "redirect:/toMachine";
    }

    @RequestMapping("/updateMachine")
    public String updateMachine(Machine machine){
        System.out.println(machine);
        machineService.update(machine);

        return "redirect:/toMachine";
    }

    @RequestMapping("/toStoreage")
    @ResponseBody
    public ModelAndView toStoreage(Integer page){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("storeage");

        if(page == null){
            page = 1;
        }

        PageHelper.startPage(page,5);
        PageInfo<Storeage> storeageList = new PageInfo<>(storeageService.selectByPage());
        //System.out.println(companyInfoList);

        List<CompanyInfo> companyInfoList = new ArrayList<>();

        for(Storeage e : storeageList.getList()){
            companyInfoList.add(companyInfoService.selectById(e.getCompanyId()));
        }

        modelAndView.addObject("companys", companyInfoList);
        modelAndView.addObject("storeages", storeageList);

        return modelAndView;
    }

    @RequestMapping("/deleteStoreage")
    public String deleteStoreage(String companyId){
        int id = companyId.trim() == null ? 0 : Integer.parseInt(companyId.trim());
        boolean result = storeageService.deleteByCId(id);
        System.out.println(id);
        System.out.println(result);

        return "redirect:/toStoreage";
    }

    @RequestMapping("/updateStoreage")
    public String updateStoreage(Storeage storeage){
        System.out.println(storeage);
        storeageService.update(storeage);

        return "redirect:/toStoreage";
    }

    @RequestMapping("/toUser")
    @ResponseBody
    public ModelAndView toUser(Integer page){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("user");

        if(page == null){
            page = 1;
        }

        PageHelper.startPage(page,5);
        PageInfo<User> userList = new PageInfo<>(userService.selectByPage());

        modelAndView.addObject("users", userList);

        return modelAndView;
    }

    @RequestMapping("/deleteUser")
    public String deleteUser(String userId){
        int id = userId.trim() == null ? 0 : Integer.parseInt(userId.trim());
        boolean result = userService.deleteById(id);
        System.out.println(id);
        System.out.println(result);

        return "redirect:/toUser";
    }

    @RequestMapping("/updateUser")
    public String updateUser(User user){
        System.out.println(user);
        userService.update(user);

        return "redirect:/toUser";
    }

    @RequestMapping("/toWebsite")
    @ResponseBody
    public ModelAndView toWebsite(Integer page){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("website");

        if(page == null){
            page = 1;
        }

        PageHelper.startPage(page,5);
        PageInfo<Website> websiteList = new PageInfo<>(websiteService.selectByPage());
        //System.out.println(companyInfoList);

        List<CompanyInfo> companyInfoList = new ArrayList<>();

        for(Website e : websiteList.getList()){
            companyInfoList.add(companyInfoService.selectById(e.getCompanyId()));
        }

        modelAndView.addObject("companys", companyInfoList);
        modelAndView.addObject("websites", websiteList);

        return modelAndView;
    }

    @RequestMapping("/deleteWebsite")
    public String deleteWebsite(String companyId){
        int id = companyId.trim() == null ? 0 : Integer.parseInt(companyId.trim());
        boolean result = websiteService.deleteByCId(id);
        System.out.println(id);
        System.out.println(result);

        return "redirect:/toWebsite";
    }

    @RequestMapping("/updateWebsite")
    public String updateWebsite(Website website){
        System.out.println(website);
        websiteService.update(website);

        return "redirect:/toWebsite";
    }

    @RequestMapping("/toInsertUser")
    public String toInsertUser(){
        return "insert_user";
    }

    @RequestMapping("/insertUser")
    public String insertUser(User user){

        boolean result = userService.insertUser(user);
        System.out.println(result);
        return "redirect:/toUser";
    }
}
