package com.yunjing.emer.service.serviceImpl;

import com.github.pagehelper.Page;
import com.yunjing.emer.dao.CompanyInfoDao;
import com.yunjing.emer.dao.DeliveryDao;
import com.yunjing.emer.entity.*;
import com.yunjing.emer.service.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DeliveryServiceImpl  implements DeliveryService {

    @Autowired
    DeliveryDao deliveryDao;

    @Autowired
    CompanyInfoDao companyInfoDao;

    @Override
    public List<Delivery> selectAll(Integer type) {

        List<Delivery> deliveryList = new ArrayList<>();
        deliveryList = deliveryDao.selectByExample(null);

        List<Delivery> deliveryList1 = new ArrayList<>();
        switch (type){
            case 0:case 1:{
                deliveryList1 = deliveryList;
                break;
            }
            case 2:{
                for(Delivery d : deliveryList){
                    CompanyInfo companyInfo = companyInfoDao.selectByPrimaryKey(d.getCompanyId());
                    if(companyInfo != null){
                        if(companyInfo.getLevel() > 1){
                            deliveryList1.add(d);
                        }

                    }
                }
                break;
            }
            case 3:{
                for(Delivery d : deliveryList){
                    CompanyInfo companyInfo = companyInfoDao.selectByPrimaryKey(d.getCompanyId());
                    if(companyInfo != null){
                        if(companyInfo.getLevel() == 3){
                            deliveryList1.add(d);
                        }

                    }
                }
                break;
            }
        }
        List<Delivery> deliveryList2 = new ArrayList<>();
        deliveryList2 = deliveryList1;

        return deliveryList2;
    }

    @Override
    public boolean deleteByCId(Integer cid) {

        DeliveryExample deliveryExample = new DeliveryExample();
        DeliveryExample.Criteria criteria = deliveryExample.createCriteria();
        criteria.andCompanyIdEqualTo(cid);

        int i = deliveryDao.deleteByExample(deliveryExample);
        int j = companyInfoDao.deleteByPrimaryKey(cid);

        if(i > 0 && j > 0){
            return true;
        }
        return false;
    }

    @Override
    public boolean update(Delivery delivery) {
        int i  = deliveryDao.updateByPrimaryKeySelective(delivery);
        if(i > 0){
            return true;
        }
        return false;
    }

    @Override
    public Page<Delivery> selectByPage(Integer type) {
        List<Delivery> deliveryList = new ArrayList<>();
        deliveryList = deliveryDao.selectByExample(null);

        List<Delivery> deliveryList1 = new ArrayList<>();
        switch (type){
            case 0:case 1:{
                deliveryList1 = deliveryList;
                break;
            }
            case 2:{
                for(Delivery d : deliveryList){
                    CompanyInfo companyInfo = companyInfoDao.selectByPrimaryKey(d.getCompanyId());
                    if(companyInfo != null){
                        if(companyInfo.getLevel() > 1){
                            deliveryList1.add(d);
                        }

                    }
                }
                break;
            }
            case 3:{
                for(Delivery d : deliveryList){
                    CompanyInfo companyInfo = companyInfoDao.selectByPrimaryKey(d.getCompanyId());
                    if(companyInfo != null){
                        if(companyInfo.getLevel() == 3){
                            deliveryList1.add(d);
                        }

                    }
                }
                break;
            }
        }

        List<Delivery> deliveryList2 = new ArrayList<>();
        deliveryList2 = deliveryList1;

        return (Page<Delivery>)deliveryList2;
    }
}
