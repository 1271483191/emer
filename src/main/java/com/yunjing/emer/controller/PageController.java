package com.yunjing.emer.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sun.org.apache.xpath.internal.operations.Mod;
import com.yunjing.emer.entity.*;
import com.yunjing.emer.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.crypto.Mac;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

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

    @Autowired
    LoginService loginService;

    @RequestMapping("/toJurAdmin")
    public ModelAndView toJurAdmin(HttpServletRequest request){
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("jur-admin");

        List<User> userList = userService.selectUserListByPass(user, 0);
        modelAndView.addObject("users", userList);

        return modelAndView;
    }

    @RequestMapping("/toPassUser")
    public String toPassUser(String userId){

        Integer userIds = userId == null ? 0 : Integer.parseInt(userId.trim());
        boolean result = userService.passUser(userIds);
        System.out.println(result);


        return "redirect:toJurAdmin";
    }

    @RequestMapping("/toCompanyInfo")
    @ResponseBody
    public ModelAndView toCompanyInfo(Integer page, HttpServletRequest request){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("company_info");
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");

        if(page == null){
            page = 1;
        }

        PageHelper.startPage(page,5);
        PageInfo<CompanyInfo> companyInfoList = new PageInfo<>(companyInfoService.selectByPage(user));
        //System.out.println(companyInfoList);
        System.out.println(companyInfoList.getList());

        modelAndView.addObject("companyInfos", companyInfoList);
        return modelAndView;
    }



    @RequestMapping("/updateCompanyInfo")
    public String updateCompanyInfo(CompanyInfo companyInfo){
        companyInfoService.update(companyInfo);

        return "redirect:toCompanyInfo";
    }

    @RequestMapping("/toDelivery")
    @ResponseBody
    public ModelAndView toDelivery(Integer page, HttpServletRequest request){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("delivery");
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");

        if(page == null){
            page = 1;
        }

        PageHelper.startPage(page,5);
        PageInfo<Delivery> deliveryList = new PageInfo<>(deliveryService.selectByPage(user));
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

        return "redirect:toDelivery";
    }

    @RequestMapping("/updateDelivery")
    public String updateDelivery(Delivery delivery){
        System.out.println(delivery);
        deliveryService.update(delivery);

        return "redirect:toDelivery";
    }

    @RequestMapping("/")
    public String toIndex2(){
        return "redirect:/toIndex";
    }

    @RequestMapping("/toIndex")
    @ResponseBody
    public ModelAndView toIndex(Integer page, HttpServletRequest request){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");

        if(page == null){
            page = 1;
        }

        PageHelper.startPage(page,20);
        PageInfo<CompanyInfo> companyInfoList = new PageInfo<>(companyInfoService.selectByPage(user));
        //System.out.println(companyInfoList);
        System.out.println(companyInfoList.getList());


        List websiteList = websiteService.selectAll(user);
        List deliveryList = deliveryService.selectAll(user);
        List machineList = machineService.selectAll(user);
        List storeageList = storeageService.selectAll(user);

        int websiteNum = websiteList.size();
        int deliveryNum = deliveryList.size();
        int machineNum = machineList.size();
        int storeageNum = storeageList.size();

        Map baseInfoMap = new HashMap();
        baseInfoMap.put("websiteNum", websiteNum);
        baseInfoMap.put("deliveryNum", deliveryNum);
        baseInfoMap.put("machineNum", machineNum);
        baseInfoMap.put("storeageNum", storeageNum);
        baseInfoMap.put("total", websiteNum + deliveryNum + machineNum + storeageNum);
        baseInfoMap.put("companyInfoList", companyInfoList);
        System.out.println(baseInfoMap);

        modelAndView.addObject("baseInfoMap", baseInfoMap);

        return modelAndView;
    }

    @RequestMapping("/toMachine")
    @ResponseBody
    public ModelAndView toMachine(Integer page, HttpServletRequest request){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("machine");
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");

        if(page == null){
            page = 1;
        }

        PageHelper.startPage(page,5);
        PageInfo<Machine> machineList = new PageInfo<>(machineService.selectByPage(user));
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

        return "redirect:toMachine";
    }

    @RequestMapping("/updateMachine")
    public String updateMachine(Machine machine){
        System.out.println(machine);
        machineService.update(machine);

        return "redirect:toMachine";
    }

    @RequestMapping("/toStoreage")
    @ResponseBody
    public ModelAndView toStoreage(Integer page, HttpServletRequest request){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("storeage");
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");

        if(page == null){
            page = 1;
        }

        PageHelper.startPage(page,5);
        PageInfo<Storeage> storeageList = new PageInfo<>(storeageService.selectByPage(user));
        //System.out.println(companyInfoList);

        List<CompanyInfo> companyInfoList = new ArrayList<>();

        for(Storeage e : storeageList.getList()){
            companyInfoList.add(companyInfoService.selectById(e.getCompanyId()));
        }
        Map dateMap = new HashMap();
        dateMap.put("date", 1);

        modelAndView.addObject("companys", companyInfoList);
        modelAndView.addObject("storeages", storeageList);
        modelAndView.addObject("dateMap", dateMap);

        return modelAndView;
    }




    @RequestMapping("/deleteStoreage")
    public String deleteStoreage(String companyId){
        int id = companyId.trim() == null ? 0 : Integer.parseInt(companyId.trim());
        boolean result = storeageService.deleteByCId(id);
        System.out.println(id);
        System.out.println(result);

        return "redirect:toStoreage";
    }

    @RequestMapping("/updateStoreage")
    public String updateStoreage(Storeage storeage){
        System.out.println(storeage);
        storeageService.update(storeage);

        return "redirect:toStoreage";
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

        return "redirect:toUser";
    }

    @RequestMapping("/updateUser")
    public String updateUser(User user){
        System.out.println(user);
        userService.update(user);

        return "redirect:toUser";
    }

    @RequestMapping("/toWebsite")
    @ResponseBody
    public ModelAndView toWebsite(Integer page, HttpServletRequest request){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("website");
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");

        if(page == null){
            page = 1;
        }

        PageHelper.startPage(page,5);
        PageInfo<Website> websiteList = new PageInfo<>(websiteService.selectByPage(user));
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

        return "redirect:toWebsite";
    }

    @RequestMapping("/updateWebsite")
    public String updateWebsite(Website website){
        System.out.println(website);
        websiteService.update(website);

        return "redirect:toWebsite";
    }

    @RequestMapping("/toInsertUser")
    public String toInsertUser(){
        return "insert_user";
    }

    @RequestMapping("/insertUser")
    public String insertUser(User user){

        String src = "insert_false";
        System.out.println(user);
        user.setPass(0);
        boolean result = userService.insertUser(user);
        System.out.println(result);

        if(result){
            src = "redirect:toLogin";
        }

        return src;
    }

    @RequestMapping("/toIndexMain")
    public String toIndexMain(){
        return "indexMain";
    }

    @RequestMapping("/toLogin")
    public String toLogin(HttpServletRequest request){
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        if(user != null){
            session.setAttribute("user", null);
        }
        return "login";
    }

    @RequestMapping("/login")
    public String login(String username, String password, HttpServletRequest request){

        String src = "redirect:toLogin";
        System.out.println("username:" + username + ",password:" + password);
        int result = loginService.login(username, password);
        System.out.println("result:" + result);
        switch (result){
            case -1:
                src = "login_false";
                break;
            case 0:
                src = "pass_false";
                break;
            case 1:{
                src = "redirect:toIndex";
                HttpSession session = request.getSession();
                User user = loginService.getUser(username,password);
                System.out.println(user);
                session.setAttribute("user", user);
            }
        }


        return src;
    }

    @RequestMapping("/toRegist")
    public String toRegist(){
        return "regist";
    }

    @RequestMapping("/toSearch")
    public String toSearch(){
        return "search";
    }

    @RequestMapping("/toDeliverShow")
    @ResponseBody
    public ModelAndView toDeliverShow(Integer page, HttpServletRequest request){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("deliver-show");
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");

        /*if(page == null){
            page = 1;
        }

        PageHelper.startPage(page,10);
        PageInfo<Delivery> deliveryList = new PageInfo<>(deliveryService.selectByPage(user));*/
        //System.out.println(companyInfoList);

        List<Delivery> deliveryList = deliveryService.selectAll(user);
        List<CompanyInfo> companyInfoList = new ArrayList<>();

        for(Delivery e : deliveryList){
            companyInfoList.add(companyInfoService.selectById(e.getCompanyId()));
        }

        Map dateMap = new HashMap();
        dateMap.put("date", 1);

        modelAndView.addObject("companys", companyInfoList);
        modelAndView.addObject("deliveries", deliveryList);
        modelAndView.addObject("dateMap", dateMap);

        return modelAndView;
    }

    @RequestMapping("/toDeliveryShowByDate")
    @ResponseBody
    public ModelAndView toDeliveryShowByDate(Integer page, HttpServletRequest request, String time1, String time2) throws ParseException {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("deliver-show");
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");



        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date times1 = simpleDateFormat.parse(time1);
        Date times2 = simpleDateFormat.parse(time2);

        System.out.println(times1);
        System.out.println(times2);

        Map dateMap = new HashMap();
        dateMap.put("date", 1);
        dateMap.put("time1", time1);
        dateMap.put("time2", time2);

        /*if(page == null){
            page = 1;
        }

        PageHelper.startPage(page,10);
        PageInfo<Delivery> deliveryList = new PageInfo<>(deliveryService.selectByPageDate(user, times1, times2));
        //System.out.println(companyInfoList);*/

        List<Delivery> deliveryList = deliveryService.selectByDate(user, times1, times2);
        List<CompanyInfo> companyInfoList = new ArrayList<>();

        for(Delivery e : deliveryList){
            System.out.println(e);
            companyInfoList.add(companyInfoService.selectById(e.getCompanyId()));
        }

        modelAndView.addObject("companys", companyInfoList);
        modelAndView.addObject("deliveries", deliveryList);
        modelAndView.addObject("dateMap", dateMap);

        return modelAndView;
    }

    @RequestMapping("/toStoreageShow")
    @ResponseBody
    public ModelAndView toStoreageShow(Integer page, HttpServletRequest request){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("sorage-show");
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");

        if(page == null){
            page = 1;
        }

        /*PageHelper.startPage(page,10);
        PageInfo<Storeage> storeageList = new PageInfo<>(storeageService.selectByPage(user));*/
        //System.out.println(companyInfoList);
        List<Storeage> storeageList = storeageService.selectAll(user);

        List<CompanyInfo> companyInfoList = new ArrayList<>();

        for(Storeage e : storeageList){
            companyInfoList.add(companyInfoService.selectById(e.getCompanyId()));
        }

        Map dateMap = new HashMap();
        dateMap.put("date", 0);

        modelAndView.addObject("companys", companyInfoList);
        modelAndView.addObject("storeages", storeageList);
        modelAndView.addObject("dateMap", dateMap);

        return modelAndView;
    }

    @RequestMapping("/toStoreageShowByDate")
    @ResponseBody
    public ModelAndView toStoreageShowByDate(Integer page, HttpServletRequest request, String time1, String time2) throws ParseException {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("sorage-show");
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");



        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date times1 = simpleDateFormat.parse(time1);
        Date times2 = simpleDateFormat.parse(time2);

        System.out.println(times1);
        System.out.println(times2);

        Map dateMap = new HashMap();
        dateMap.put("date", 1);
        dateMap.put("time1", time1);
        dateMap.put("time2", time2);

        if(page == null){
            page = 1;
        }

        /*PageHelper.startPage(page,10);
        PageInfo<Storeage> storeageList = new PageInfo<>(storeageService.selectByPageDate(user, times1, times2));*/
        //System.out.println(companyInfoList);
        List<Storeage> storeageList = storeageService.selectByDate(user, times1, times2);

        List<CompanyInfo> companyInfoList = new ArrayList<>();

        for(Storeage e : storeageList){
            System.out.println(e);
            companyInfoList.add(companyInfoService.selectById(e.getCompanyId()));
        }

        modelAndView.addObject("companys", companyInfoList);
        modelAndView.addObject("storeages", storeageList);
        modelAndView.addObject("dateMap", dateMap);

        return modelAndView;
    }

    @RequestMapping("/toSupplyShow")
    @ResponseBody
    public ModelAndView toSupplyShow(Integer page, HttpServletRequest request){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("supply-show");
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");

        /*if(page == null){
            page = 1;
        }

        PageHelper.startPage(page,10);
        PageInfo<Website> websiteList = new PageInfo<>(websiteService.selectByPage(user));*/
        //System.out.println(companyInfoList);
        List<Website> websiteList = websiteService.selectAll(user);

        List<CompanyInfo> companyInfoList = new ArrayList<>();

        for(Website e : websiteList){
            companyInfoList.add(companyInfoService.selectById(e.getCompanyId()));
        }
        Map dateMap = new HashMap();
        dateMap.put("date", 0);

        modelAndView.addObject("companys", companyInfoList);
        modelAndView.addObject("websites", websiteList);
        modelAndView.addObject("dateMap", dateMap);

        return modelAndView;
    }

    @RequestMapping("/toSupplyShowByDate")
    @ResponseBody
    public ModelAndView toSupplyShowByDate(Integer page, HttpServletRequest request, String time1, String time2) throws ParseException {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("supply-show");
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");



        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date times1 = simpleDateFormat.parse(time1);
        Date times2 = simpleDateFormat.parse(time2);

        System.out.println(times1);
        System.out.println(times2);

        Map dateMap = new HashMap();
        dateMap.put("date", 1);
        dateMap.put("time1", time1);
        dateMap.put("time2", time2);

        /*if(page == null){
            page = 1;
        }

        PageHelper.startPage(page,10);
        PageInfo<Website> websiteList = new PageInfo<>(websiteService.selectByPageDate(user, times1, times2));*/
        //System.out.println(companyInfoList);
        List<Website> websiteList = websiteService.selectByDate(user, times1, times2);

        List<CompanyInfo> companyInfoList = new ArrayList<>();

        for(Website e : websiteList){
            companyInfoList.add(companyInfoService.selectById(e.getCompanyId()));
        }

        modelAndView.addObject("companys", companyInfoList);
        modelAndView.addObject("websites", websiteList);
        modelAndView.addObject("dateMap", dateMap);

        return modelAndView;
    }



    @RequestMapping("/toMachineShow")
    @ResponseBody
    public ModelAndView toMachineShow(Integer page, HttpServletRequest request){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("mechining-show");
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");

        if(page == null){
            page = 1;
        }

        /*PageHelper.startPage(page,10);
        PageInfo<Machine> machineList = new PageInfo<>(machineService.selectByPage(user));*/
        //System.out.println(companyInfoList);
        List<Machine> machineList = machineService.selectAll(user);

        List<CompanyInfo> companyInfoList = new ArrayList<>();

        for(Machine e : machineList){
            companyInfoList.add(companyInfoService.selectById(e.getCompanyId()));
        }

        Map dateMap = new HashMap();
        dateMap.put("date", 0);

        modelAndView.addObject("companys", companyInfoList);
        modelAndView.addObject("machines", machineList);
        modelAndView.addObject("dateMap", dateMap);

        return modelAndView;
    }

    @RequestMapping("/toMachineShowByDate")
    @ResponseBody
    public ModelAndView toMachineShowByDate(Integer page, HttpServletRequest request, String time1, String time2) throws ParseException {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("mechining-show");
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");



        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date times1 = simpleDateFormat.parse(time1);
        Date times2 = simpleDateFormat.parse(time2);

        System.out.println(times1);
        System.out.println(times2);

        Map dateMap = new HashMap();
        dateMap.put("date", 1);
        dateMap.put("time1", time1);
        dateMap.put("time2", time2);

        /*if(page == null){
            page = 1;
        }

        PageHelper.startPage(page,10);
        PageInfo<Machine> machineList = new PageInfo<>(machineService.selectByPageDate(user, times1, times2));*/
        //System.out.println(companyInfoList);
        List<Machine> machineList = machineService.selectByDate(user, times1, times2);

        List<CompanyInfo> companyInfoList = new ArrayList<>();

        for(Machine e : machineList){
            System.out.println(e);
            companyInfoList.add(companyInfoService.selectById(e.getCompanyId()));
        }

        modelAndView.addObject("companys", companyInfoList);
        modelAndView.addObject("machines", machineList);
        modelAndView.addObject("dateMap", dateMap);

        return modelAndView;
    }

    /*@RequestMapping("/toSupplyStatistics")
    @ResponseBody
    public ModelAndView toSupplyStatistics(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("supply-statistics");


        return modelAndView;
    }*/

    @RequestMapping("/toWebSite2")
    @ResponseBody
    public ModelAndView toWebSite2(String websiteId){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("website2");
        Website website = websiteService.selectById(websiteId);
        modelAndView.addObject("website", website);

        return modelAndView;

    }

    @RequestMapping("/toStoreageStatistics2")
    @ResponseBody
    public ModelAndView toStoreageStatistics2(String websiteId){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("website2");
        Website website = websiteService.selectById(websiteId);
        modelAndView.addObject("website", website);

        return modelAndView;

    }

    @RequestMapping("/toDeliveryStatistics")
    @ResponseBody
    public ModelAndView toDeliveryStatistics(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("deliver-statistics");


        return modelAndView;
    }

    @RequestMapping("/toUserAdmin")
    public ModelAndView toUserAdmin(HttpServletRequest request, Integer page){
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("user-admin");

        /*if(page == null){
            page = 1;
        }

        PageHelper.startPage(page,20);
        PageInfo<User> userList = new PageInfo<>(userService.selectUserByPass(user));
        modelAndView.addObject("users", userList);*/
        modelAndView.addObject("user", user);

        return modelAndView;
    }

    @RequestMapping("/changeUser")
    public String changeUser(User user, HttpServletRequest request){
        System.out.println(user);
        userService.update(user);
        HttpSession session = request.getSession();
        User rUser = (User) session.getAttribute("user");
        User newUser = loginService.getUser(rUser.getUsername(),rUser.getPassword());
        System.out.println(newUser);
        session.setAttribute("user", newUser);
        return "redirect:toUserAdmin";
    }

    @RequestMapping("/toChangeUser")
    public String toChangeUser(User user, HttpServletRequest request){
        System.out.println(user);
        userService.update(user);
        HttpSession session = request.getSession();
        User rUser = (User) session.getAttribute("user");
        User newUser = loginService.getUser(rUser.getUsername(),rUser.getPassword());
        System.out.println(newUser);
        session.setAttribute("user", newUser);
        return "redirect:toUserListAdmin";
    }

    @RequestMapping("/toUserListAdmin")
    public ModelAndView toUserListAdmin(HttpServletRequest request){
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("userlist-admin");

        List<User> userList = userService.selectUserListByPass(user, 1);
        modelAndView.addObject("users", userList);

        return modelAndView;
    }

    @RequestMapping("/toDeleteUser")
    public String toDeleteUser(Integer userId){

        System.out.println("UserID:" + userId);
        boolean result = userService.deleteById(userId);
        System.out.println(result);
        return "redirect:toUserListAdmin";
    }

    @RequestMapping("/toStopWebsite")
    public String toStopWebsite(Website website){
        website.setState(2);
        boolean result = websiteService.update(website);
        System.out.println(result);

        return "redirect:toSupplyShow";
    }

    @RequestMapping("/toStopStoreage")
    public String toStopStoreage(Storeage storeage){

        storeage.setState(2);
        boolean result = storeageService.update(storeage);
        System.out.println(result);
        return "redirect:toStoreageShow";
    }

    @RequestMapping("/toStopMachine")
    public String toStopMachine(Machine machine){
        machine.setState(2);
        boolean result = machineService.update(machine);
        System.out.println(result);
        return "redirect:toMachineShow";
    }

    @RequestMapping("/toStopDelivery")
    public String toStopDelivery(Delivery delivery){
        delivery.setState(2);
        boolean result = deliveryService.update(delivery);
        System.out.println(result);
        return "redirect:toDeliverShow";
    }

    @RequestMapping("/toAddUser")
    public String toAddUser(){
        return "add-user";
    }

    @RequestMapping("/addUser")
    public String addUser(User user){
        String src = "insert_false";
        System.out.println(user);
        user.setPass(1);
        boolean result = userService.insertUser(user);
        System.out.println(result);

        if(result){
            src = "redirect:toUserListAdmin";
        }

        return src;
    }
}

