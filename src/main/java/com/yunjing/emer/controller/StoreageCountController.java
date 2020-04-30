package com.yunjing.emer.controller;

import com.yunjing.emer.dao.*;
import com.yunjing.emer.entity.*;
import com.yunjing.emer.service.MachineService;
import com.yunjing.emer.service.StoreageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class StoreageCountController {

    @Autowired
    private CompanyInfoDao companyInfoDao;

    @Autowired
    private StoreageDao storeageDao;

    @Autowired
    private StoreageService storeageService;

    @Autowired
    private ProvincesDao provincesDao;

    @Autowired
    private CitiesDao citiesDao;

    @Autowired
    private AreasDao areasDao;


    @RequestMapping("/toStoreageCount")
    public ModelAndView toStoreageCount(HttpServletRequest request){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("storeage-count");

        /*计时*/
        Date date1 = new Date();
        Long time1 = date1.getTime();
        long total = 0;

        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");

        StringBuffer promap = new StringBuffer();
        promap.append("[");
        int type = user.getType();
        if(type == 0){
            List<Provinces> list = new ArrayList<Provinces>();
            ProvincesExample provexample = new ProvincesExample();
            list = provincesDao.selectByExample(provexample);
            User myUser = new User();
            myUser.setType(3);
            for (int i = 0; i < list.size(); i++) {

                promap.append("{'name':'"+list.get(i).getName()+"',"+ "'pId':0,'id':" + list.get(i).getCode() + ",type:'0'},");
                List<Cities> list2 = new ArrayList<Cities>();
                CitiesExample citiesExample = new CitiesExample();
                citiesExample.createCriteria().andProvincecodeEqualTo(list.get(i).getCode());
                list2 = citiesDao.selectByExample(citiesExample);

                for (int j = 0; j < list2.size(); j++) {
                    promap.append("{'name':'"+list2.get(j).getName()+"',"+ "'pId':"+list2.get(j).getProvincecode()+",'id':" + list2.get(j).getCode() + ",type:'1'},");
                    List<Areas> list3 = new ArrayList<Areas>();
                    AreasExample areasExample = new AreasExample();
                    areasExample.createCriteria().andCitycodeEqualTo(list2.get(j).getCode());
                    list3 = areasDao.selectByExample(areasExample);
                    for (int k = 0; k < list3.size(); k++) {
                        promap.append("{'name':'"+list3.get(k).getName()+"',"+ "'pId':"+list3.get(k).getCitycode()+",'id':" + list3.get(k).getCode() + ",type:'2'},");

                        myUser.setProvince(list.get(i).getName());
                        myUser.setCity(list2.get(j).getName());
                        myUser.setCounty(list3.get(k).getName());
                        List<Storeage> list4 = storeageDao.selectStoreageByCounty(myUser);
                        for(int l = 0; l < list4.size(); l++){
                            CompanyInfo companyInfo = companyInfoDao.selectByPrimaryKey(list4.get(l).getCompanyId());
                            promap.append("{'name':'"+companyInfo.getName()+"',"+ "'pId':"+list3.get(k).getCode()+",'id':" + list4.get(l).getCompanyId() + ",type:'3'},");
                            System.out.println(companyInfo);
                            total++;
                        }

                    }
                }
            }
        }
        if(type == 1){
            List<Provinces> list = new ArrayList<Provinces>();
            ProvincesExample provexample = new ProvincesExample();
            provexample.createCriteria().andNameEqualTo(user.getProvince());
            list = provincesDao.selectByExample(provexample);
            promap.append("{'name':'"+list.get(0).getName()+"',"+ "'pId':0,'id':" + list.get(0).getCode() + ",type:'0'},");
            List<Cities> list2 = new ArrayList<Cities>();
            CitiesExample citiesExample = new CitiesExample();
            citiesExample.createCriteria().andProvincecodeEqualTo(list.get(0).getCode());
            list2 = citiesDao.selectByExample(citiesExample);
            for (int j = 0; j < list2.size(); j++) {
                promap.append("{'name':'"+list2.get(j).getName()+"',"+ "'pId':"+list2.get(j).getProvincecode()+",'id':" + list2.get(j).getCode() + ",type:'1'},");
                List<Areas> list3 = new ArrayList<Areas>();
                AreasExample areasExample = new AreasExample();
                areasExample.createCriteria().andCitycodeEqualTo(list2.get(j).getCode());
                list3 = areasDao.selectByExample(areasExample);
                for (int k = 0; k < list3.size(); k++) {
                    promap.append("{'name':'"+list3.get(k).getName()+"',"+ "'pId':"+list3.get(k).getCitycode()+",'id':" + list3.get(k).getCode() + ",type:'2'},");
                }
            }
        }
        if(type == 2){
            List<Cities> list2 = new ArrayList<Cities>();
            CitiesExample citiesExample = new CitiesExample();
            citiesExample.createCriteria().andNameEqualTo(user.getCity());
            list2 = citiesDao.selectByExample(citiesExample);
            promap.append("{'name':'"+list2.get(0).getName()+"',"+ "'pId':0,'id':" + list2.get(0).getCode() + ",type:'1'},");
            List<Areas> list3 = new ArrayList<Areas>();
            AreasExample areasExample = new AreasExample();
            areasExample.createCriteria().andCitycodeEqualTo(list2.get(0).getCode());
            list3 = areasDao.selectByExample(areasExample);
            for (int k = 0; k < list3.size(); k++) {
                promap.append("{'name':'"+list3.get(k).getName()+"',"+ "'pId':"+list3.get(k).getCitycode()+",'id':" + list3.get(k).getCode() + ",type:'2'},");
            }
        }
        if(type == 3){
            List<Areas> list3 = new ArrayList<Areas>();
            AreasExample areasExample = new AreasExample();
            areasExample.createCriteria().andNameEqualTo(user.getCounty());
            list3 = areasDao.selectByExample(areasExample);
            promap.append("{'name':'"+list3.get(0).getName()+"',"+ "'pId':0,'id':" + list3.get(0).getCode() + ",type:'2'},");
        }

        promap.append("]");
        modelAndView.addObject("promap", promap.toString());
        List<CompanyInfo> companys = companyInfoDao.selectCompanyInfoByLevel(user);
        modelAndView.addObject("companys", companys);

        CompanyInfo companyall = companyInfoDao.sumByUser(user);
        modelAndView.addObject("companyall", companyall);

        Storeage storeageall = storeageDao.sumByUser(user);
        if(storeageall == null){
            storeageall = new Storeage();
            storeageall.setCarNum(0);storeageall.setTransportDay(0.0);storeageall.setTransportDayReal(0.0);
        }
        modelAndView.addObject("storeageall", storeageall);

        /*计时结束*/
        Date date2 = new Date();
        Long time2 = date2.getTime();

        Long totalTime = time2 - time1;


        System.out.println("总用时:" + totalTime);
        System.out.println("查询企业记录数:" + total);

        return modelAndView;
    }

    @RequestMapping("/toStoreageTreeSaerch")
    public ModelAndView toStoreageTreeSaerch( HttpServletRequest request,String level,String txt, String promap) {
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("storeage-count");

        System.out.println("level:" + level);
        System.out.println("txt:" + txt);
        System.out.println("promap:" + promap);

        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        if(level.equals("0")){

            ModelAndView mv = new ModelAndView("redirect:/toStoreageCount");
            return mv;
        }
        if(level.equals("1")){


            ModelAndView mv = new ModelAndView("redirect:/toStoreageCount");
            return mv;
        }
        if(level.equals("2")){

            ModelAndView mv = new ModelAndView("redirect:/toStoreageCount");
            return mv;
        }
        if(level.equals("3")){

            List<CompanyInfo> companys = companyInfoDao.selectByLevelAndCounty(user,txt);
            modelAndView.addObject("companys", companys);

            CompanyInfoExample example = new CompanyInfoExample();
            CompanyInfoExample.Criteria criteria = example.createCriteria();
            criteria.andNameEqualTo(txt);

            List<CompanyInfo> companyInfoList = companyInfoDao.selectByExample(example);
            CompanyInfo companyall = companyInfoList.get(0);

            StoreageExample storeageExample = new StoreageExample();
            StoreageExample.Criteria storeageCriteria = storeageExample.createCriteria();
            storeageCriteria.andCompanyIdEqualTo(companyall.getCompanyId());

            Storeage storeageall = storeageDao.sumByExample(storeageExample);
            if(storeageall == null){
                storeageall = new Storeage();
                storeageall.setCarNum(0);storeageall.setTransportDay(0.0);storeageall.setTransportDayReal(0.0);
            }

            if(companyall == null){
                companyall = new CompanyInfo();
                companyall.setInDay(0.0);
                companyall.setOutDay(0.0);
                companyall.setSaveDay(0.0);
            }

            modelAndView.addObject("companyall", companyall);

            modelAndView.addObject("storeageall", storeageall);
            System.out.println(3);
        }

        modelAndView.addObject("promap", promap);

        return modelAndView;
    }

}
