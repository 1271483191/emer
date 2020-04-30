package com.yunjing.emer.service.serviceImpl;

import com.github.pagehelper.Page;
import com.yunjing.emer.dao.CompanyInfoDao;
import com.yunjing.emer.dao.WebsiteDao;
import com.yunjing.emer.entity.*;
import com.yunjing.emer.service.WebsiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class WebsiteServiceImpl implements WebsiteService {

    @Autowired
    WebsiteDao websiteDao;

    @Autowired
    CompanyInfoDao companyInfoDao;

    @Override
    public List<Website> selectAll(User user) {
        return websiteDao.selectWebsiteByCompanyLevel(user);
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
    public Page<Website> selectByPage(User user) {
        return (Page<Website>)websiteDao.selectWebsiteByCompanyLevel(user);
    }

    @Override
    public Website selectById(String websiteId) {
        return websiteDao.selectByPrimaryKey(Integer.parseInt(websiteId.trim()));
    }

    @Override
    public Page<Website> selectByPageDate(User user, Date time1, Date time2) {
        return (Page<Website>)websiteDao.selectWebsiteByPageDate(user, time1, time2);
    }

    @Override
    public List<Website> selectByDate(User user, Date time1, Date time2) {
        return websiteDao.selectWebsiteByPageDate(user, time1, time2);
    }

    @Override
    public boolean insertWebSite(Website website) {
        int i = websiteDao.insert(website);
        if(i != 0){
            return true;
        }
        return false;
    }

    @Override
    public boolean updateByCId(Website website) {

        WebsiteExample websiteExample = new WebsiteExample();
        WebsiteExample.Criteria criteria = websiteExample.createCriteria();
        criteria.andCompanyIdEqualTo(website.getCompanyId());


        if(websiteDao.selectByExample(websiteExample).size() <= 0){
            int i = websiteDao.insert(website);
            if(i > 0){
                return true;
            }

            return false;
        }


        Integer WId = websiteDao.selectByExample(websiteExample).get(0).getWebsiteId();
        website.setWebsiteId(WId);
        int i = websiteDao.updateByExampleSelective(website,websiteExample);
        if(i > 0){
            return true;
        }
        return false;
    }

    @Override
    public List<Website> selectWebsiteByCounty(User user) {
        return websiteDao.selectWebsiteByCounty(user);
    }
}
