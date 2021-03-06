package com.yunjing.emer.controller;

import com.yunjing.emer.dao.*;
import com.yunjing.emer.entity.*;
import com.yunjing.emer.service.*;
import com.yunjing.emer.util.PropertiesUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 周迅磊 on 2020/4/19.
 */
@Controller
public class StatisticsController {
    @Autowired
    WebsiteDao websiteDao;

    @Autowired
    CompanyInfoDao companyInfoDao;

    @Autowired
    DeliveryDao deliveryDao;

    @Autowired
    MachineDao machineDao;

    @Autowired
    StoreageDao storeageDao;

    @Autowired
    ProvincesDao provincesDao;

    @Autowired
    CitiesDao citiesDao;

    @Autowired
    AreasDao areasDao;

    @RequestMapping("/toSupplyStatistics")
    @ResponseBody
    public ModelAndView toSupplyStatistics(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("supply-statistics");
//        WebsiteExample websiteExample = new WebsiteExample();
//        websiteExample.createCriteria().andStateEqualTo(1);
//        Website Webstatic = websiteDao.sumByExample(websiteExample);
//        modelAndView.addObject("Webstatic", Webstatic);
//        websiteExample = new WebsiteExample();
//        websiteExample.createCriteria().andStateEqualTo(1);
//        long usenum = websiteDao.countByExample(websiteExample);
//        modelAndView.addObject("usenum", usenum);
//        websiteExample = new WebsiteExample();
//        websiteExample.createCriteria().andStateEqualTo(0);
//        long stopnum = websiteDao.countByExample(websiteExample);
//        modelAndView.addObject("stopnum", stopnum);
//        CompanyInfoExample companyExample = new CompanyInfoExample();
//        companyExample.createCriteria().andCompanyTypeEqualTo(1);
//        long newnum = companyInfoDao.countByWebsite(companyExample);
//        modelAndView.addObject("newnum", newnum);
//        companyExample = new CompanyInfoExample();
//        companyExample.createCriteria().andCompanyTypeEqualTo(0);
//        long disablenum = companyInfoDao.countByWebsite(companyExample);
//        modelAndView.addObject("disablenum", disablenum);
//        companyExample = new CompanyInfoExample();
//        CompanyInfo companystatic = companyInfoDao.sumByWebsite(companyExample);
//        modelAndView.addObject("in_day",companystatic.getInDay());
//        modelAndView.addObject("out_day",companystatic.getOutDay());
//        modelAndView.addObject("save_day",companystatic.getSaveDay());
        return modelAndView;
    }

    @RequestMapping("/toMachiningStatistics")
    @ResponseBody
    public ModelAndView toMachiningStatistics(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("machining-statistics");
        return modelAndView;
    }

    @RequestMapping("/toDeliverStatistics")
    @ResponseBody
    public ModelAndView toDeliverStatistics(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("deliver-statistics");
        /*List<String> hb=new ArrayList<String>();
        hb.add("北京市");
        hb.add("天津市");
        hb.add("河北省");
        hb.add("山西省");
        hb.add("内蒙古自治区");
        List<String> db=new ArrayList<String>();
        db.add("辽宁省");
        db.add("吉林省");
        db.add("黑龙江省");
        List<String> hd=new ArrayList<String>();
        hd.add("上海市");
        hd.add("江苏省");
        hd.add("浙江省");
        hd.add("安徽省");
        hd.add("福建省");
        hd.add("江西省");
        hd.add("山东省");
        List<String> zn=new ArrayList<String>();
        zn.add("河南省");
        zn.add("湖北省");
        zn.add("湖南省");
        zn.add("广东省");
        zn.add("广西壮族自治区");
        zn.add("海南省");
        List<String> xn=new ArrayList<String>();
        xn.add("重庆市");
        xn.add("四川省");
        xn.add("贵州省");
        xn.add("云南省");
        xn.add("西藏自治区");
        List<String> xb=new ArrayList<String>();
        xb.add("陕西省");
        xb.add("甘肃省");
        xb.add("青海省");
        xb.add("宁夏回族自治区");
        xb.add("新疆维吾尔自治区");
        Delivery hbstatic = deliveryDao.sumByProvinceList(hb);
        modelAndView.addObject("hbstatic", hbstatic);
        Delivery dbstatic = deliveryDao.sumByProvinceList(db);
        modelAndView.addObject("dbstatic", dbstatic);
        Delivery hdstatic = deliveryDao.sumByProvinceList(hd);
        modelAndView.addObject("hdstatic", hdstatic);
        Delivery znstatic = deliveryDao.sumByProvinceList(zn);
        modelAndView.addObject("znstatic", znstatic);
        Delivery xnstatic = deliveryDao.sumByProvinceList(xn);
        modelAndView.addObject("xnstatic", xnstatic);
        Delivery xbstatic = deliveryDao.sumByProvinceList(xb);
        modelAndView.addObject("xbstatic", xbstatic);
        DeliveryExample deliveryExample = new DeliveryExample();
        deliveryExample.createCriteria().andStateEqualTo(1);
        long usenum = deliveryDao.countByExample(deliveryExample);
        modelAndView.addObject("usenum", usenum);
        deliveryExample = new DeliveryExample();
        deliveryExample.createCriteria().andStateEqualTo(0);
        long stopnum = deliveryDao.countByExample(deliveryExample);
        modelAndView.addObject("stopnum", stopnum);
        CompanyInfoExample companyExample = new CompanyInfoExample();
        companyExample.createCriteria().andCompanyTypeEqualTo(1);
        long newnum = companyInfoDao.countByDelivery(companyExample);
        modelAndView.addObject("newnum", newnum);
        companyExample = new CompanyInfoExample();
        companyExample.createCriteria().andCompanyTypeEqualTo(0);
        long disablenum = companyInfoDao.countByDelivery(companyExample);
        modelAndView.addObject("disablenum", disablenum);
        companyExample = new CompanyInfoExample();
        CompanyInfo companystatic = companyInfoDao.sumByDelivery(companyExample);
        modelAndView.addObject("in_day",companystatic.getInDay());
        modelAndView.addObject("out_day",companystatic.getOutDay());
        modelAndView.addObject("save_day",companystatic.getSaveDay());*/
        return modelAndView;
    }

