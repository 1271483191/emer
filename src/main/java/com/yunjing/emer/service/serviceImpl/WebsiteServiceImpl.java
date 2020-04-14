package com.yunjing.emer.service.serviceImpl;

import com.github.pagehelper.Page;
import com.yunjing.emer.dao.CompanyInfoDao;
import com.yunjing.emer.dao.WebsiteDao;
import com.yunjing.emer.entity.User;
import com.yunjing.emer.entity.Website;
import com.yunjing.emer.entity.WebsiteExample;
import com.yunjing.emer.service.WebsiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WebsiteServiceImpl implements WebsiteService {

    @Autowired
    WebsiteDao websiteDao;

    @Autowired
    CompanyInfoDao companyInfoDao;

    @Override
    public List<Website> selectAll() {
        List<Website> websiteList = new ArrayList<>();
        websiteList = websiteDao.selectByExample(null);
        return websiteList;
    }

    @Override
    public boolean deleteByCId(Integer cid) {
        WebsiteExample websiteExample = new WebsiteExample();
        WebsiteExample.Criteria criteria = websiteExample.createCriteria();
        criteria.andCompanyIdEqualTo(cid);

        int i = websiteDao.deleteByExample(websiteExample);
        int j = companyInfoDao.deleteByPrimaryKey(cid);

        if(i > 0 && j > 0){
            return true;
        }
        return false;
    }

    @Override
    public boolean update(Website website) {
        int i = websiteDao.updateByPrimaryKeySelective(website);
        if(i > 0){
            return true;
        }
        return false;
    }

    @Override
    public Page<Website> selectByPage() {
        return (Page<Website>)websiteDao.selectByExample(null);
    }
}
