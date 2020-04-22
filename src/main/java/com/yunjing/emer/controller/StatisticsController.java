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
        WebsiteExample websiteExample = new WebsiteExample();
        websiteExample.createCriteria().andStateEqualTo(1);
        Website Webstatic = websiteDao.sumByExample(websiteExample);
        modelAndView.addObject("Webstatic", Webstatic);
        websiteExample = new WebsiteExample();
        websiteExample.createCriteria().andStateEqualTo(1);
        long usenum = websiteDao.countByExample(websiteExample);
        modelAndView.addObject("usenum", usenum);
        websiteExample = new WebsiteExample();
        websiteExample.createCriteria().andStateEqualTo(0);
        long stopnum = websiteDao.countByExample(websiteExample);
        modelAndView.addObject("stopnum", stopnum);
        CompanyInfoExample companyExample = new CompanyInfoExample();
        companyExample.createCriteria().andCompanyTypeEqualTo(1);
        long newnum = companyInfoDao.countByWebsite(companyExample);
        modelAndView.addObject("newnum", newnum);
        companyExample = new CompanyInfoExample();
        companyExample.createCriteria().andCompanyTypeEqualTo(0);
        long disablenum = companyInfoDao.countByWebsite(companyExample);
        modelAndView.addObject("disablenum", disablenum);
        companyExample = new CompanyInfoExample();
        CompanyInfo companystatic = companyInfoDao.sumByWebsite(companyExample);
        modelAndView.addObject("in_day",companystatic.getInDay());
        modelAndView.addObject("out_day",companystatic.getOutDay());
        modelAndView.addObject("save_day",companystatic.getSaveDay());
        return modelAndView;
    }

    @RequestMapping("/toMachiningStatistics")
    @ResponseBody
    public ModelAndView toMachiningStatistics(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("machining-statistics");
        MachineExample machineExample = new MachineExample();
        machineExample.createCriteria().andStateEqualTo(1);
        Machine Machinestatic = machineDao.sumByExample(machineExample);
        modelAndView.addObject("Machinestatic", Machinestatic);
        machineExample = new MachineExample();
        machineExample.createCriteria().andStateEqualTo(1);
        long usenum = machineDao.countByExample(machineExample);
        modelAndView.addObject("usenum", usenum);
        machineExample = new MachineExample();
        machineExample.createCriteria().andStateEqualTo(0);
        long stopnum = machineDao.countByExample(machineExample);
        modelAndView.addObject("stopnum", stopnum);
        CompanyInfoExample companyExample = new CompanyInfoExample();
        companyExample.createCriteria().andCompanyTypeEqualTo(1);
        long newnum = companyInfoDao.countByMachine(companyExample);
        modelAndView.addObject("newnum", newnum);
        companyExample = new CompanyInfoExample();
        companyExample.createCriteria().andCompanyTypeEqualTo(0);
        long disablenum = companyInfoDao.countByMachine(companyExample);
        modelAndView.addObject("disablenum", disablenum);
        companyExample = new CompanyInfoExample();
        CompanyInfo companystatic = companyInfoDao.sumByMachine(companyExample);
        modelAndView.addObject("in_day",companystatic.getInDay());
        modelAndView.addObject("out_day",companystatic.getOutDay());
        modelAndView.addObject("save_day",companystatic.getSaveDay());
        return modelAndView;
    }

    @RequestMapping("/toDeliverStatistics")
    @ResponseBody
    public ModelAndView toDeliverStatistics(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("deliver-statistics");
        List<String> hb=new ArrayList<String>();
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
        Delivery hbstatic = deliveryDao.sumByProvince(hb);
        modelAndView.addObject("hbstatic", hbstatic);
        Delivery dbstatic = deliveryDao.sumByProvince(db);
        modelAndView.addObject("dbstatic", dbstatic);
        Delivery hdstatic = deliveryDao.sumByProvince(hd);
        modelAndView.addObject("hdstatic", hdstatic);
        Delivery znstatic = deliveryDao.sumByProvince(zn);
        modelAndView.addObject("znstatic", znstatic);
        Delivery xnstatic = deliveryDao.sumByProvince(xn);
        modelAndView.addObject("xnstatic", xnstatic);
        Delivery xbstatic = deliveryDao.sumByProvince(xb);
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
        modelAndView.addObject("save_day",companystatic.getSaveDay());
        return modelAndView;
    }

    @RequestMapping("/toStoreageStatistics")
    @ResponseBody
    public ModelAndView toStoreageStatistics(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("storeage-statistics");
        List<String> hb=new ArrayList<String>();
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
        Storeage hbstatic = storeageDao.sumByProvince(hb);
        modelAndView.addObject("hbstatic", hbstatic);
        Storeage dbstatic = storeageDao.sumByProvince(db);
        modelAndView.addObject("dbstatic", dbstatic);
        Storeage hdstatic = storeageDao.sumByProvince(hd);
        modelAndView.addObject("hdstatic", hdstatic);
        Storeage znstatic = storeageDao.sumByProvince(zn);
        modelAndView.addObject("znstatic", znstatic);
        Storeage xnstatic = storeageDao.sumByProvince(xn);
        modelAndView.addObject("xnstatic", xnstatic);
        Storeage xbstatic = storeageDao.sumByProvince(xb);
        modelAndView.addObject("xbstatic", xbstatic);
        StoreageExample storeageExample = new StoreageExample();
        storeageExample.createCriteria().andStateEqualTo(1);
        long usenum = storeageDao.countByExample(storeageExample);
        modelAndView.addObject("usenum", usenum);
        storeageExample = new StoreageExample();
        storeageExample.createCriteria().andStateEqualTo(0);
        long stopnum = storeageDao.countByExample(storeageExample);
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
        CompanyInfo companystatic = companyInfoDao.sumByStoreage(companyExample);
        modelAndView.addObject("in_day",companystatic.getInDay());
        modelAndView.addObject("out_day",companystatic.getOutDay());
        modelAndView.addObject("save_day",companystatic.getSaveDay());
        return modelAndView;
    }

}
