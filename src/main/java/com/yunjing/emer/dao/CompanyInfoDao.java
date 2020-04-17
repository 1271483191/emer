package com.yunjing.emer.dao;

import com.yunjing.emer.entity.CompanyInfo;
import com.yunjing.emer.entity.CompanyInfoExample;
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

    List<CompanyInfo> selectCompanyInfoByDelivey(User user);

}