    @RequestMapping("/toStoreageStatistics")
    @ResponseBody
    public ModelAndView toStoreageStatistics(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("storeage-statistics");
        return modelAndView;
    }

    @RequestMapping("/supplyBar1")
    @ResponseBody
    public String supplyBar1() {
        List<Provinces> list = new ArrayList<Provinces>();
        ProvincesExample provexample = new ProvincesExample();
        StringBuffer promap1 = new StringBuffer();
        StringBuffer promap2 = new StringBuffer();
        StringBuffer promap3 = new StringBuffer();
        promap1.append("[");
        promap2.append("[");
        promap3.append("[");
        list = provincesDao.selectByExample(provexample);
        for (int i = 0; i < list.size(); i++) {
            CompanyInfoExample companyInfoExample = new CompanyInfoExample();
            companyInfoExample.createCriteria().andProvinceEqualTo(list.get(i).getName().toString());
            CompanyInfo temp = companyInfoDao.sumByWebsite(companyInfoExample);
            if(temp == null){
                promap1.append(0.0+",");
                promap2.append(0.0+",");
                promap3.append(0.0+",");
            }else{
                if(temp.getInDay()==null){
                    promap1.append(0.0+",");
                }else{
                    promap1.append(temp.getInDay()+",");
                }
                if(temp.getOutDay()==null){
                    promap2.append(0.0+",");
                }else{
                    promap2.append(temp.getSaveDay()+",");
                }if(temp.getSaveDay()==null){
                    promap3.append(0.0+",");
                }else{
                    promap3.append(temp.getSaveDay()+",");
                }
            }

        }
        promap1.append("]");
        promap2.append("]");
        promap3.append("]");
        return promap1.toString()+"~"+promap2.toString()+"~"+promap3.toString();
    }

    @RequestMapping("/supplyBar2")
    @ResponseBody
    public String supplyBar2() {
        List<Provinces> list = new ArrayList<Provinces>();
        ProvincesExample provexample = new ProvincesExample();
        StringBuffer promap1 = new StringBuffer();
        StringBuffer promap2 = new StringBuffer();
        StringBuffer promap3 = new StringBuffer();
        StringBuffer promap4 = new StringBuffer();
        StringBuffer promap5 = new StringBuffer();
        StringBuffer promap6 = new StringBuffer();
        StringBuffer promap7 = new StringBuffer();
        StringBuffer promap8 = new StringBuffer();
        promap1.append("[");
        promap2.append("[");
        promap3.append("[");
        promap4.append("[");
        promap5.append("[");
        promap6.append("[");
        promap7.append("[");
        promap8.append("[");
        list = provincesDao.selectByExample(provexample);
        for (int i = 0; i < list.size(); i++) {
            Website temp = websiteDao.sumByProvince(list.get(i).getName().toString());
            if(temp == null){
                promap1.append(0.0+",");
                promap2.append(0.0+",");
                promap3.append(0.0+",");
                promap4.append(0.0+",");
                promap5.append(0.0+",");
                promap6.append(0.0+",");
                promap7.append(0.0+",");
                promap8.append(0.0+",");
            }else{
                if(temp.getFlourExp()==null){
                    promap1.append(0.0+",");
                }else{
                    promap1.append(temp.getFlourExp()+",");
                }
                if(temp.getRiceExp()==null){
                    promap2.append(0.0+",");
                }else{
                    promap2.append(temp.getRiceExp()+",");
                }if(temp.getOilExp()==null){
                    promap3.append(0.0+",");
                }else{
                    promap3.append(temp.getOilExp()+",");
                }
                if(temp.getElseExp()==null){
                    promap4.append(0.0+",");
                }else{
                    promap4.append(temp.getElseExp()+",");
                }
                if(temp.getFlourReal()==null){
                    promap5.append(0.0+",");
                }else{
                    promap5.append(temp.getFlourReal()+",");
                }if(temp.getRiceReal()==null){
                    promap6.append(0.0+",");
                }else{
                    promap6.append(temp.getRiceReal()+",");
                }
                if(temp.getOilReal()==null){
                    promap7.append(0.0+",");
                }else{
                    promap7.append(temp.getOilReal()+",");
                }if(temp.getElseReal()==null){
                    promap8.append(0.0+",");
                }else{
                    promap8.append(temp.getElseReal()+",");
                }
            }

        }
        promap1.append("]");
        promap2.append("]");
        promap3.append("]");
        promap4.append("]");
        promap5.append("]");
        promap6.append("]");
        promap7.append("]");
        promap8.append("]");
        return promap1.toString()+"~"+promap2.toString()+"~"+promap3.toString()+"~"+promap4.toString()+"~"+promap5.toString()+"~"+promap6.toString()+"~"+promap7.toString()+"~"+promap8.toString();
    }

    @RequestMapping("/supplyBar3")
    @ResponseBody
    public String supplyBar3() {
        List<Provinces> list = new ArrayList<Provinces>();
        ProvincesExample provexample = new ProvincesExample();
        StringBuffer promap1 = new StringBuffer();
        StringBuffer promap2 = new StringBuffer();
        promap1.append("[");
        promap2.append("[");
        list = provincesDao.selectByExample(provexample);
        for (int i = 0; i < list.size(); i++) {
            long state1 = websiteDao.countByProvinceState(list.get(i).getName().toString(),1);
            long state0 = websiteDao.countByProvinceState(list.get(i).getName().toString(),0);
            promap1.append(state1+",");
            promap2.append(state0+",");
        }
        promap1.append("]");
        promap2.append("]");
        return promap1.toString()+"~"+promap2.toString();
    }

