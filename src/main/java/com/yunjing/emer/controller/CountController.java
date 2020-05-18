package com.yunjing.emer.controller;

import com.yunjing.emer.dao.*;
import com.yunjing.emer.entity.*;
import com.yunjing.emer.service.DeliveryService;
import com.yunjing.emer.service.WebsiteService;
import com.yunjing.emer.util.PropertiesUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class CountController {

    @Autowired
    private CompanyInfoDao companyInfoDao;

    @Autowired
    private WebsiteDao websiteDao;

    @Autowired
    private DeliveryDao deliveryDao;

    @Autowired
    private DeliveryService deliveryService;

    @Autowired
    private WebsiteService websiteService;

    @Autowired
    private ProvincesDao provincesDao;

    @Autowired
    private CitiesDao citiesDao;

    @Autowired
    private AreasDao areasDao;



    @RequestMapping("/toSupplyCount")
    public ModelAndView toSupplyCount(HttpServletRequest request){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("supply-count");

        /*计时*/
        Date date1 = new Date();
        Long time1 = date1.getTime();
        long total = 0;

        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");

//        StringBuffer promap = new StringBuffer();
//        promap.append("[");
//        int type = user.getType();
//        if(type == 0){
//
//            List<Provinces> list = new ArrayList<Provinces>();
//            ProvincesExample provexample = new ProvincesExample();
//            list = provincesDao.selectByExample(provexample);
//            User myUser = new User();
//            myUser.setType(3);
//
//            for (int i = 0; i < list.size(); i++) {
//
//                promap.append("{'name':'"+list.get(i).getName()+"',"+ "'pId':0,'id':" + list.get(i).getCode() + ",type:'0'},");
//                List<Cities> list2 = new ArrayList<Cities>();
//                CitiesExample citiesExample = new CitiesExample();
//                citiesExample.createCriteria().andProvincecodeEqualTo(list.get(i).getCode());
//                list2 = citiesDao.selectByExample(citiesExample);
//
//
//                for (int j = 0; j < list2.size(); j++) {
//
//                    promap.append("{'name':'"+list2.get(j).getName()+"',"+ "'pId':"+list2.get(j).getProvincecode()+",'id':" + list2.get(j).getCode() + ",type:'1'},");
//                    List<Areas> list3 = new ArrayList<Areas>();
//                    AreasExample areasExample = new AreasExample();
//                    areasExample.createCriteria().andCitycodeEqualTo(list2.get(j).getCode());
//                    list3 = areasDao.selectByExample(areasExample);
//
//                    for (int k = 0; k < list3.size(); k++) {
//
//
//                        myUser.setProvince(list.get(i).getName());
//                        myUser.setCity(list2.get(j).getName());
//                        myUser.setCounty(list3.get(k).getName());
//                        List<Website> list4 = websiteService.selectWebsiteByCounty(myUser);
//                        if(list4.size() > 0){
//
//                        promap.append("{'name':'"+list3.get(k).getName()+"',"+ "'pId':"+list3.get(k).getCitycode()+",'id':" + list3.get(k).getCode() + ",type:'2'},");
//                        }
//                        for(int l = 0; l < list4.size(); l++){
//                            CompanyInfo companyInfo = companyInfoDao.selectByPrimaryKey(list4.get(l).getCompanyId());
//                            promap.append("{'name':'"+companyInfo.getName()+"',"+ "'pId':"+list3.get(k).getCode()+",'id':" + list4.get(l).getCompanyId() + ",type:'3'},");
//                            System.out.println(companyInfo);
//                            total++;
//                        }
//
//                    }
//                }
//            }
//        }
//        if(type == 1){
//            User myUser = new User();
//            myUser.setType(3);
//            List<Provinces> list = new ArrayList<Provinces>();
//            ProvincesExample provexample = new ProvincesExample();
//            provexample.createCriteria().andNameEqualTo(user.getProvince());
//            list = provincesDao.selectByExample(provexample);
//            promap.append("{'name':'"+list.get(0).getName()+"',"+ "'pId':0,'id':" + list.get(0).getCode() + ",type:'0'},");
//            List<Cities> list2 = new ArrayList<Cities>();
//            CitiesExample citiesExample = new CitiesExample();
//            citiesExample.createCriteria().andProvincecodeEqualTo(list.get(0).getCode());
//            list2 = citiesDao.selectByExample(citiesExample);
//            for (int j = 0; j < list2.size(); j++) {
//                promap.append("{'name':'"+list2.get(j).getName()+"',"+ "'pId':"+list.get(0).getCode()+",'id':" + list2.get(j).getCode() + ",type:'1'},");
//                List<Areas> list3 = new ArrayList<Areas>();
//                AreasExample areasExample = new AreasExample();
//                areasExample.createCriteria().andCitycodeEqualTo(list2.get(j).getCode());
//                list3 = areasDao.selectByExample(areasExample);
//                for (int k = 0; k < list3.size(); k++) {
//                    promap.append("{'name':'"+list3.get(k).getName()+"',"+ "'pId':"+list2.get(j).getCode()+",'id':" + list3.get(k).getCode() + ",type:'2'},");
//                    myUser.setProvince(user.getProvince());
//                    myUser.setCity(list2.get(j).getName());
//                    myUser.setCounty(list3.get(k).getName());
//                    List<Website> list4 = websiteService.selectWebsiteByCounty(myUser);
//                    for(int l = 0; l < list4.size(); l++){
//                        CompanyInfo companyInfo = companyInfoDao.selectByPrimaryKey(list4.get(l).getCompanyId());
//                        promap.append("{'name':'"+companyInfo.getName()+"',"+ "'pId':"+list3.get(k).getCode()+",'id':" + list4.get(l).getCompanyId() + ",type:'3'},");
//                        System.out.println(companyInfo);
//                        total++;
//                    }
//                }
//            }
//        }
//        if(type == 2){
//            User myUser = new User();
//            myUser.setType(3);
//            List<Cities> list2 = new ArrayList<Cities>();
//            CitiesExample citiesExample = new CitiesExample();
//            citiesExample.createCriteria().andNameEqualTo(user.getCity());
//            list2 = citiesDao.selectByExample(citiesExample);
//            promap.append("{'name':'"+list2.get(0).getName()+"',"+ "'pId':0,'id':" + list2.get(0).getCode() + ",type:'1'},");
//            List<Areas> list3 = new ArrayList<Areas>();
//            AreasExample areasExample = new AreasExample();
//            areasExample.createCriteria().andCitycodeEqualTo(list2.get(0).getCode());
//            list3 = areasDao.selectByExample(areasExample);
//            for (int k = 0; k < list3.size(); k++) {
//                promap.append("{'name':'"+list3.get(k).getName()+"',"+ "'pId':"+list3.get(k).getCitycode()+",'id':" + list3.get(k).getCode() + ",type:'2'},");
//                myUser.setProvince(user.getProvince());
//                myUser.setCity(user.getCity());
//                myUser.setCounty(list3.get(k).getName());
//                List<Website> list4 = websiteService.selectWebsiteByCounty(myUser);
//                for(int l = 0; l < list4.size(); l++){
//                    CompanyInfo companyInfo = companyInfoDao.selectByPrimaryKey(list4.get(l).getCompanyId());
//                    promap.append("{'name':'"+companyInfo.getName()+"',"+ "'pId':"+list3.get(k).getCode()+",'id':" + list4.get(l).getCompanyId() + ",type:'3'},");
//                    System.out.println(companyInfo);
//                    total++;
//                }
//            }
//        }
//        if(type == 3){
//            User myUser = new User();
//            myUser.setType(3);
//            List<Areas> list3 = new ArrayList<Areas>();
//            AreasExample areasExample = new AreasExample();
//            areasExample.createCriteria().andNameEqualTo(user.getCounty());
//            list3 = areasDao.selectByExample(areasExample);
//            promap.append("{'name':'"+list3.get(0).getName()+"',"+ "'pId':0,'id':" + list3.get(0).getCode() + ",type:'2'},");
//            myUser.setProvince(user.getProvince());
//            myUser.setCity(user.getCity());
//            myUser.setCounty(user.getCounty());
//            List<Website> list4 = websiteService.selectWebsiteByCounty(myUser);
//            for(int l = 0; l < list4.size(); l++){
//                CompanyInfo companyInfo = companyInfoDao.selectByPrimaryKey(list4.get(l).getCompanyId());
//                promap.append("{'name':'"+companyInfo.getName()+"',"+ "'pId':" + list3.get(0).getCode() + ",'id':" + list4.get(l).getCompanyId() + ",type:'3'},");
//                System.out.println(companyInfo);
//                total++;
//            }
//        }
//
//        promap.append("]");
//        System.out.println(promap);
        String promap = "";
        PropertiesUtil p = new PropertiesUtil("WebsiteTree.properties");
        int type = user.getType();
        if(type == 0){
            promap = p.readProperty("all0");
        }
        if(type == 1){
            promap = p.readProperty(user.getProvince()+1);
        }
        if(type == 2){
            promap = p.readProperty(user.getCity()+2);
        }
        if(type == 3){
            promap = p.readProperty(user.getCounty()+3);
        }
        modelAndView.addObject("promap", promap.toString());
        List<CompanyInfo> companys = companyInfoDao.selectCompanyInfoByLevel(user);
        modelAndView.addObject("companys", companys);

        CompanyInfo companyall = companyInfoDao.sumByUser(user);
        if(companyall == null){
            companyall = new CompanyInfo();
            companyall.setInDay(0.0);
            companyall.setOutDay(0.0);
            companyall.setSaveDay(0.0);
            companyall.setSocialId("无");
            companyall.setLocation("无");
            companyall.setLatitude(new BigDecimal(0));
            companyall.setLongitude(new BigDecimal(0));
            companyall.setCompanyType(-1);
            companyall.setProvince("无");
            companyall.setCity("无");
            companyall.setCounty("无");
            companyall.setPrincipal("无");
            companyall.setPhone("无");
            companyall.setLevel(-1);
            companyall.setActivationStatus("无");
        }
        modelAndView.addObject("companyall", companyall);

        System.out.println(user);
        System.out.println("companyall:" + companyall);

        Website websiteall = websiteDao.sumByUser(user);
        if(websiteall == null){
            websiteall = new Website();
            websiteall.setFlourExp(0.0);websiteall.setFlourReal(0.0);websiteall.setRiceExp(0.0);websiteall.setRiceReal(0.0);websiteall.setOilExp(0.0);websiteall.setOilReal(0.0);websiteall.setElseExp(0.0);websiteall.setElseReal(0.0);
        }
        modelAndView.addObject("websiteall", websiteall);
        modelAndView.addObject("flag", false);//是否为单个企业

        /*计时结束*/
        Date date2 = new Date();
        Long time2 = date2.getTime();

        Long totalTime = time2 - time1;


        System.out.println("总用时:" + totalTime);
        System.out.println("查询企业记录数:" + total);

        return modelAndView;
    }

    @RequestMapping("/toSupplyTreeSaerch")
    public ModelAndView toSupplyTreeSaerch( HttpServletRequest request,String level,String txt, String promap) {
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("supply-count");

        System.out.println("level:" + level);
        System.out.println("txt:" + txt);
        System.out.println("promap:" + promap);

        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        if(level.equals("0")){

            List<CompanyInfo> companys = companyInfoDao.selectByLevelAndProvince(user,txt);
            modelAndView.addObject("companys", companys);

            CompanyInfo companyall = companyInfoDao.sumByUserAndProvince(user,txt);


            Website websiteall = websiteDao.sumByUserAndProvince(user,txt);
            if(websiteall == null){
                websiteall = new Website();
                websiteall.setFlourExp(0.0);websiteall.setFlourReal(0.0);websiteall.setRiceExp(0.0);websiteall.setRiceReal(0.0);websiteall.setOilExp(0.0);websiteall.setOilReal(0.0);websiteall.setElseExp(0.0);websiteall.setElseReal(0.0);
            }

            if(companyall == null){
                companyall = new CompanyInfo();
                companyall.setInDay(0.0);
                companyall.setOutDay(0.0);
                companyall.setSaveDay(0.0);
            }

            modelAndView.addObject("companyall", companyall);
            modelAndView.addObject("websiteall", websiteall);
            modelAndView.addObject("flag", false);//是否为单个企业
            System.out.println(0);
            /*ModelAndView mv = new ModelAndView("redirect:/toSupplyCount");
            return mv;*/
        }
        if(level.equals("1")){

            List<CompanyInfo> companys = companyInfoDao.selectByLevelAndCity(user,txt);
            modelAndView.addObject("companys", companys);


            CompanyInfo companyall = companyInfoDao.sumByUserAndCity(user,txt);


            Website websiteall = websiteDao.sumByUserAndCity(user,txt);
            if(websiteall == null){
                websiteall = new Website();
                websiteall.setFlourExp(0.0);websiteall.setFlourReal(0.0);websiteall.setRiceExp(0.0);websiteall.setRiceReal(0.0);websiteall.setOilExp(0.0);websiteall.setOilReal(0.0);websiteall.setElseExp(0.0);websiteall.setElseReal(0.0);
            }

            if(companyall == null){
                companyall = new CompanyInfo();
                companyall.setInDay(0.0);
                companyall.setOutDay(0.0);
                companyall.setSaveDay(0.0);
            }

            modelAndView.addObject("companyall", companyall);
            modelAndView.addObject("websiteall", websiteall);
            modelAndView.addObject("flag", false);//是否为单个企业
            System.out.println(1);

            /*ModelAndView mv = new ModelAndView("redirect:/toSupplyCount");
            return mv;*/
        }
        if(level.equals("2")){

            List<CompanyInfo> companys = companyInfoDao.selectByLevelAndCounty(user,txt);
            modelAndView.addObject("companys", companys);

            CompanyInfo companyall = companyInfoDao.sumByUserAndCountry(user,txt);

            Website websiteall = websiteDao.sumByUserAndCountry(user,txt);
            if(websiteall == null){
                websiteall = new Website();
                websiteall.setFlourExp(0.0);websiteall.setFlourReal(0.0);websiteall.setRiceExp(0.0);websiteall.setRiceReal(0.0);websiteall.setOilExp(0.0);websiteall.setOilReal(0.0);websiteall.setElseExp(0.0);websiteall.setElseReal(0.0);
            }

            if(companyall == null){
                companyall = new CompanyInfo();
                companyall.setInDay(0.0);
                companyall.setOutDay(0.0);
                companyall.setSaveDay(0.0);
            }

            modelAndView.addObject("companyall", companyall);

            modelAndView.addObject("websiteall", websiteall);
            modelAndView.addObject("flag", false);//是否为单个企业
            System.out.println(2);

            /*ModelAndView mv = new ModelAndView("redirect:/toSupplyCount");
            return mv;*/
        }
        if(level.equals("3")){

            List<CompanyInfo> companys = companyInfoDao.selectByLevelAndCounty(user,txt);
            modelAndView.addObject("companys", companys);

            CompanyInfoExample example = new CompanyInfoExample();
            CompanyInfoExample.Criteria criteria = example.createCriteria();
            criteria.andNameEqualTo(txt);

            List<CompanyInfo> companyInfoList = companyInfoDao.selectByExample(example);
            CompanyInfo companyall = companyInfoList.get(0);

            WebsiteExample websiteExample = new WebsiteExample();
            WebsiteExample.Criteria websiteCriteria = websiteExample.createCriteria();
            websiteCriteria.andCompanyIdEqualTo(companyall.getCompanyId());

            Website websiteall = websiteDao.sumByExample(websiteExample);
            if(websiteall == null){
                websiteall = new Website();
                websiteall.setFlourExp(0.0);websiteall.setFlourReal(0.0);websiteall.setRiceExp(0.0);websiteall.setRiceReal(0.0);websiteall.setOilExp(0.0);websiteall.setOilReal(0.0);websiteall.setElseExp(0.0);websiteall.setElseReal(0.0);
            }

            if(companyall == null){
                companyall = new CompanyInfo();
                companyall.setInDay(0.0);
                companyall.setOutDay(0.0);
                companyall.setSaveDay(0.0);
            }

            modelAndView.addObject("companyall", companyall);

            modelAndView.addObject("websiteall", websiteall);
            System.out.println(websiteall.getState());
            modelAndView.addObject("flag", true);//是否为单个企业
            System.out.println(3);
        }

        //System.out.println();

        modelAndView.addObject("promap", promap);

        return modelAndView;
    }

    @RequestMapping("/toDeliveryCount")
    public ModelAndView toDeliveryCount(HttpServletRequest request){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("delivery-count");

        /*计时*/
        Date date1 = new Date();
        Long time1 = date1.getTime();
        long total = 0;

        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");

//        StringBuffer promap = new StringBuffer();
//        promap.append("[");
//        int type = user.getType();
//        if(type == 0){
//
//            List<Provinces> list = new ArrayList<Provinces>();
//            ProvincesExample provexample = new ProvincesExample();
//            list = provincesDao.selectByExample(provexample);
//            User myUser = new User();
//            myUser.setType(3);
//
//            for (int i = 0; i < list.size(); i++) {
//
//                promap.append("{'name':'"+list.get(i).getName()+"',"+ "'pId':0,'id':" + list.get(i).getCode() + ",type:'0'},");
//                List<Cities> list2 = new ArrayList<Cities>();
//                CitiesExample citiesExample = new CitiesExample();
//                citiesExample.createCriteria().andProvincecodeEqualTo(list.get(i).getCode());
//                list2 = citiesDao.selectByExample(citiesExample);
//
//
//                for (int j = 0; j < list2.size(); j++) {
//
//                    promap.append("{'name':'"+list2.get(j).getName()+"',"+ "'pId':"+list2.get(j).getProvincecode()+",'id':" + list2.get(j).getCode() + ",type:'1'},");
//                    List<Areas> list3 = new ArrayList<Areas>();
//                    AreasExample areasExample = new AreasExample();
//                    areasExample.createCriteria().andCitycodeEqualTo(list2.get(j).getCode());
//                    list3 = areasDao.selectByExample(areasExample);
//
//                    for (int k = 0; k < list3.size(); k++) {
//
//
//                        myUser.setProvince(list.get(i).getName());
//                        myUser.setCity(list2.get(j).getName());
//                        myUser.setCounty(list3.get(k).getName());
//                        List<Delivery> list4 = deliveryService.selectDeliveryByCounty(myUser);
//                        if(list4.size() > 0){
//
//                            promap.append("{'name':'"+list3.get(k).getName()+"',"+ "'pId':"+list3.get(k).getCitycode()+",'id':" + list3.get(k).getCode() + ",type:'2'},");
//                        }
//                        for(int l = 0; l < list4.size(); l++){
//                            CompanyInfo companyInfo = companyInfoDao.selectByPrimaryKey(list4.get(l).getCompanyId());
//                            promap.append("{'name':'"+companyInfo.getName()+"',"+ "'pId':"+list3.get(k).getCode()+",'id':" + list4.get(l).getCompanyId() + ",type:'3'},");
//                            System.out.println(companyInfo);
//                            total++;
//                        }
//
//                    }
//                }
//            }
//        }
//        if(type == 1){
//            User myUser = new User();
//            myUser.setType(3);
//            List<Provinces> list = new ArrayList<Provinces>();
//            ProvincesExample provexample = new ProvincesExample();
//            provexample.createCriteria().andNameEqualTo(user.getProvince());
//            list = provincesDao.selectByExample(provexample);
//            promap.append("{'name':'"+list.get(0).getName()+"',"+ "'pId':0,'id':" + list.get(0).getCode() + ",type:'0'},");
//            List<Cities> list2 = new ArrayList<Cities>();
//            CitiesExample citiesExample = new CitiesExample();
//            citiesExample.createCriteria().andProvincecodeEqualTo(list.get(0).getCode());
//            list2 = citiesDao.selectByExample(citiesExample);
//            for (int j = 0; j < list2.size(); j++) {
//                promap.append("{'name':'"+list2.get(j).getName()+"',"+ "'pId':"+list.get(0).getCode()+",'id':" + list2.get(j).getCode() + ",type:'1'},");
//                List<Areas> list3 = new ArrayList<Areas>();
//                AreasExample areasExample = new AreasExample();
//                areasExample.createCriteria().andCitycodeEqualTo(list2.get(j).getCode());
//                list3 = areasDao.selectByExample(areasExample);
//                for (int k = 0; k < list3.size(); k++) {
//                    promap.append("{'name':'"+list3.get(k).getName()+"',"+ "'pId':"+list2.get(j).getCode()+",'id':" + list3.get(k).getCode() + ",type:'2'},");
//                    myUser.setProvince(user.getProvince());
//                    myUser.setCity(list2.get(j).getName());
//                    myUser.setCounty(list3.get(k).getName());
//                    List<Delivery> list4 = deliveryService.selectDeliveryByCounty(myUser);
//                    for(int l = 0; l < list4.size(); l++){
//                        CompanyInfo companyInfo = companyInfoDao.selectByPrimaryKey(list4.get(l).getCompanyId());
//                        promap.append("{'name':'"+companyInfo.getName()+"',"+ "'pId':"+list3.get(k).getCode()+",'id':" + list4.get(l).getCompanyId() + ",type:'3'},");
//                        System.out.println(companyInfo);
//                        total++;
//                    }
//                }
//            }
//        }
//        if(type == 2){
//            User myUser = new User();
//            myUser.setType(3);
//            List<Cities> list2 = new ArrayList<Cities>();
//            CitiesExample citiesExample = new CitiesExample();
//            citiesExample.createCriteria().andNameEqualTo(user.getCity());
//            list2 = citiesDao.selectByExample(citiesExample);
//            promap.append("{'name':'"+list2.get(0).getName()+"',"+ "'pId':0,'id':" + list2.get(0).getCode() + ",type:'1'},");
//            List<Areas> list3 = new ArrayList<Areas>();
//            AreasExample areasExample = new AreasExample();
//            areasExample.createCriteria().andCitycodeEqualTo(list2.get(0).getCode());
//            list3 = areasDao.selectByExample(areasExample);
//            for (int k = 0; k < list3.size(); k++) {
//                promap.append("{'name':'"+list3.get(k).getName()+"',"+ "'pId':"+list3.get(k).getCitycode()+",'id':" + list3.get(k).getCode() + ",type:'2'},");
//                myUser.setProvince(user.getProvince());
//                myUser.setCity(user.getCity());
//                myUser.setCounty(list3.get(k).getName());
//                List<Delivery> list4 = deliveryService.selectDeliveryByCounty(myUser);
//                for(int l = 0; l < list4.size(); l++){
//                    CompanyInfo companyInfo = companyInfoDao.selectByPrimaryKey(list4.get(l).getCompanyId());
//                    promap.append("{'name':'"+companyInfo.getName()+"',"+ "'pId':"+list3.get(k).getCode()+",'id':" + list4.get(l).getCompanyId() + ",type:'3'},");
//                    System.out.println(companyInfo);
//                    total++;
//                }
//            }
//        }
//        if(type == 3){
//            User myUser = new User();
//            myUser.setType(3);
//            List<Areas> list3 = new ArrayList<Areas>();
//            AreasExample areasExample = new AreasExample();
//            areasExample.createCriteria().andNameEqualTo(user.getCounty());
//            list3 = areasDao.selectByExample(areasExample);
//            promap.append("{'name':'"+list3.get(0).getName()+"',"+ "'pId':0,'id':" + list3.get(0).getCode() + ",type:'2'},");
//            myUser.setProvince(user.getProvince());
//            myUser.setCity(user.getCity());
//            myUser.setCounty(user.getCounty());
//            List<Delivery> list4 = deliveryService.selectDeliveryByCounty(myUser);
//            for(int l = 0; l < list4.size(); l++){
//                CompanyInfo companyInfo = companyInfoDao.selectByPrimaryKey(list4.get(l).getCompanyId());
//                promap.append("{'name':'"+companyInfo.getName()+"',"+ "'pId':" + list3.get(0).getCode() + ",'id':" + list4.get(l).getCompanyId() + ",type:'3'},");
//                System.out.println(companyInfo);
//                total++;
//            }
//        }
//
//        promap.append("]");
//        System.out.println(promap);
        String promap = "";
        PropertiesUtil p = new PropertiesUtil("DeliveryTree.properties");
        int type = user.getType();
        if(type == 0){
            promap = p.readProperty("all0");
        }
        if(type == 1){
            promap = p.readProperty(user.getProvince()+1);
        }
        if(type == 2){
            promap = p.readProperty(user.getCity()+2);
        }
        if(type == 3){
            promap = p.readProperty(user.getCounty()+3);
        }
        modelAndView.addObject("promap", promap.toString());
        List<CompanyInfo> companys = companyInfoDao.selectCompanyInfoByLevel(user);
        modelAndView.addObject("companys", companys);

        CompanyInfo companyall = companyInfoDao.sumByUser(user);
        if(companyall == null){
            companyall = new CompanyInfo();
            companyall.setInDay(0.0);
            companyall.setOutDay(0.0);
            companyall.setSaveDay(0.0);
            companyall.setSocialId("无");
            companyall.setLocation("无");
            companyall.setLatitude(new BigDecimal(0));
            companyall.setLongitude(new BigDecimal(0));
            companyall.setCompanyType(-1);
            companyall.setProvince("无");
            companyall.setCity("无");
            companyall.setCounty("无");
            companyall.setPrincipal("无");
            companyall.setPhone("无");
            companyall.setLevel(-1);
            companyall.setActivationStatus("无");
        }
        modelAndView.addObject("companyall", companyall);

        System.out.println(user);
        System.out.println("companyall:" + companyall);

        Delivery deliveryall = deliveryDao.sumByUser(user);
        if(deliveryall == null){
            deliveryall = new Delivery();
            deliveryall.setRange("0.0");
            deliveryall.setWareAbility(0.0);
            deliveryall.setRadius(0.0);
            deliveryall.setDeliveryNum(0);
            deliveryall.setDeliveryDayReal(0.0);
            deliveryall.setCarNum(0);
            deliveryall.setState(0);
        }
        modelAndView.addObject("deliveryall", deliveryall);
        modelAndView.addObject("flag", false);//是否为单个企业

        /*计时结束*/
        Date date2 = new Date();
        Long time2 = date2.getTime();

        Long totalTime = time2 - time1;


        System.out.println("总用时:" + totalTime);
        System.out.println("查询企业记录数:" + total);

        return modelAndView;
    }

    @RequestMapping("/toDeliveryTreeSaerch")
    public ModelAndView toDeliveryTreeSaerch( HttpServletRequest request,String level,String txt, String promap) {
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("delivery-count");

        System.out.println("level:" + level);
        System.out.println("txt:" + txt);
        System.out.println("promap:" + promap);

        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        if(level.equals("0")){

            List<CompanyInfo> companys = companyInfoDao.selectByLevelAndProvince(user,txt);
            modelAndView.addObject("companys", companys);

            CompanyInfo companyall = companyInfoDao.sumByUserAndProvince(user,txt);


            Delivery deliveryall = deliveryDao.sumByUserAndProvince(user,txt);
            //Website websiteall = websiteDao.sumByUserAndProvince(user,txt);
            if(deliveryall == null){
                deliveryall = new Delivery();
                deliveryall.setRange("0.0");
                deliveryall.setWareAbility(0.0);
                deliveryall.setRadius(0.0);
                deliveryall.setDeliveryNum(0);
                deliveryall.setDeliveryDayReal(0.0);
                deliveryall.setCarNum(0);
                deliveryall.setState(0);
            }

            if(companyall == null){
                companyall = new CompanyInfo();
                companyall.setInDay(0.0);
                companyall.setOutDay(0.0);
                companyall.setSaveDay(0.0);
            }

            modelAndView.addObject("companyall", companyall);
            modelAndView.addObject("deliveryall", deliveryall);
            modelAndView.addObject("flag", false);//是否为单个企业
            System.out.println(0);
            /*ModelAndView mv = new ModelAndView("redirect:/toSupplyCount");
            return mv;*/
        }
        if(level.equals("1")){

            List<CompanyInfo> companys = companyInfoDao.selectByLevelAndCity(user,txt);
            modelAndView.addObject("companys", companys);


            CompanyInfo companyall = companyInfoDao.sumByUserAndCity(user,txt);


            Delivery deliveryall = deliveryDao.sumByUserAndCity(user,txt);
            if(deliveryall == null){
                deliveryall = new Delivery();
                deliveryall.setRange("0.0");
                deliveryall.setWareAbility(0.0);
                deliveryall.setRadius(0.0);
                deliveryall.setDeliveryNum(0);
                deliveryall.setDeliveryDayReal(0.0);
                deliveryall.setCarNum(0);
                deliveryall.setState(0);
            }

            if(companyall == null){
                companyall = new CompanyInfo();
                companyall.setInDay(0.0);
                companyall.setOutDay(0.0);
                companyall.setSaveDay(0.0);
            }

            modelAndView.addObject("companyall", companyall);
            modelAndView.addObject("deliveryall", deliveryall);
            modelAndView.addObject("flag", false);//是否为单个企业
            System.out.println(1);

            /*ModelAndView mv = new ModelAndView("redirect:/toSupplyCount");
            return mv;*/
        }
        if(level.equals("2")){

            List<CompanyInfo> companys = companyInfoDao.selectByLevelAndCounty(user,txt);
            modelAndView.addObject("companys", companys);

            CompanyInfo companyall = companyInfoDao.sumByUserAndCountry(user,txt);

            Delivery deliveryall = deliveryDao.sumByUserAndCountry(user,txt);
            if(deliveryall == null){
                deliveryall = new Delivery();
                deliveryall.setRange("0.0");
                deliveryall.setWareAbility(0.0);
                deliveryall.setRadius(0.0);
                deliveryall.setDeliveryNum(0);
                deliveryall.setDeliveryDayReal(0.0);
                deliveryall.setCarNum(0);
                deliveryall.setState(0);
            }

            if(companyall == null){
                companyall = new CompanyInfo();
                companyall.setInDay(0.0);
                companyall.setOutDay(0.0);
                companyall.setSaveDay(0.0);
            }

            modelAndView.addObject("companyall", companyall);

            modelAndView.addObject("deliveryall", deliveryall);
            modelAndView.addObject("flag", false);//是否为单个企业
            System.out.println(2);

            /*ModelAndView mv = new ModelAndView("redirect:/toSupplyCount");
            return mv;*/
        }
        if(level.equals("3")){

            List<CompanyInfo> companys = companyInfoDao.selectByLevelAndCounty(user,txt);
            modelAndView.addObject("companys", companys);

            CompanyInfoExample example = new CompanyInfoExample();
            CompanyInfoExample.Criteria criteria = example.createCriteria();
            criteria.andNameEqualTo(txt);
            System.out.println("txt:" + txt);

            List<CompanyInfo> companyInfoList = companyInfoDao.selectByExample(example);
            CompanyInfo companyall = companyInfoList.get(0);

            System.out.println(companyall);

            DeliveryExample deliveryExample = new DeliveryExample();
            DeliveryExample.Criteria criteria1 = deliveryExample.createCriteria();
            criteria1.andCompanyIdEqualTo(companyall.getCompanyId());


            Delivery deliveryall = deliveryDao.selectByExample(deliveryExample).get(0);
            System.out.println("delivery:" + deliveryall);
            //Website websiteall = websiteDao.sumByExample(websiteExample);
            if(deliveryall == null){
                deliveryall = new Delivery();
                deliveryall.setRange("0.0");
                deliveryall.setWareAbility(0.0);
                deliveryall.setRadius(0.0);
                deliveryall.setDeliveryNum(0);
                deliveryall.setDeliveryDayReal(0.0);
                deliveryall.setCarNum(0);
                deliveryall.setState(0);
            }


            if(companyall == null){
                companyall = new CompanyInfo();
                companyall.setInDay(0.0);
                companyall.setOutDay(0.0);
                companyall.setSaveDay(0.0);
            }

            modelAndView.addObject("companyall", companyall);

            modelAndView.addObject("deliveryall", deliveryall);
            System.out.println(deliveryall.getState());
            modelAndView.addObject("flag", true);//是否为单个企业
            System.out.println(3);
        }

        //System.out.println();

        modelAndView.addObject("promap", promap);

        return modelAndView;
    }

}
