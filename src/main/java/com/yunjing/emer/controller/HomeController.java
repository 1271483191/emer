package com.yunjing.emer.controller;

import com.yunjing.emer.dao.CompanyInfoDao;
import com.yunjing.emer.dao.DeliveryDao;
import com.yunjing.emer.dao.ProvincesDao;
import com.yunjing.emer.entity.*;
import com.yunjing.emer.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by yinwenyao on 20/4/16.
 */

@Controller
public class HomeController {

    @Autowired
    ProvincesDao provincesDao;

    @Autowired
    DeliveryDao deliveryDao;

    @Autowired
    CompanyInfoDao companyInfoDao;

    //获取各省企业数量地图
    @RequestMapping("/homemap")
    @ResponseBody
    public String getProvinceMap() {
        List<Provinces> list = new ArrayList<Provinces>();
        ProvincesExample provexample = new ProvincesExample();
        StringBuffer promap = new StringBuffer();
        promap.append("[");
        list = provincesDao.selectByExample(provexample);
        for (int i = 0; i < list.size(); i++) {
            CompanyInfoExample companyInfoExample = new CompanyInfoExample();
            companyInfoExample.createCriteria().andProvinceEqualTo(list.get(i).getName().toString());
            long count = companyInfoDao.countByExample(companyInfoExample);
            promap.append("{name:'" + list.get(i).getName().replace("省", "").replace("市", "").replace("内蒙古自治区", "内蒙古").replace("广西壮族自治区","广西").replace("宁夏回族自治区","宁夏").replace("新疆维吾尔自治区","新疆").replace("西藏自治区","西藏").toString() + "',value:'" + count + "'},");
        }
        promap.append("]");
        return promap.toString();
    }

    //京津冀企业信息汇总
    @RequestMapping("/homejjj")
    @ResponseBody
    public String homeJJJ() {
        CompanyInfoExample companyInfoExample = new CompanyInfoExample();
        StringBuffer promap = new StringBuffer();
        promap.append("[");
        List<String> prolist=new ArrayList<String>();
        prolist.add("北京市");
        prolist.add("天津市");
        prolist.add("河北省");
        companyInfoExample.createCriteria().andProvinceIn(prolist);
        long countD= companyInfoDao.countByDelivery(companyInfoExample);
        promap.append("{name:'配送中心',"+ "value:'" + countD + "'},");
        long countS= companyInfoDao.countByStoreage(companyInfoExample);
        promap.append("{name:'储运企业',"+ "value:'" + countS + "'},");
        long countW= companyInfoDao.countByWebsite(companyInfoExample);
        promap.append("{name:'供应网点',"+ "value:'" + countW + "'},");
        long countM= companyInfoDao.countByMachine(companyInfoExample);
        promap.append("{name:'应急加工',"+ "value:'" + countM + "'}");
        promap.append("]");
        return promap.toString();

    }

    //云贵川企业信息汇总
    @RequestMapping("/homeygc")
    @ResponseBody
    public String homeYgc() {
        CompanyInfoExample companyInfoExample = new CompanyInfoExample();
        StringBuffer promap = new StringBuffer();
        promap.append("[");
        List<String> prolist=new ArrayList<String>();
        prolist.add("云南省");
        prolist.add("贵州省");
        prolist.add("四川省");
        companyInfoExample.createCriteria().andProvinceIn(prolist);
        long countD= companyInfoDao.countByDelivery(companyInfoExample);
        promap.append("{name:'配送中心',"+ "value:'" + countD + "'},");
        long countS= companyInfoDao.countByStoreage(companyInfoExample);
        promap.append("{name:'储运企业',"+ "value:'" + countS + "'},");
        long countW= companyInfoDao.countByWebsite(companyInfoExample);
        promap.append("{name:'供应网点',"+ "value:'" + countW + "'},");
        long countM= companyInfoDao.countByMachine(companyInfoExample);
        promap.append("{name:'应急加工',"+ "value:'" + countM + "'}");
        promap.append("]");
        return promap.toString();

    }

    //长三角企业信息汇总
    @RequestMapping("/homecsj")
    @ResponseBody
    public String homeCsj() {
        CompanyInfoExample companyInfoExample = new CompanyInfoExample();
        StringBuffer promap = new StringBuffer();
        promap.append("[");
        List<String> prolist=new ArrayList<String>();
        prolist.add("上海市");
        prolist.add("江苏省");
        prolist.add("浙江省");
        prolist.add("安徽省");
        companyInfoExample.createCriteria().andProvinceIn(prolist);
        long countD= companyInfoDao.countByDelivery(companyInfoExample);
        promap.append("{name:'配送中心',"+ "value:'" + countD + "'},");
        long countS= companyInfoDao.countByStoreage(companyInfoExample);
        promap.append("{name:'储运企业',"+ "value:'" + countS + "'},");
        long countW= companyInfoDao.countByWebsite(companyInfoExample);
        promap.append("{name:'供应网点',"+ "value:'" + countW + "'},");
        long countM= companyInfoDao.countByMachine(companyInfoExample);
        promap.append("{name:'应急加工',"+ "value:'" + countM + "'}");
        promap.append("]");
        return promap.toString();

    }

    //珠三角企业信息汇总
    @RequestMapping("/homezsj")
    @ResponseBody
    public String homeZsj() {
        CompanyInfoExample companyInfoExample = new CompanyInfoExample();
        StringBuffer promap = new StringBuffer();
        promap.append("[");
        List<String> prolist=new ArrayList<String>();
        prolist.add("广州市");
        prolist.add("深圳市");
        prolist.add("佛山市");
        prolist.add("东莞市");
        prolist.add("中山市");
        prolist.add("珠海市");
        prolist.add("江门市");
        prolist.add("肇庆市");
        prolist.add("惠州市");
        companyInfoExample.createCriteria().andCityIn(prolist);
        long countD= companyInfoDao.countByDelivery(companyInfoExample);
        promap.append("{name:'配送中心',"+ "value:'" + countD + "'},");
        long countS= companyInfoDao.countByStoreage(companyInfoExample);
        promap.append("{name:'储运企业',"+ "value:'" + countS + "'},");
        long countW= companyInfoDao.countByWebsite(companyInfoExample);
        promap.append("{name:'供应网点',"+ "value:'" + countW + "'},");
        long countM= companyInfoDao.countByMachine(companyInfoExample);
        promap.append("{name:'应急加工',"+ "value:'" + countM + "'}");
        promap.append("]");
        return promap.toString();

    }

}