    @RequestMapping("/deliverCompanyBar")
    @ResponseBody
    public String deliverCompanyBar() {
        List<Provinces> list = new ArrayList<Provinces>();
        ProvincesExample provexample = new ProvincesExample();
        StringBuffer promap1 = new StringBuffer();
        StringBuffer promap2 = new StringBuffer();
        StringBuffer promap3 = new StringBuffer();
        promap1.append("[");
        promap2.append("[");
        promap3.append("[");
        list = provincesDao.selectByExample(provexample);
        for (int i = 0; i < list.size(); i++) {
            CompanyInfoExample companyInfoExample = new CompanyInfoExample();
            companyInfoExample.createCriteria().andProvinceEqualTo(list.get(i).getName().toString());
            CompanyInfo temp = companyInfoDao.sumByDelivery(companyInfoExample);
            if(temp == null){
                promap1.append(0.0+",");
                promap2.append(0.0+",");
                promap3.append(0.0+",");
            }else{
                if(temp.getInDay()==null){
                    promap1.append(0.0+",");
                }else{
                    promap1.append(temp.getInDay()+",");
                }
                if(temp.getOutDay()==null){
                    promap2.append(0.0+",");
                }else{
                    promap2.append(temp.getSaveDay()+",");
                }if(temp.getSaveDay()==null){
                    promap3.append(0.0+",");
                }else{
                    promap3.append(temp.getSaveDay()+",");
                }
            }

        }
        promap1.append("]");
        promap2.append("]");
        promap3.append("]");
        return promap1.toString()+"~"+promap2.toString()+"~"+promap3.toString();
    }

    @RequestMapping("/deliverBar")
    @ResponseBody
    public String deliverBar() {
        List<Provinces> list = new ArrayList<Provinces>();
        ProvincesExample provexample = new ProvincesExample();
        StringBuffer promap1 = new StringBuffer();
        StringBuffer promap2 = new StringBuffer();
        StringBuffer promap3 = new StringBuffer();
        promap1.append("[");
        promap2.append("[");
        promap3.append("[");
        list = provincesDao.selectByExample(provexample);
        for (int i = 0; i < list.size(); i++) {
            Delivery temp = deliveryDao.sumByProvince(list.get(i).getName().toString());
            if(temp == null){
                promap1.append(0.0+",");
                promap2.append(0.0+",");
                promap3.append(0.0+",");
            }else{
                if(temp.getWareAbility()==null){
                    promap1.append(0.0+",");
                }else{
                    promap1.append(temp.getWareAbility()+",");
                }
                if(temp.getDeliveryDay()==null){
                    promap2.append(0.0+",");
                }else{
                    promap2.append(temp.getDeliveryDay()+",");
                }if(temp.getDeliveryDayReal()==null){
                    promap3.append(0.0+",");
                }else{
                    promap3.append(temp.getDeliveryDayReal()+",");
                }
            }

        }
        promap1.append("]");
        promap2.append("]");
        promap3.append("]");
        return promap1.toString()+"~"+promap2.toString()+"~"+promap3.toString();
    }

    @RequestMapping("/deliverStatusBar")
    @ResponseBody
    public String deliverStatusBar() {
        List<Provinces> list = new ArrayList<Provinces>();
        ProvincesExample provexample = new ProvincesExample();
        StringBuffer promap1 = new StringBuffer();
        StringBuffer promap2 = new StringBuffer();
        promap1.append("[");
        promap2.append("[");
        list = provincesDao.selectByExample(provexample);
        for (int i = 0; i < list.size(); i++) {
            long state1 = deliveryDao.countByProvinceState(list.get(i).getName().toString(),1);
            long state0 = deliveryDao.countByProvinceState(list.get(i).getName().toString(),0);
            promap1.append(state1+",");
            promap2.append(state0+",");
        }
        promap1.append("]");
        promap2.append("]");
        return promap1.toString()+"~"+promap2.toString();
    }

    @RequestMapping("/storeageCompanyBar")
    @ResponseBody
    public String storeageCompanyBar() {
        List<Provinces> list = new ArrayList<Provinces>();
        ProvincesExample provexample = new ProvincesExample();
        StringBuffer promap1 = new StringBuffer();
        StringBuffer promap2 = new StringBuffer();
        StringBuffer promap3 = new StringBuffer();
        promap1.append("[");
        promap2.append("[");
        promap3.append("[");
        list = provincesDao.selectByExample(provexample);
        for (int i = 0; i < list.size(); i++) {
            CompanyInfoExample companyInfoExample = new CompanyInfoExample();
            companyInfoExample.createCriteria().andProvinceEqualTo(list.get(i).getName().toString());
            CompanyInfo temp = companyInfoDao.sumByStoreage(companyInfoExample);
            if(temp == null){
                promap1.append(0.0+",");
                promap2.append(0.0+",");
                promap3.append(0.0+",");
            }else{
                if(temp.getInDay()==null){
                    promap1.append(0.0+",");
                }else{
                    promap1.append(temp.getInDay()+",");
                }
                if(temp.getOutDay()==null){
                    promap2.append(0.0+",");
                }else{
                    promap2.append(temp.getSaveDay()+",");
                }if(temp.getSaveDay()==null){
                    promap3.append(0.0+",");
                }else{
                    promap3.append(temp.getSaveDay()+",");
                }
            }

        }
        promap1.append("]");
        promap2.append("]");
        promap3.append("]");
        return promap1.toString()+"~"+promap2.toString()+"~"+promap3.toString();
    }

    @RequestMapping("/storeageBar")
    @ResponseBody
    public String storeageBar() {
        List<Provinces> list = new ArrayList<Provinces>();
        ProvincesExample provexample = new ProvincesExample();
        StringBuffer promap1 = new StringBuffer();
        StringBuffer promap2 = new StringBuffer();
        StringBuffer promap3 = new StringBuffer();
        promap1.append("[");
        promap2.append("[");
        promap3.append("[");
        list = provincesDao.selectByExample(provexample);
        for (int i = 0; i < list.size(); i++) {
            Storeage temp = storeageDao.sumByProvince(list.get(i).getName().toString());
            if(temp == null){
                promap1.append(0.0+",");
                promap2.append(0.0+",");
                promap3.append(0.0+",");
            }else{
                if(temp.getTransportDay()==null){
                    promap1.append(0.0+",");
                }else{
                    promap1.append(temp.getTransportDay()+",");
                }
                if(temp.getCarNum()==null){
                    promap2.append(0.0+",");
                }else{
                    promap2.append(temp.getCarNum()+",");
                }if(temp.getTransportDayReal()==null){
                    promap3.append(0.0+",");
                }else{
                    promap3.append(temp.getTransportDayReal()+",");
                }
            }

        }
        promap1.append("]");
        promap2.append("]");
        promap3.append("]");
        return promap1.toString()+"~"+promap2.toString()+"~"+promap3.toString();
    }

