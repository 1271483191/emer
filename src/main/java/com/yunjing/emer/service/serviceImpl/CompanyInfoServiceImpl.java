package com.yunjing.emer.service.serviceImpl;

import com.github.pagehelper.Page;
import com.yunjing.emer.dao.CompanyInfoDao;
import com.yunjing.emer.entity.CompanyInfo;
import com.yunjing.emer.entity.CompanyInfoExample;
import com.yunjing.emer.entity.User;
import com.yunjing.emer.service.CompanyInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class CompanyInfoServiceImpl implements CompanyInfoService {

    @Autowired
    CompanyInfoDao companyInfoDao;

    @Override
    public List<CompanyInfo> selectAll(User user) {
        return companyInfoDao.selectCompanyInfoByLevel(user);
    }

    @Override
    public CompanyInfo selectById(Integer id) {
        CompanyInfo companyInfo = companyInfoDao.selectByPrimaryKey(id);
        return companyInfo;
    }

    @Override
    public boolean update(CompanyInfo companyInfo) {
        int i  = companyInfoDao.updateByPrimaryKeySelective(companyInfo);
        if(i > 0){
            return true;
        }
        return false;
    }

    @Override
    public Page<CompanyInfo> selectByPage(User user) {
        return (Page<CompanyInfo>)companyInfoDao.selectCompanyInfoByLevel(user);
    }

    @Override
    public List<CompanyInfo> selectCompanyInfoByStoreage(User user, Date time1, Date time2) {
        return (List<CompanyInfo>)companyInfoDao.selectCompanyInfoByStoreage(user,time1,time2);
    }
    @Override
    public List<CompanyInfo> selectCompanyInfoByDelivery(User user, Date time1, Date time2) {
        return (List<CompanyInfo>)companyInfoDao.selectCompanyInfoByDelivery(user,time1,time2);
    }
    @Override
    public List<CompanyInfo> selectCompanyInfoByMachine(User user, Date time1, Date time2) {
        return (List<CompanyInfo>)companyInfoDao.selectCompanyInfoByMachine(user,time1,time2);
    }
    @Override
    public List<CompanyInfo> selectCompanyInfoByWebsite(User user, Date time1, Date time2) {
        return (List<CompanyInfo>)companyInfoDao.selectCompanyInfoByWebsite(user,time1,time2);
    }
    @Override
    public List<CompanyInfo> selectCompanyInfoByAll(User user, Date time1, Date time2) {
        return (List<CompanyInfo>)companyInfoDao.selectCompanyInfoByAll(user,time1,time2);
    }

    @Override
    public List<CompanyInfo> selectCompanyInfoByStoreageDate2(User user, Date time2) {
        return (List<CompanyInfo>)companyInfoDao.selectCompanyInfoByStoreageDate2(user,time2);
    }
    @Override
    public List<CompanyInfo> selectCompanyInfoByDeliveryDate2(User user, Date time2) {
        return (List<CompanyInfo>)companyInfoDao.selectCompanyInfoByDeliveryDate2(user,time2);
    }
    @Override
    public List<CompanyInfo> selectCompanyInfoByMachineDate2(User user, Date time2) {
        return (List<CompanyInfo>)companyInfoDao.selectCompanyInfoByMachineDate2(user,time2);
    }
    @Override
    public List<CompanyInfo> selectCompanyInfoByWebsiteDate2(User user, Date time2) {
        return (List<CompanyInfo>)companyInfoDao.selectCompanyInfoByWebsiteDate2(user,time2);
    }

    @Override
    public List<CompanyInfo> selectCompanyInfoByStoreageDate1(User user, Date time1) {
        return (List<CompanyInfo>)companyInfoDao.selectCompanyInfoByStoreageDate1(user,time1);
    }
    @Override
    public List<CompanyInfo> selectCompanyInfoByDeliveryDate1(User user, Date time1) {
        return (List<CompanyInfo>)companyInfoDao.selectCompanyInfoByDeliveryDate1(user,time1);
    }
    @Override
    public List<CompanyInfo> selectCompanyInfoByMachineDate1(User user, Date time1) {
        return (List<CompanyInfo>)companyInfoDao.selectCompanyInfoByMachineDate1(user,time1);
    }
    @Override
    public List<CompanyInfo> selectCompanyInfoByWebsiteDate1(User user, Date time1) {
        return (List<CompanyInfo>)companyInfoDao.selectCompanyInfoByWebsiteDate1(user,time1);
    }

    @Override
    public boolean insertCompanyInfo(CompanyInfo companyInfo) {
        int i = companyInfoDao.insert(companyInfo);
        if(i != 0){
            return true;
        }

        return false;
    }

    @Override
    public List<CompanyInfo> selectBySocialId(String socialId) {

        CompanyInfoExample example = new CompanyInfoExample();
        CompanyInfoExample.Criteria criteria = example.createCriteria();
        criteria.andSocialIdEqualTo(socialId);
        System.out.println("socialId" + socialId);

        List<CompanyInfo> companyInfoList = companyInfoDao.selectByExample(example);

        return companyInfoList;
    }

    @Override
    public boolean updateCompanyInfo(CompanyInfo companyInfo) {


        int i = companyInfoDao.updateByPrimaryKeySelective(companyInfo);
        System.out.println(i);
        System.out.println(companyInfo);
        if(i != 0){
            return true;
        }
        return false;
    }

    @Override
    public List<CompanyInfo> selectAll2() {
        List<CompanyInfo> companyInfoList = new ArrayList<CompanyInfo>();
        companyInfoList = companyInfoDao.selectByExample(null);

        return companyInfoList;
    }

}
