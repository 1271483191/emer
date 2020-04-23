package com.yunjing.emer.controller;

import com.yunjing.emer.dao.*;
import com.yunjing.emer.entity.*;
import com.yunjing.emer.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

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
    ProvincesDao provincesDao;

    @Autowired
    DeliveryDao deliveryDao;

    @Autowired
    MachineDao machineDao;

    @Autowired
    StoreageDao storeageDao;

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
                promap1.append(temp.getInDay()+",");
                promap2.append(temp.getOutDay()+",");
                promap3.append(temp.getSaveDay()+",");
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
                promap1.append(temp.getFlourExp()+",");
                promap2.append(temp.getRiceExp()+",");
                promap3.append(temp.getOilExp()+",");
                promap4.append(temp.getElseExp()+",");
                promap5.append(temp.getFlourReal()+",");
                promap6.append(temp.getRiceReal()+",");
                promap7.append(temp.getOilReal()+",");
                promap8.append(temp.getElseReal()+",");
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
                promap1.append(temp.getInDay()+",");
                promap2.append(temp.getOutDay()+",");
                promap3.append(temp.getSaveDay()+",");
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
                promap1.append(temp.getWareAbility()+",");
                promap2.append(temp.getDeliveryDay()+",");
                promap3.append(temp.getDeliveryDayReal()+",");
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
                promap1.append(temp.getInDay()+",");
                promap2.append(temp.getOutDay()+",");
                promap3.append(temp.getSaveDay()+",");
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
                promap1.append(temp.getTransportDay()+",");
                promap2.append(temp.getCarNum()+",");
                promap3.append(temp.getTransportDayReal()+",");
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
                promap1.append(temp.getInDay()+",");
                promap2.append(temp.getOutDay()+",");
                promap3.append(temp.getSaveDay()+",");
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
                promap1.append(temp.getWheatDay()+",");
                promap2.append(temp.getPaddyDay()+",");
                promap3.append(temp.getOilDay()+",");
                promap4.append(temp.getOilConciseDay()+",");
                promap5.append(temp.getOilSubpDay()+",");
                promap6.append(temp.getElseDay()+",");
                promap7.append(temp.getWheatDayReal()+",");
                promap8.append(temp.getPaddyDayReal()+",");
                promap9.append(temp.getOilDayReal()+",");
                promap10.append(temp.getOilConciseDayReal()+",");
                promap11.append(temp.getOilSubpDayReal()+",");
                promap12.append(temp.getElseDayReal()+",");
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
}