    @RequestMapping("/storeageStatusBar")
    @ResponseBody
    public String storeageStatusBar() {
        List<Provinces> list = new ArrayList<Provinces>();
        ProvincesExample provexample = new ProvincesExample();
        StringBuffer promap1 = new StringBuffer();
        StringBuffer promap2 = new StringBuffer();
        promap1.append("[");
        promap2.append("[");
        list = provincesDao.selectByExample(provexample);
        for (int i = 0; i < list.size(); i++) {
            long state1 = storeageDao.countByProvinceState(list.get(i).getName().toString(),1);
            long state0 = storeageDao.countByProvinceState(list.get(i).getName().toString(),0);
            promap1.append(state1+",");
            promap2.append(state0+",");
        }
        promap1.append("]");
        promap2.append("]");
        return promap1.toString()+"~"+promap2.toString();
    }

    @RequestMapping("/machineCompanyBar")
    @ResponseBody
    public String machineCompanyBar() {
        List<Provinces> list = new ArrayList<Provinces>();
        ProvincesExample provexample = new ProvincesExample();
        StringBuffer promap1 = new StringBuffer();
        StringBuffer promap2 = new StringBuffer();
        StringBuffer promap3 = new StringBuffer();
        promap1.append("[");
        promap2.append("[");
        promap3.append("[");
        list = provincesDao.selectByExample(provexample);
        for (int i = 0; i < list.size(); i++) {
            CompanyInfoExample companyInfoExample = new CompanyInfoExample();
            companyInfoExample.createCriteria().andProvinceEqualTo(list.get(i).getName().toString());
            CompanyInfo temp = companyInfoDao.sumByMachine(companyInfoExample);
            if(temp == null){
                promap1.append(0.0+",");
                promap2.append(0.0+",");
                promap3.append(0.0+",");
            }else{
                if(temp.getInDay()==null){
                    promap1.append(0.0+",");
                }else{
                    promap1.append(temp.getInDay()+",");
                }
                if(temp.getOutDay()==null){
                    promap2.append(0.0+",");
                }else{
                    promap2.append(temp.getSaveDay()+",");
                }if(temp.getSaveDay()==null){
                    promap3.append(0.0+",");
                }else{
                    promap3.append(temp.getSaveDay()+",");
                }
            }

        }
        promap1.append("]");
        promap2.append("]");
        promap3.append("]");
        return promap1.toString()+"~"+promap2.toString()+"~"+promap3.toString();
    }

    @RequestMapping("/machineBar")
    @ResponseBody
    public String machineBar() {
        List<Provinces> list = new ArrayList<Provinces>();
        ProvincesExample provexample = new ProvincesExample();
        StringBuffer promap1 = new StringBuffer();
        StringBuffer promap2 = new StringBuffer();
        StringBuffer promap3 = new StringBuffer();
        StringBuffer promap4 = new StringBuffer();
        StringBuffer promap5 = new StringBuffer();
        StringBuffer promap6 = new StringBuffer();
        StringBuffer promap7 = new StringBuffer();
        StringBuffer promap8 = new StringBuffer();
        StringBuffer promap9 = new StringBuffer();
        StringBuffer promap10 = new StringBuffer();
        StringBuffer promap11 = new StringBuffer();
        StringBuffer promap12 = new StringBuffer();
        promap1.append("[");
        promap2.append("[");
        promap3.append("[");
        promap4.append("[");
        promap5.append("[");
        promap6.append("[");
        promap7.append("[");
        promap8.append("[");
        promap9.append("[");
        promap10.append("[");
        promap11.append("[");
        promap12.append("[");
        list = provincesDao.selectByExample(provexample);
        for (int i = 0; i < list.size(); i++) {
            Machine temp = machineDao.sumByProvince(list.get(i).getName().toString());
            if(temp == null){
                promap1.append(0.0+",");
                promap2.append(0.0+",");
                promap3.append(0.0+",");
                promap4.append(0.0+",");
                promap5.append(0.0+",");
                promap6.append(0.0+",");
                promap7.append(0.0+",");
                promap8.append(0.0+",");
                promap9.append(0.0+",");
                promap10.append(0.0+",");
                promap11.append(0.0+",");
                promap12.append(0.0+",");
            }else{
                if(temp.getWheatDay()==null){
                    promap1.append(0.0+",");
                }else{
                    promap1.append(temp.getWheatDay()+",");
                }
                if(temp.getPaddyDay()==null){
                    promap2.append(0.0+",");
                }else{
                    promap2.append(temp.getPaddyDay()+",");
                }if(temp.getOilDay()==null){
                    promap3.append(0.0+",");
                }else{
                    promap3.append(temp.getOilDay()+",");
                }
                if(temp.getOilConciseDay()==null){
                    promap4.append(0.0+",");
                }else{
                    promap4.append(temp.getOilConciseDay()+",");
                }
                if(temp.getOilSubpDay()==null){
                    promap5.append(0.0+",");
                }else{
                    promap5.append(temp.getOilSubpDay()+",");
                }if(temp.getElseDay()==null){
                    promap6.append(0.0+",");
                }else{
                    promap6.append(temp.getElseDay()+",");
                }
                if(temp.getWheatDayReal()==null){
                    promap7.append(0.0+",");
                }else{
                    promap7.append(temp.getWheatDayReal()+",");
                }if(temp.getPaddyDayReal()==null){
                    promap8.append(0.0+",");
                }else{
                    promap8.append(temp.getPaddyDayReal()+",");
                }
                if(temp.getOilDayReal()==null){
                    promap9.append(0.0+",");
                }else{
                    promap9.append(temp.getOilDayReal()+",");
                }if(temp.getOilConciseDayReal()==null){
                    promap10.append(0.0+",");
                }else{
                    promap10.append(temp.getOilConciseDayReal()+",");
                }
                if(temp.getOilSubpDayReal()==null){
                    promap11.append(0.0+",");
                }else{
                    promap11.append(temp.getOilSubpDayReal()+",");
                }if(temp.getElseDayReal()==null){
                    promap12.append(0.0+",");
                }else{
                    promap12.append(temp.getElseDayReal()+",");
                }
            }

        }
        promap1.append("]");
        promap2.append("]");
        promap3.append("]");
        promap4.append("]");
        promap5.append("]");
        promap6.append("]");
        promap7.append("]");
        promap8.append("]");
        promap9.append("]");
        promap10.append("]");
        promap11.append("]");
        promap12.append("]");
        return promap1.toString()+"~"+promap2.toString()+"~"+promap3.toString()+"~"+promap4.toString()+"~"+promap5.toString()+"~"+promap6.toString()+"~"+promap7.toString()+"~"+promap8.toString()+"~"+promap9.toString()+"~"+promap10.toString()+"~"+promap11.toString()+"~"+promap12.toString();
    }

