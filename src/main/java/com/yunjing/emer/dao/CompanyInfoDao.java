package com.yunjing.emer.dao;

import com.yunjing.emer.entity.CompanyInfo;
import com.yunjing.emer.entity.CompanyInfoExample;

import java.util.Date;
import java.util.List;

import com.yunjing.emer.entity.User;
import org.apache.ibatis.annotations.Param;

public interface CompanyInfoDao {
    long countByExample(CompanyInfoExample example);

    int deleteByExample(CompanyInfoExample example);

    int deleteByPrimaryKey(Integer companyId);

    int insert(CompanyInfo record);

    int insertSelective(CompanyInfo record);

    List<CompanyInfo> selectCompanyInfoByLevel(User user);

    List<CompanyInfo> selectByExample(CompanyInfoExample example);

    CompanyInfo selectByPrimaryKey(Integer companyId);

    int updateByExampleSelective(@Param("record") CompanyInfo record, @Param("example") CompanyInfoExample example);

    int updateByExample(@Param("record") CompanyInfo record, @Param("example") CompanyInfoExample example);

    int updateByPrimaryKeySelective(CompanyInfo record);

    int updateByPrimaryKey(CompanyInfo record);

    long countByDelivery(CompanyInfoExample example);

    long countByStoreage(CompanyInfoExample example);

    long countByWebsite(CompanyInfoExample example);

    long countByMachine(CompanyInfoExample example);

    List<CompanyInfo> selectCompanyInfoByStoreage(@Param("user") User user, @Param("time1") Date time1, @Param("time2") Date time2);

    List<CompanyInfo> selectCompanyInfoByDelivery(@Param("user") User user, @Param("time1") Date time1,@Param("time2") Date time2);

    List<CompanyInfo> selectCompanyInfoByWebsite(@Param("user") User user, @Param("time1") Date time1,@Param("time2") Date time2);

    List<CompanyInfo> selectCompanyInfoByMachine(@Param("user") User user,@Param("time1") Date time1,@Param("time2") Date time2);

    List<CompanyInfo> selectCompanyInfoByAll(@Param("user") User user,@Param("time1") Date time1,@Param("time2") Date time2);

    List<CompanyInfo> selectCompanyInfoByStoreageDate2(@Param("user") User user, @Param("time2") Date time2);

    List<CompanyInfo> selectCompanyInfoByDeliveryDate2(@Param("user") User user, @Param("time2") Date time2);

    List<CompanyInfo> selectCompanyInfoByWebsiteDate2(@Param("user") User user, @Param("time2") Date time2);

    List<CompanyInfo> selectCompanyInfoByMachineDate2(@Param("user") User user, @Param("time2") Date time2);

    List<CompanyInfo> selectCompanyInfoByStoreageDate1(@Param("user") User user, @Param("time1") Date time1);

    List<CompanyInfo> selectCompanyInfoByDeliveryDate1(@Param("user") User user, @Param("time1") Date time1);

    List<CompanyInfo> selectCompanyInfoByWebsiteDate1(@Param("user") User user, @Param("time1") Date time1);

    List<CompanyInfo> selectCompanyInfoByMachineDate1(@Param("user") User user, @Param("time1") Date time1);

    CompanyInfo sumByWebsite(CompanyInfoExample example);

    CompanyInfo sumByMachine(CompanyInfoExample example);

    CompanyInfo sumByDelivery(CompanyInfoExample example);

    CompanyInfo sumByStoreage(CompanyInfoExample example);
}