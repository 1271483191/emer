package com.yunjing.emer.util;
import com.yunjing.emer.dao.AreasDao;
import com.yunjing.emer.dao.CitiesDao;
import com.yunjing.emer.dao.CompanyInfoDao;
import com.yunjing.emer.dao.ProvincesDao;
import com.yunjing.emer.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zxl on 2020/5/14.
 */

@Component
public class TimeTask {
    @Autowired
    CompanyInfoDao companyInfoDao;

    @Autowired
    ProvincesDao provincesDao;

    @Autowired
    CitiesDao citiesDao;

    @Autowired
    AreasDao areasDao;

    @Scheduled(cron="0 0 */2 * * ?")  	 // 间隔30分钟执行
    public void areaTree(){
        try {
            //要执行的任务逻辑写在这里
            long startTime = System.currentTimeMillis();

            PropertiesUtil p = new PropertiesUtil("tree.properties");
            System.out.println("areaTree定时任务开始。。。。。。");
            StringBuffer promap = new StringBuffer();
            promap.append("[");
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
                        list4 = companyInfoDao.selectByTypeAndCounty(0,list3.get(k).getName());
                        for(int l = 0; l < list4.size(); l++){
                            promap.append("{'name':'"+list4.get(l).getName().replace("'","\'")+"',"+ "'pId':"+list3.get(k).getCode()+",'id':" + list4.get(l).getCompanyId() + ",type:'3'},");
                        }
                    }
                }
            }
            promap.deleteCharAt(promap.length() - 1);
            promap.append("]");
            p.writeProperty("all0",promap.toString());

            list = new ArrayList<Provinces>();
            provexample = new ProvincesExample();
            list = provincesDao.selectByExample(provexample);
            for(int i = 0; i < list.size(); i++){
                promap = new StringBuffer();
                promap.append("[");
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
                        list4 = companyInfoDao.selectByTypeAndCounty(1,list3.get(k).getName());
                        for(int l = 0; l < list4.size(); l++){
                            promap.append("{'name':'"+list4.get(l).getName().replace("'","\'")+"',"+ "'pId':"+list3.get(k).getCode()+",'id':" + list4.get(l).getCompanyId() + ",type:'3'},");
                        }
                    }
                }
                promap.deleteCharAt(promap.length() - 1);
                promap.append("]");
                p.writeProperty(list.get(i).getName()+"1",promap.toString());
            }

            List<Cities> list2 = new ArrayList<Cities>();
            CitiesExample citiesExample = new CitiesExample();
            list2 = citiesDao.selectByExample(citiesExample);
            for (int j = 0; j < list2.size(); j++) {
                promap = new StringBuffer();
                promap.append("[");
                promap.append("{'name':'"+list2.get(j).getName()+"',"+ "'pId':0,'id':" + list2.get(j).getCode() + ",type:'1'},");
                List<Areas> list3 = new ArrayList<Areas>();
                AreasExample areasExample = new AreasExample();
                areasExample.createCriteria().andCitycodeEqualTo(list2.get(j).getCode());
                list3 = areasDao.selectByExample(areasExample);
                for (int k = 0; k < list3.size(); k++) {
                    promap.append("{'name':'"+list3.get(k).getName()+"',"+ "'pId':"+list3.get(k).getCitycode()+",'id':" + list3.get(k).getCode() + ",type:'2'},");
                    List<CompanyInfo> list4 = new ArrayList<CompanyInfo>();
                    list4 = companyInfoDao.selectByTypeAndCounty(2,list3.get(k).getName());
                    for(int l = 0; l < list4.size(); l++){
                        promap.append("{'name':'"+list4.get(l).getName().replace("'","\'")+"',"+ "'pId':"+list3.get(k).getCode()+",'id':" + list4.get(l).getCompanyId() + ",type:'3'},");
                    }
                }
                promap.deleteCharAt(promap.length() - 1);
                promap.append("]");
                p.writeProperty(list2.get(j).getName()+"2",promap.toString());
            }

            List<Areas> list3 = new ArrayList<Areas>();
            AreasExample areasExample = new AreasExample();
            list3 = areasDao.selectByExample(areasExample);
            for (int k = 0; k < list3.size(); k++) {
                promap = new StringBuffer();
                promap.append("[");
                promap.append("{'name':'"+list3.get(k).getName()+"',"+ "'pId':0,'id':" + list3.get(k).getCode() + ",type:'2'},");
                List<CompanyInfo> list4 = new ArrayList<CompanyInfo>();
                list4 = companyInfoDao.selectByTypeAndCounty(3,list3.get(k).getName());
                for(int l = 0; l < list4.size(); l++){
                    promap.append("{'name':'"+list4.get(l).getName().replace("'","\'")+"',"+ "'pId':"+list3.get(k).getCode()+",'id':" + list4.get(l).getCompanyId() + ",type:'3'},");
                }
                promap.deleteCharAt(promap.length() - 1);
                promap.append("]");
                p.writeProperty(list3.get(k).getName()+"3",promap.toString());
            }
            long endTime = System.currentTimeMillis();

            float seconds = (endTime - startTime) / 1000F;

            System.out.println(Float.toString(seconds) + " seconds.");

            System.out.println("插入成功！");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("插入失败！");
        }
    }

    @Scheduled(cron="0 10 */2 * * ?")  	 // 间隔30分钟执行
    public void DeliveryTree(){
        try {
            //要执行的任务逻辑写在这里
            long startTime = System.currentTimeMillis();

            PropertiesUtil p = new PropertiesUtil("DeliveryTree.properties");
            System.out.println("DeliveryTree定时任务开始。。。。。。");
            StringBuffer promap = new StringBuffer();
            promap.append("[");
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
                        list4 = companyInfoDao.selectDeliveryByTypeAndCounty(0,list3.get(k).getName());
                        for(int l = 0; l < list4.size(); l++){
                            promap.append("{'name':'"+list4.get(l).getName().replace("'","\'")+"',"+ "'pId':"+list3.get(k).getCode()+",'id':" + list4.get(l).getCompanyId() + ",type:'3'},");
                        }
                    }
                }
            }
            promap.deleteCharAt(promap.length() - 1);
            promap.append("]");
            p.writeProperty("all0",promap.toString());

            list = new ArrayList<Provinces>();
            provexample = new ProvincesExample();
            list = provincesDao.selectByExample(provexample);
            for(int i = 0; i < list.size(); i++){
                promap = new StringBuffer();
                promap.append("[");
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
                        list4 = companyInfoDao.selectDeliveryByTypeAndCounty(1,list3.get(k).getName());
                        for(int l = 0; l < list4.size(); l++){
                            promap.append("{'name':'"+list4.get(l).getName().replace("'","\'")+"',"+ "'pId':"+list3.get(k).getCode()+",'id':" + list4.get(l).getCompanyId() + ",type:'3'},");
                        }
                    }
                }
                promap.deleteCharAt(promap.length() - 1);
                promap.append("]");
                p.writeProperty(list.get(i).getName()+"1",promap.toString());
            }

            List<Cities> list2 = new ArrayList<Cities>();
            CitiesExample citiesExample = new CitiesExample();
            list2 = citiesDao.selectByExample(citiesExample);
            for (int j = 0; j < list2.size(); j++) {
                promap = new StringBuffer();
                promap.append("[");
                promap.append("{'name':'"+list2.get(j).getName()+"',"+ "'pId':0,'id':" + list2.get(j).getCode() + ",type:'1'},");
                List<Areas> list3 = new ArrayList<Areas>();
                AreasExample areasExample = new AreasExample();
                areasExample.createCriteria().andCitycodeEqualTo(list2.get(j).getCode());
                list3 = areasDao.selectByExample(areasExample);
                for (int k = 0; k < list3.size(); k++) {
                    promap.append("{'name':'"+list3.get(k).getName()+"',"+ "'pId':"+list3.get(k).getCitycode()+",'id':" + list3.get(k).getCode() + ",type:'2'},");
                    List<CompanyInfo> list4 = new ArrayList<CompanyInfo>();
                    list4 = companyInfoDao.selectDeliveryByTypeAndCounty(2,list3.get(k).getName());
                    for(int l = 0; l < list4.size(); l++){
                        promap.append("{'name':'"+list4.get(l).getName().replace("'","\'")+"',"+ "'pId':"+list3.get(k).getCode()+",'id':" + list4.get(l).getCompanyId() + ",type:'3'},");
                    }
                }
                promap.deleteCharAt(promap.length() - 1);
                promap.append("]");
                p.writeProperty(list2.get(j).getName()+"2",promap.toString());
            }

            List<Areas> list3 = new ArrayList<Areas>();
            AreasExample areasExample = new AreasExample();
            list3 = areasDao.selectByExample(areasExample);
            for (int k = 0; k < list3.size(); k++) {
                promap = new StringBuffer();
                promap.append("[");
                promap.append("{'name':'"+list3.get(k).getName()+"',"+ "'pId':0,'id':" + list3.get(k).getCode() + ",type:'2'},");
                List<CompanyInfo> list4 = new ArrayList<CompanyInfo>();
                list4 = companyInfoDao.selectDeliveryByTypeAndCounty(3,list3.get(k).getName());
                for(int l = 0; l < list4.size(); l++){
                    promap.append("{'name':'"+list4.get(l).getName().replace("'","\'")+"',"+ "'pId':"+list3.get(k).getCode()+",'id':" + list4.get(l).getCompanyId() + ",type:'3'},");
                }
                promap.deleteCharAt(promap.length() - 1);
                promap.append("]");
                p.writeProperty(list3.get(k).getName()+"3",promap.toString());
            }
            long endTime = System.currentTimeMillis();

            float seconds = (endTime - startTime) / 1000F;

            System.out.println(Float.toString(seconds) + " seconds.");

            System.out.println("插入成功！");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("插入失败！");
        }
    }

    @Scheduled(cron="0 20 */2 * * ?")
    public void StoreageTree(){
        try {
            //要执行的任务逻辑写在这里
            long startTime = System.currentTimeMillis();

            PropertiesUtil p = new PropertiesUtil("StoreageTree.properties");
            System.out.println("StoreageTree定时任务开始。。。。。。");
            StringBuffer promap = new StringBuffer();
            promap.append("[");
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
                        list4 = companyInfoDao.selectStoreageByTypeAndCounty(0,list3.get(k).getName());
                        for(int l = 0; l < list4.size(); l++){
                            promap.append("{'name':'"+list4.get(l).getName().replace("'","\'")+"',"+ "'pId':"+list3.get(k).getCode()+",'id':" + list4.get(l).getCompanyId() + ",type:'3'},");
                        }
                    }
                }
            }
            promap.deleteCharAt(promap.length() - 1);
            promap.append("]");
            p.writeProperty("all0",promap.toString());

            list = new ArrayList<Provinces>();
            provexample = new ProvincesExample();
            list = provincesDao.selectByExample(provexample);
            for(int i = 0; i < list.size(); i++){
                promap = new StringBuffer();
                promap.append("[");
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
                        list4 = companyInfoDao.selectStoreageByTypeAndCounty(1,list3.get(k).getName());
                        for(int l = 0; l < list4.size(); l++){
                            promap.append("{'name':'"+list4.get(l).getName().replace("'","\'")+"',"+ "'pId':"+list3.get(k).getCode()+",'id':" + list4.get(l).getCompanyId() + ",type:'3'},");
                        }
                    }
                }
                promap.deleteCharAt(promap.length() - 1);
                promap.append("]");
                p.writeProperty(list.get(i).getName()+"1",promap.toString());
            }

            List<Cities> list2 = new ArrayList<Cities>();
            CitiesExample citiesExample = new CitiesExample();
            list2 = citiesDao.selectByExample(citiesExample);
            for (int j = 0; j < list2.size(); j++) {
                promap = new StringBuffer();
                promap.append("[");
                promap.append("{'name':'"+list2.get(j).getName()+"',"+ "'pId':0,'id':" + list2.get(j).getCode() + ",type:'1'},");
                List<Areas> list3 = new ArrayList<Areas>();
                AreasExample areasExample = new AreasExample();
                areasExample.createCriteria().andCitycodeEqualTo(list2.get(j).getCode());
                list3 = areasDao.selectByExample(areasExample);
                for (int k = 0; k < list3.size(); k++) {
                    promap.append("{'name':'"+list3.get(k).getName()+"',"+ "'pId':"+list3.get(k).getCitycode()+",'id':" + list3.get(k).getCode() + ",type:'2'},");
                    List<CompanyInfo> list4 = new ArrayList<CompanyInfo>();
                    list4 = companyInfoDao.selectStoreageByTypeAndCounty(2,list3.get(k).getName());
                    for(int l = 0; l < list4.size(); l++){
                        promap.append("{'name':'"+list4.get(l).getName().replace("'","\'")+"',"+ "'pId':"+list3.get(k).getCode()+",'id':" + list4.get(l).getCompanyId() + ",type:'3'},");
                    }
                }
                promap.deleteCharAt(promap.length() - 1);
                promap.append("]");
                p.writeProperty(list2.get(j).getName()+"2",promap.toString());
            }

            List<Areas> list3 = new ArrayList<Areas>();
            AreasExample areasExample = new AreasExample();
            list3 = areasDao.selectByExample(areasExample);
            for (int k = 0; k < list3.size(); k++) {
                promap = new StringBuffer();
                promap.append("[");
                promap.append("{'name':'"+list3.get(k).getName()+"',"+ "'pId':0,'id':" + list3.get(k).getCode() + ",type:'2'},");
                List<CompanyInfo> list4 = new ArrayList<CompanyInfo>();
                list4 = companyInfoDao.selectStoreageByTypeAndCounty(3,list3.get(k).getName());
                for(int l = 0; l < list4.size(); l++){
                    promap.append("{'name':'"+list4.get(l).getName().replace("'","\'")+"',"+ "'pId':"+list3.get(k).getCode()+",'id':" + list4.get(l).getCompanyId() + ",type:'3'},");
                }
                promap.deleteCharAt(promap.length() - 1);
                promap.append("]");
                p.writeProperty(list3.get(k).getName()+"3",promap.toString());
            }
            long endTime = System.currentTimeMillis();

            float seconds = (endTime - startTime) / 1000F;

            System.out.println(Float.toString(seconds) + " seconds.");

            System.out.println("插入成功！");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("插入失败！");
        }
    }

    @Scheduled(cron="0 30 */2 * * ?")
    public void WebsiteTree(){
        try {
            //要执行的任务逻辑写在这里
            long startTime = System.currentTimeMillis();

            PropertiesUtil p = new PropertiesUtil("WebsiteTree.properties");
            System.out.println("WebsiteTree定时任务开始。。。。。。");
            StringBuffer promap = new StringBuffer();
            promap.append("[");
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
                        list4 = companyInfoDao.selectWebsiteByTypeAndCounty(0,list3.get(k).getName());
                        for(int l = 0; l < list4.size(); l++){
                            promap.append("{'name':'"+list4.get(l).getName().replace("'","\'")+"',"+ "'pId':"+list3.get(k).getCode()+",'id':" + list4.get(l).getCompanyId() + ",type:'3'},");
                        }
                    }
                }
            }
            promap.deleteCharAt(promap.length() - 1);
            promap.append("]");
            p.writeProperty("all0",promap.toString());

            list = new ArrayList<Provinces>();
            provexample = new ProvincesExample();
            list = provincesDao.selectByExample(provexample);
            for(int i = 0; i < list.size(); i++){
                promap = new StringBuffer();
                promap.append("[");
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
                        list4 = companyInfoDao.selectWebsiteByTypeAndCounty(1,list3.get(k).getName());
                        for(int l = 0; l < list4.size(); l++){
                            promap.append("{'name':'"+list4.get(l).getName().replace("'","\'")+"',"+ "'pId':"+list3.get(k).getCode()+",'id':" + list4.get(l).getCompanyId() + ",type:'3'},");
                        }
                    }
                }
                promap.deleteCharAt(promap.length() - 1);
                promap.append("]");
                p.writeProperty(list.get(i).getName()+"1",promap.toString());
            }

            List<Cities> list2 = new ArrayList<Cities>();
            CitiesExample citiesExample = new CitiesExample();
            list2 = citiesDao.selectByExample(citiesExample);
            for (int j = 0; j < list2.size(); j++) {
                promap = new StringBuffer();
                promap.append("[");
                promap.append("{'name':'"+list2.get(j).getName()+"',"+ "'pId':0,'id':" + list2.get(j).getCode() + ",type:'1'},");
                List<Areas> list3 = new ArrayList<Areas>();
                AreasExample areasExample = new AreasExample();
                areasExample.createCriteria().andCitycodeEqualTo(list2.get(j).getCode());
                list3 = areasDao.selectByExample(areasExample);
                for (int k = 0; k < list3.size(); k++) {
                    promap.append("{'name':'"+list3.get(k).getName()+"',"+ "'pId':"+list3.get(k).getCitycode()+",'id':" + list3.get(k).getCode() + ",type:'2'},");
                    List<CompanyInfo> list4 = new ArrayList<CompanyInfo>();
                    list4 = companyInfoDao.selectWebsiteByTypeAndCounty(2,list3.get(k).getName());
                    for(int l = 0; l < list4.size(); l++){
                        promap.append("{'name':'"+list4.get(l).getName().replace("'","\'")+"',"+ "'pId':"+list3.get(k).getCode()+",'id':" + list4.get(l).getCompanyId() + ",type:'3'},");
                    }
                }
                promap.deleteCharAt(promap.length() - 1);
                promap.append("]");
                p.writeProperty(list2.get(j).getName()+"2",promap.toString());
            }

            List<Areas> list3 = new ArrayList<Areas>();
            AreasExample areasExample = new AreasExample();
            list3 = areasDao.selectByExample(areasExample);
            for (int k = 0; k < list3.size(); k++) {
                promap = new StringBuffer();
                promap.append("[");
                promap.append("{'name':'"+list3.get(k).getName()+"',"+ "'pId':0,'id':" + list3.get(k).getCode() + ",type:'2'},");
                List<CompanyInfo> list4 = new ArrayList<CompanyInfo>();
                list4 = companyInfoDao.selectWebsiteByTypeAndCounty(3,list3.get(k).getName());
                for(int l = 0; l < list4.size(); l++){
                    promap.append("{'name':'"+list4.get(l).getName().replace("'","\'")+"',"+ "'pId':"+list3.get(k).getCode()+",'id':" + list4.get(l).getCompanyId() + ",type:'3'},");
                }
                promap.deleteCharAt(promap.length() - 1);
                promap.append("]");
                p.writeProperty(list3.get(k).getName()+"3",promap.toString());
            }
            long endTime = System.currentTimeMillis();

            float seconds = (endTime - startTime) / 1000F;

            System.out.println(Float.toString(seconds) + " seconds.");

            System.out.println("插入成功！");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("插入失败！");
        }
    }

    @Scheduled(cron="0 40 */2 * * ?")  	 // 间隔30分钟执行
    public void MachineTree(){
        try {
            //要执行的任务逻辑写在这里
            long startTime = System.currentTimeMillis();

            PropertiesUtil p = new PropertiesUtil("MachineTree.properties");
            System.out.println("MachineTree定时任务开始。。。。。。");
            StringBuffer promap = new StringBuffer();
            promap.append("[");
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
                        list4 = companyInfoDao.selectMachineByTypeAndCounty(0,list3.get(k).getName());
                        for(int l = 0; l < list4.size(); l++){
                            promap.append("{'name':'"+list4.get(l).getName().replace("'","\'")+"',"+ "'pId':"+list3.get(k).getCode()+",'id':" + list4.get(l).getCompanyId() + ",type:'3'},");
                        }
                    }
                }
            }
            promap.deleteCharAt(promap.length() - 1);
            promap.append("]");
            p.writeProperty("all0",promap.toString());

            list = new ArrayList<Provinces>();
            provexample = new ProvincesExample();
            list = provincesDao.selectByExample(provexample);
            for(int i = 0; i < list.size(); i++){
                promap = new StringBuffer();
                promap.append("[");
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
                        list4 = companyInfoDao.selectMachineByTypeAndCounty(1,list3.get(k).getName());
                        for(int l = 0; l < list4.size(); l++){
                            promap.append("{'name':'"+list4.get(l).getName().replace("'","\'")+"',"+ "'pId':"+list3.get(k).getCode()+",'id':" + list4.get(l).getCompanyId() + ",type:'3'},");
                        }
                    }
                }
                promap.deleteCharAt(promap.length() - 1);
                promap.append("]");
                p.writeProperty(list.get(i).getName()+"1",promap.toString());
            }

            List<Cities> list2 = new ArrayList<Cities>();
            CitiesExample citiesExample = new CitiesExample();
            list2 = citiesDao.selectByExample(citiesExample);
            for (int j = 0; j < list2.size(); j++) {
                promap = new StringBuffer();
                promap.append("[");
                promap.append("{'name':'"+list2.get(j).getName()+"',"+ "'pId':0,'id':" + list2.get(j).getCode() + ",type:'1'},");
                List<Areas> list3 = new ArrayList<Areas>();
                AreasExample areasExample = new AreasExample();
                areasExample.createCriteria().andCitycodeEqualTo(list2.get(j).getCode());
                list3 = areasDao.selectByExample(areasExample);
                for (int k = 0; k < list3.size(); k++) {
                    promap.append("{'name':'"+list3.get(k).getName()+"',"+ "'pId':"+list3.get(k).getCitycode()+",'id':" + list3.get(k).getCode() + ",type:'2'},");
                    List<CompanyInfo> list4 = new ArrayList<CompanyInfo>();
                    list4 = companyInfoDao.selectMachineByTypeAndCounty(2,list3.get(k).getName());
                    for(int l = 0; l < list4.size(); l++){
                        promap.append("{'name':'"+list4.get(l).getName().replace("'","\'")+"',"+ "'pId':"+list3.get(k).getCode()+",'id':" + list4.get(l).getCompanyId() + ",type:'3'},");
                    }
                }
                promap.deleteCharAt(promap.length() - 1);
                promap.append("]");
                p.writeProperty(list2.get(j).getName()+"2",promap.toString());
            }

            List<Areas> list3 = new ArrayList<Areas>();
            AreasExample areasExample = new AreasExample();
            list3 = areasDao.selectByExample(areasExample);
            for (int k = 0; k < list3.size(); k++) {
                promap = new StringBuffer();
                promap.append("[");
                promap.append("{'name':'"+list3.get(k).getName()+"',"+ "'pId':0,'id':" + list3.get(k).getCode() + ",type:'2'},");
                List<CompanyInfo> list4 = new ArrayList<CompanyInfo>();
                list4 = companyInfoDao.selectMachineByTypeAndCounty(3,list3.get(k).getName());
                for(int l = 0; l < list4.size(); l++){
                    promap.append("{'name':'"+list4.get(l).getName().replace("'","\'")+"',"+ "'pId':"+list3.get(k).getCode()+",'id':" + list4.get(l).getCompanyId() + ",type:'3'},");
                }
                promap.deleteCharAt(promap.length() - 1);
                promap.append("]");
                p.writeProperty(list3.get(k).getName()+"3",promap.toString());
            }
            long endTime = System.currentTimeMillis();

            float seconds = (endTime - startTime) / 1000F;

            System.out.println(Float.toString(seconds) + " seconds.");

            System.out.println("插入成功！");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("插入失败！");
        }
    }


}