    @RequestMapping("/machineStatusBar")
    @ResponseBody
    public String machineStatusBar() {
        List<Provinces> list = new ArrayList<Provinces>();
        ProvincesExample provexample = new ProvincesExample();
        StringBuffer promap1 = new StringBuffer();
        StringBuffer promap2 = new StringBuffer();
        promap1.append("[");
        promap2.append("[");
        list = provincesDao.selectByExample(provexample);
        for (int i = 0; i < list.size(); i++) {
            long state1 = machineDao.countByProvinceState(list.get(i).getName().toString(),1);
            long state0 = machineDao.countByProvinceState(list.get(i).getName().toString(),0);
            promap1.append(state1+",");
            promap2.append(state0+",");
        }
        promap1.append("]");
        promap2.append("]");
        return promap1.toString()+"~"+promap2.toString();
    }

    @RequestMapping("/toCountStaticBack")
    @ResponseBody
    public ModelAndView toCompanyInfoBack( HttpServletRequest request){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("count");
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        StringBuffer promap = new StringBuffer();
        promap.append("[");
        int type = user.getType();
        if(type == 0){
            List<Provinces> list = new ArrayList<Provinces>();
            ProvincesExample provexample = new ProvincesExample();
            list = provincesDao.selectByExample(provexample);
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
                        List<CompanyInfo> list4 = new ArrayList<CompanyInfo>();
                        list4 = companyInfoDao.selectByLevelAndCounty(user,list3.get(k).getName());
                        for(int l = 0; l < list4.size(); l++){
                            promap.append("{'name':'"+list4.get(l).getName().replace("'","\'")+"',"+ "'pId':"+list3.get(k).getCode()+",'id':" + list4.get(l).getCompanyId() + ",type:'3'},");
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
                    List<CompanyInfo> list4 = new ArrayList<CompanyInfo>();
                    list4 = companyInfoDao.selectByLevelAndCounty(user,list3.get(k).getName());
                    for(int l = 0; l < list4.size(); l++){
                        promap.append("{'name':'"+list4.get(l).getName().replace("'","\'")+"',"+ "'pId':"+list3.get(k).getCode()+",'id':" + list4.get(l).getCompanyId() + ",type:'3'},");
                    }
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
                List<CompanyInfo> list4 = new ArrayList<CompanyInfo>();
                list4 = companyInfoDao.selectByLevelAndCounty(user,list3.get(k).getName());
                for(int l = 0; l < list4.size(); l++){
                    promap.append("{'name':'"+list4.get(l).getName().replace("'","\'")+"',"+ "'pId':"+list3.get(k).getCode()+",'id':" + list4.get(l).getCompanyId() + ",type:'3'},");
                }
            }
        }
        if(type == 3){
            List<Areas> list3 = new ArrayList<Areas>();
            AreasExample areasExample = new AreasExample();
            areasExample.createCriteria().andNameEqualTo(user.getCounty());
            list3 = areasDao.selectByExample(areasExample);
            promap.append("{'name':'"+list3.get(0).getName()+"',"+ "'pId':0,'id':" + list3.get(0).getCode() + ",type:'2'},");
            List<CompanyInfo> list4 = new ArrayList<CompanyInfo>();
            list4 = companyInfoDao.selectByLevelAndCounty(user,list3.get(0).getName());
            for(int l = 0; l < list4.size(); l++){
                promap.append("{'name':'"+list4.get(l).getName().replace("'","\'")+"',"+ "'pId':"+list3.get(0).getCode()+",'id':" + list4.get(l).getCompanyId() + ",type:'3'},");
            }
        }
        promap.deleteCharAt(promap.length() - 1);
        promap.append("]");
        System.out.println(promap);
        modelAndView.addObject("promap", promap.toString());
//        List<CompanyInfo> companys = companyInfoDao.selectCompanyInfoByLevel(user);
//        modelAndView.addObject("companys", companys);
        Website websiteall = websiteDao.sumByUser(user);
        if(websiteall == null){
            websiteall = new Website();
            websiteall.setFlourExp(0.0);websiteall.setFlourReal(0.0);websiteall.setRiceExp(0.0);websiteall.setRiceReal(0.0);websiteall.setOilExp(0.0);websiteall.setOilReal(0.0);websiteall.setElseExp(0.0);websiteall.setElseReal(0.0);
        }
        modelAndView.addObject("websiteall", websiteall);
        Delivery deliveryall = deliveryDao.sumByUser(user);
        if(deliveryall == null){
            deliveryall = new Delivery();
            deliveryall.setCarNum(0);deliveryall.setDeliveryDay(0.0);deliveryall.setDeliveryDayReal(0.0);deliveryall.setDeliveryNum(0);deliveryall.setRadius(0.0);deliveryall.setWareAbility(0.0);
        }
        modelAndView.addObject("deliveryall", deliveryall);
        Storeage storeageall = storeageDao.sumByUser(user);
        if(storeageall == null){
            storeageall = new Storeage();
            storeageall.setCarNum(0);storeageall.setTransportDay(0.0);storeageall.setTransportDayReal(0.0);
        }
        modelAndView.addObject("storeageall", storeageall);
        Machine machineall = machineDao.sumByUser(user);
        if(machineall == null){
            machineall = new Machine();
            machineall.setWheatDay(0.0);machineall.setWheatDayReal(0.0);machineall.setPaddyDay(0.0);machineall.setPaddyDayReal(0.0);machineall.setOilDay(0.0);machineall.setOilDayReal(0.0);machineall.setOilConciseDay(0.0);machineall.setOilConciseDayReal(0.0);machineall.setOilSubpDay(0.0);machineall.setOilSubpDayReal(0.0);machineall.setElseDay(0.0);machineall.setElseDayReal(0.0);
        }
        modelAndView.addObject("machineall", machineall);

        int companystste = 1;
        modelAndView.addObject("companystste", companystste);
        CompanyInfo companyall = new CompanyInfo();
        modelAndView.addObject("companyall", companyall);

        return modelAndView;
    }

