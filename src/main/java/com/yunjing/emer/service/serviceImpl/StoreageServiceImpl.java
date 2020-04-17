package com.yunjing.emer.service.serviceImpl;

import com.github.pagehelper.Page;
import com.yunjing.emer.dao.CompanyInfoDao;
import com.yunjing.emer.dao.StoreageDao;
import com.yunjing.emer.entity.*;
import com.yunjing.emer.service.StoreageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class StoreageServiceImpl implements StoreageService {

    @Autowired
    StoreageDao storeageDao;

    @Autowired
    CompanyInfoDao companyInfoDao;

    @Override
    public List<Storeage> selectAll(User user) {
        return storeageDao.selectStoreageByCompanyLevel(user);
    }

    @Override
    public boolean deleteByCId(Integer cid) {
        StoreageExample storeageExample = new StoreageExample();
        StoreageExample.Criteria criteria = storeageExample.createCriteria();
        criteria.andCompanyIdEqualTo(cid);

        int i = storeageDao.deleteByExample(storeageExample);
        int j = companyInfoDao.deleteByPrimaryKey(cid);

        if(i > 0 && j > 0){
            return true;
        }
        return false;
    }

    @Override
    public boolean update(Storeage storeage) {
        System.out.println("storeage" + storeage);
        int i = storeageDao.updateByPrimaryKeySelective(storeage);
        if(i > 0){
            return true;
        }
        return false;
    }

    @Override
    public Page<Storeage> selectByPage(User user) {
        return (Page<Storeage>)storeageDao.selectStoreageByCompanyLevel(user);
    }

    @Override
    public Page<Storeage> selectByPageDate(User user, Date time1, Date time2) {
        return (Page<Storeage>)storeageDao.selectStoreageByPageDate(user, time1, time2);
    }
}
