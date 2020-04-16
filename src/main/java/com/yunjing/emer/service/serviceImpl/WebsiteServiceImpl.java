package com.yunjing.emer.service.serviceImpl;

import com.github.pagehelper.Page;
import com.yunjing.emer.dao.CompanyInfoDao;
import com.yunjing.emer.dao.WebsiteDao;
import com.yunjing.emer.entity.*;
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
    public List<Website> selectAll(Integer type) {
        List<Website> websiteList = new ArrayList<>();
        websiteList = websiteDao.selectByExample(null);

        List<Website> websiteList1 = new ArrayList<>();
        switch (type){
            case 0:case 1:{
                websiteList1 = websiteList;
                break;
            }
            case 2:{
                for(Website d : websiteList){
                    CompanyInfo companyInfo = companyInfoDao.selectByPrimaryKey(d.getCompanyId());
                    if(companyInfo != null){
                        if(companyInfo.getLevel() > 1){
                            websiteList1.add(d);
                        }

                    }
                }
                break;
            }
            case 3:{
                for(Website d : websiteList){
                    CompanyInfo companyInfo = companyInfoDao.selectByPrimaryKey(d.getCompanyId());
                    if(companyInfo != null){
                        if(companyInfo.getLevel() == 3){
                            websiteList1.add(d);
                        }
                    }
                }
                break;
            }
        }
        return websiteList1;
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
    public Page<Website> selectByPage(Integer type) {
        return (Page<Website>)websiteDao.selectWebsiteByCompanyLevel(type);
    }

    @Override
    public Website selectById(String websiteId) {
        return websiteDao.selectByPrimaryKey(Integer.parseInt(websiteId.trim()));
    }
}