    @RequestMapping("/toCountStatic")
    @ResponseBody
    public ModelAndView toCompanyInfo( HttpServletRequest request){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("count");
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        String promap = "";
        PropertiesUtil p = new PropertiesUtil("tree.properties");
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
        modelAndView.addObject("promap", promap);
//        List<CompanyInfo> companys = companyInfoDao.selectCompanyInfoByLevel(user);
//        modelAndView.addObject("companys", companys);
        Website websiteall = websiteDao.sumByUser(user);
        if(websiteall == null){
            websiteall = new Website();
            websiteall.setFlourExp(0.0);websiteall.setFlourReal(0.0);websiteall.setRiceExp(0.0);websiteall.setRiceReal(0.0);websiteall.setOilExp(0.0);websiteall.setOilReal(0.0);websiteall.setElseExp(0.0);websiteall.setElseReal(0.0);
        }
        modelAndView.addObject("websiteall", websiteall);
        Delivery deliveryall = deliveryDao.sumByUser(user);
        if(deliveryall == null){
            deliveryall = new Delivery();
            deliveryall.setCarNum(0);deliveryall.setDeliveryDay(0.0);deliveryall.setDeliveryDayReal(0.0);deliveryall.setDeliveryNum(0);deliveryall.setRadius(0.0);deliveryall.setWareAbility(0.0);
        }
        modelAndView.addObject("deliveryall", deliveryall);
        Storeage storeageall = storeageDao.sumByUser(user);
        if(storeageall == null){
            storeageall = new Storeage();
            storeageall.setCarNum(0);storeageall.setTransportDay(0.0);storeageall.setTransportDayReal(0.0);
        }
        modelAndView.addObject("storeageall", storeageall);
        Machine machineall = machineDao.sumByUser(user);
        if(machineall == null){
            machineall = new Machine();
            machineall.setWheatDay(0.0);machineall.setWheatDayReal(0.0);machineall.setPaddyDay(0.0);machineall.setPaddyDayReal(0.0);machineall.setOilDay(0.0);machineall.setOilDayReal(0.0);machineall.setOilConciseDay(0.0);machineall.setOilConciseDayReal(0.0);machineall.setOilSubpDay(0.0);machineall.setOilSubpDayReal(0.0);machineall.setElseDay(0.0);machineall.setElseDayReal(0.0);
        }
        modelAndView.addObject("machineall", machineall);

        int companystste = 1;
        modelAndView.addObject("companystste", companystste);
        CompanyInfo companyall = new CompanyInfo();
        modelAndView.addObject("companyall", companyall);

        return modelAndView;
    }

