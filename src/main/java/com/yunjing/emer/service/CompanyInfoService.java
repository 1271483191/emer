package com.yunjing.emer.service;

import com.github.pagehelper.Page;
import com.yunjing.emer.entity.CompanyInfo;
import com.yunjing.emer.entity.Delivery;
import com.yunjing.emer.entity.User;

import java.util.Date;
import java.util.List;

public interface CompanyInfoService {
    List<CompanyInfo> selectAll(User user);
    CompanyInfo selectById(Integer id);
    boolean update(CompanyInfo companyInfo);
    Page<CompanyInfo> selectByPage(User user);
    List<CompanyInfo>  selectCompanyInfoByStoreage(User user, Date time1, Date time2);
    List<CompanyInfo>  selectCompanyInfoByDelivery(User user, Date time1, Date time2);
    List<CompanyInfo>  selectCompanyInfoByMachine(User user, Date time1, Date time2);
    List<CompanyInfo>  selectCompanyInfoByWebsite(User user, Date time1, Date time2);
    List<CompanyInfo>  selectCompanyInfoByAll(User user, Date time1, Date time2);
    List<CompanyInfo>  selectCompanyInfoByStoreageDate2(User user, Date time2);
    List<CompanyInfo>  selectCompanyInfoByDeliveryDate2(User user, Date time2);
    List<CompanyInfo>  selectCompanyInfoByMachineDate2(User user,  Date time2);
    List<CompanyInfo>  selectCompanyInfoByWebsiteDate2(User user,  Date time2);
    List<CompanyInfo>  selectCompanyInfoByStoreageDate1(User user, Date time1);
    List<CompanyInfo>  selectCompanyInfoByDeliveryDate1(User user, Date time1);
    List<CompanyInfo>  selectCompanyInfoByMachineDate1(User user,  Date time1);
    List<CompanyInfo>  selectCompanyInfoByWebsiteDate1(User user,  Date time1);

}
