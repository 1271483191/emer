package com.yunjing.emer.service.serviceImpl;

import com.github.pagehelper.Page;
import com.yunjing.emer.dao.CompanyInfoDao;
import com.yunjing.emer.entity.CompanyInfo;
import com.yunjing.emer.service.CompanyInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CompanyInfoServiceImpl implements CompanyInfoService {

    @Autowired
    CompanyInfoDao companyInfoDao;

    @Override
    public List<CompanyInfo> selectAll() {
        List<CompanyInfo> companyInfoList = new ArrayList<>();
        companyInfoList = companyInfoDao.selectByExample(null);
        return companyInfoList;
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
    public Page<CompanyInfo> selectByPage() {
        return (Page<CompanyInfo>)companyInfoDao.selectByExample(null);
    }
}