    @RequestMapping("/toTreeSaerch")
    @ResponseBody
    public ModelAndView toTreeSaerch( HttpServletRequest request,String level,String txt,int treeId) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("count");
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        CompanyInfo companyall = new CompanyInfo();
        int companystste = 1;
        if(level.equals("0")){
//            List<CompanyInfo> companys = companyInfoDao.selectByLevelAndProvince(user,txt);
//            modelAndView.addObject("companys", companys);
            Website websiteall = websiteDao.sumByUserAndProvince(user,txt);
            if(websiteall == null){
                websiteall = new Website();
                websiteall.setFlourExp(0.0);websiteall.setFlourReal(0.0);websiteall.setRiceExp(0.0);websiteall.setRiceReal(0.0);websiteall.setOilExp(0.0);websiteall.setOilReal(0.0);websiteall.setElseExp(0.0);websiteall.setElseReal(0.0);
            }
            modelAndView.addObject("websiteall", websiteall);
            Delivery deliveryall = deliveryDao.sumByUserAndProvince(user,txt);
            if(deliveryall == null){
                deliveryall = new Delivery();
                deliveryall.setCarNum(0);deliveryall.setDeliveryDay(0.0);deliveryall.setDeliveryDayReal(0.0);deliveryall.setDeliveryNum(0);deliveryall.setRadius(0.0);deliveryall.setWareAbility(0.0);
            }
            modelAndView.addObject("deliveryall", deliveryall);
            Storeage storeageall = storeageDao.sumByUserAndProvince(user,txt);
            if(storeageall == null){
                storeageall = new Storeage();
                storeageall.setCarNum(0);storeageall.setTransportDay(0.0);storeageall.setTransportDayReal(0.0);
            }
            modelAndView.addObject("storeageall", storeageall);
            Machine machineall = machineDao.sumByUserAndProvince(user,txt);
            if(machineall == null){
                machineall = new Machine();
                machineall.setWheatDay(0.0);machineall.setWheatDayReal(0.0);machineall.setPaddyDay(0.0);machineall.setPaddyDayReal(0.0);machineall.setOilDay(0.0);machineall.setOilDayReal(0.0);machineall.setOilConciseDay(0.0);machineall.setOilConciseDayReal(0.0);machineall.setOilSubpDay(0.0);machineall.setOilSubpDayReal(0.0);machineall.setElseDay(0.0);machineall.setElseDayReal(0.0);
            }
            modelAndView.addObject("machineall", machineall);
        }
        if(level.equals("1")){
//            List<CompanyInfo> companys = companyInfoDao.selectByLevelAndCity(user,txt);
//            modelAndView.addObject("companys", companys);
            Website websiteall = websiteDao.sumByUserAndCity(user,txt);
            if(websiteall == null){
                websiteall = new Website();
                websiteall.setFlourExp(0.0);websiteall.setFlourReal(0.0);websiteall.setRiceExp(0.0);websiteall.setRiceReal(0.0);websiteall.setOilExp(0.0);websiteall.setOilReal(0.0);websiteall.setElseExp(0.0);websiteall.setElseReal(0.0);
            }
            modelAndView.addObject("websiteall", websiteall);
            Delivery deliveryall = deliveryDao.sumByUserAndCity(user,txt);
            if(deliveryall == null){
                deliveryall = new Delivery();
                deliveryall.setCarNum(0);deliveryall.setDeliveryDay(0.0);deliveryall.setDeliveryDayReal(0.0);deliveryall.setDeliveryNum(0);deliveryall.setRadius(0.0);deliveryall.setWareAbility(0.0);
            }
            modelAndView.addObject("deliveryall", deliveryall);
            Storeage storeageall = storeageDao.sumByUserAndCity(user,txt);
            if(storeageall == null){
                storeageall = new Storeage();
                storeageall.setCarNum(0);storeageall.setTransportDay(0.0);storeageall.setTransportDayReal(0.0);
            }
            modelAndView.addObject("storeageall", storeageall);
            Machine machineall = machineDao.sumByUserAndCity(user,txt);
            if(machineall == null){
                machineall = new Machine();
                machineall.setWheatDay(0.0);machineall.setWheatDayReal(0.0);machineall.setPaddyDay(0.0);machineall.setPaddyDayReal(0.0);machineall.setOilDay(0.0);machineall.setOilDayReal(0.0);machineall.setOilConciseDay(0.0);machineall.setOilConciseDayReal(0.0);machineall.setOilSubpDay(0.0);machineall.setOilSubpDayReal(0.0);machineall.setElseDay(0.0);machineall.setElseDayReal(0.0);
            }
            modelAndView.addObject("machineall", machineall);
        }
        if(level.equals("2")){
            List<CompanyInfo> companys = companyInfoDao.selectByLevelAndCounty(user,txt);
            modelAndView.addObject("companys", companys);
            Website websiteall = websiteDao.sumByUserAndCountry(user,txt);
            if(websiteall == null){
                websiteall = new Website();
                websiteall.setFlourExp(0.0);websiteall.setFlourReal(0.0);websiteall.setRiceExp(0.0);websiteall.setRiceReal(0.0);websiteall.setOilExp(0.0);websiteall.setOilReal(0.0);websiteall.setElseExp(0.0);websiteall.setElseReal(0.0);
            }
            modelAndView.addObject("websiteall", websiteall);
            Delivery deliveryall = deliveryDao.sumByUserAndCountry(user,txt);
            if(deliveryall == null){
                deliveryall = new Delivery();
                deliveryall.setCarNum(0);deliveryall.setDeliveryDay(0.0);deliveryall.setDeliveryDayReal(0.0);deliveryall.setDeliveryNum(0);deliveryall.setRadius(0.0);deliveryall.setWareAbility(0.0);
            }
            modelAndView.addObject("deliveryall", deliveryall);
            Storeage storeageall = storeageDao.sumByUserAndCountry(user,txt);
            if(storeageall == null){
                storeageall = new Storeage();
                storeageall.setCarNum(0);storeageall.setTransportDay(0.0);storeageall.setTransportDayReal(0.0);
            }
            modelAndView.addObject("storeageall", storeageall);
            Machine machineall = machineDao.sumByUserAndCountry(user,txt);
            if(machineall == null){
                machineall = new Machine();
                machineall.setWheatDay(0.0);machineall.setWheatDayReal(0.0);machineall.setPaddyDay(0.0);machineall.setPaddyDayReal(0.0);machineall.setOilDay(0.0);machineall.setOilDayReal(0.0);machineall.setOilConciseDay(0.0);machineall.setOilConciseDayReal(0.0);machineall.setOilSubpDay(0.0);machineall.setOilSubpDayReal(0.0);machineall.setElseDay(0.0);machineall.setElseDayReal(0.0);
            }
            modelAndView.addObject("machineall", machineall);
        }
        if(level.equals("3")){
            companyall = companyInfoDao.selectByPrimaryKey(treeId);
            WebsiteExample websiteExample = new WebsiteExample();
            websiteExample.createCriteria().andCompanyIdEqualTo(treeId);
            List<Website> websites = websiteDao.selectByExample(websiteExample);
            Website websiteall = new Website();
            if(websites.size()>0){
                websiteall = websites.get(0);
                companystste = websites.get(0).getState();
            }else{
                websiteall.setFlourExp(0.0);websiteall.setFlourReal(0.0);websiteall.setRiceExp(0.0);websiteall.setRiceReal(0.0);websiteall.setOilExp(0.0);websiteall.setOilReal(0.0);websiteall.setElseExp(0.0);websiteall.setElseReal(0.0);
            }
            modelAndView.addObject("websiteall", websiteall);
            DeliveryExample deliveryExample = new DeliveryExample();
            deliveryExample.createCriteria().andCompanyIdEqualTo(treeId);
            List<Delivery> deliveries = deliveryDao.selectByExample(deliveryExample);
            Delivery deliveryall = new Delivery();
            if(deliveries.size()>0){
                deliveryall = deliveries.get(0);
                companystste = deliveries.get(0).getState();
            }else{
                deliveryall.setCarNum(0);deliveryall.setDeliveryDay(0.0);deliveryall.setDeliveryDayReal(0.0);deliveryall.setDeliveryNum(0);deliveryall.setRadius(0.0);deliveryall.setWareAbility(0.0);
            }
            modelAndView.addObject("deliveryall", deliveryall);
            StoreageExample storeageExample = new StoreageExample();
            storeageExample.createCriteria().andCompanyIdEqualTo(treeId);
            List<Storeage> storeages = storeageDao.selectByExample(storeageExample);
            Storeage storeageall = new Storeage();
            if(storeages.size()>0){
                storeageall = storeages.get(0);
                companystste = storeages.get(0).getState();
            }else{
                storeageall.setCarNum(0);storeageall.setTransportDay(0.0);storeageall.setTransportDayReal(0.0);
            }
            modelAndView.addObject("storeageall", storeageall);
            MachineExample machineExample = new MachineExample();
            machineExample.createCriteria().andCompanyIdEqualTo(treeId);
            List<Machine> machines = machineDao.selectByExample(machineExample);
            Machine machineall = new Machine();
            if(machines.size()>0){
                machineall = machines.get(0);
                companystste = machines.get(0).getState();
            }else{
                machineall.setWheatDay(0.0);machineall.setWheatDayReal(0.0);machineall.setPaddyDay(0.0);machineall.setPaddyDayReal(0.0);machineall.setOilDay(0.0);machineall.setOilDayReal(0.0);machineall.setOilConciseDay(0.0);machineall.setOilConciseDayReal(0.0);machineall.setOilSubpDay(0.0);machineall.setOilSubpDayReal(0.0);machineall.setElseDay(0.0);machineall.setElseDayReal(0.0);

            }
            modelAndView.addObject("machineall", machineall);
        }
        modelAndView.addObject("companystste", companystste);
        modelAndView.addObject("companyall", companyall);

        return modelAndView;
    }

    @RequestMapping("/toTreelist")
    @ResponseBody
    public String toTreelist( HttpServletRequest request){
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        StringBuffer promap = new StringBuffer();
        promap.append("[");
        int type = user.getType();
        if(type == 0){
            List<Provinces> list = new ArrayList<Provinces>();
            ProvincesExample provexample = new ProvincesExample();
            list = provincesDao.selectByExample(provexample);
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
                        List<CompanyInfo> list4 = new ArrayList<CompanyInfo>();
                        list4 = companyInfoDao.selectByLevelAndCounty(user,list3.get(k).getName());
                        for(int l = 0; l < list4.size(); l++){
                            promap.append("{'name':'"+list4.get(l).getName()+"',"+ "'pId':"+list3.get(k).getCode()+",'id':" + list4.get(l).getCompanyId() + ",type:'3'},");
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
                    List<CompanyInfo> list4 = new ArrayList<CompanyInfo>();
                    list4 = companyInfoDao.selectByLevelAndCounty(user,list3.get(k).getName());
                    for(int l = 0; l < list4.size(); l++){
                        promap.append("{'name':'"+list4.get(l).getName()+"',"+ "'pId':"+list3.get(k).getCode()+",'id':" + list4.get(l).getCompanyId() + ",type:'3'},");
                    }
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
                List<CompanyInfo> list4 = new ArrayList<CompanyInfo>();
                list4 = companyInfoDao.selectByLevelAndCounty(user,list3.get(k).getName());
                for(int l = 0; l < list4.size(); l++){
                    promap.append("{'name':'"+list4.get(l).getName()+"',"+ "'pId':"+list3.get(k).getCode()+",'id':" + list4.get(l).getCompanyId() + ",type:'3'},");
                }
            }
        }
        if(type == 3){
            List<Areas> list3 = new ArrayList<Areas>();
            AreasExample areasExample = new AreasExample();
            areasExample.createCriteria().andNameEqualTo(user.getCounty());
            list3 = areasDao.selectByExample(areasExample);
            promap.append("{'name':'"+list3.get(0).getName()+"',"+ "'pId':0,'id':" + list3.get(0).getCode() + ",type:'2'},");
            List<CompanyInfo> list4 = new ArrayList<CompanyInfo>();
            list4 = companyInfoDao.selectByLevelAndCounty(user,list3.get(0).getName());
            for(int l = 0; l < list4.size(); l++){
                promap.append("{'name':'"+list4.get(l).getName()+"',"+ "'pId':"+list3.get(0).getCode()+",'id':" + list4.get(l).getCompanyId() + ",type:'3'},");
            }
        }
        promap.deleteCharAt(promap.length() - 1);
        promap.append("]");

        return  promap.toString();
    }

    @RequestMapping("/CompanySearchUpdate")
    @ResponseBody
    public String CompanySearchUpdate(CompanyInfo companyInfo){
        String message = "";
        companyInfoDao.updateByPrimaryKeySelective(companyInfo);
        return message;
    }

    @RequestMapping("/CompanySearchDelete")
    @ResponseBody
    public String CompanySearchDelete(int companyId){
        String message = "";
        companyInfoDao.deleteByPrimaryKey(companyId);
        return message;
    }

    @RequestMapping("/DeliverySearchUpdate")
    @ResponseBody
    public String DeliverySearchUpdate(CompanyInfo companyInfo,Delivery delivery){
        String message = "";
        companyInfoDao.updateByPrimaryKeySelective(companyInfo);
        deliveryDao.updateByPrimaryKeySelective(delivery);
        return message;
    }

    @RequestMapping("/MechineSearchUpdate")
    @ResponseBody
    public String MechineSearchUpdate(CompanyInfo companyInfo,Machine machine){
        String message = "";
        companyInfoDao.updateByPrimaryKeySelective(companyInfo);
        machineDao.updateByPrimaryKeySelective(machine);
        return message;
    }

    @RequestMapping("/StoreageSearchUpdate")
    @ResponseBody
    public String StoreageSearchUpdate(CompanyInfo companyInfo,Storeage storeage){
        String message = "";
        companyInfoDao.updateByPrimaryKeySelective(companyInfo);
        storeageDao.updateByPrimaryKeySelective(storeage);
        return message;
    }

    @RequestMapping("/SupplySearchUpdate")
    @ResponseBody
    public String SupplySearchUpdate(CompanyInfo companyInfo,Website website){
        String message = "";
        companyInfoDao.updateByPrimaryKeySelective(companyInfo);
        websiteDao.updateByPrimaryKeySelective(website);
        return message;
    }

}
