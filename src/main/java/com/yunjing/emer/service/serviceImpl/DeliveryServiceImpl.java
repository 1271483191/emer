package com.yunjing.emer.service.serviceImpl;

import com.github.pagehelper.Page;
import com.yunjing.emer.dao.CompanyInfoDao;
import com.yunjing.emer.dao.DeliveryDao;
import com.yunjing.emer.entity.CompanyInfo;
import com.yunjing.emer.entity.Delivery;
import com.yunjing.emer.entity.DeliveryExample;
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
    public List<Delivery> selectAll() {
        List<Delivery> deliveryList = new ArrayList<>();
        deliveryList = deliveryDao.selectByExample(null);
        return deliveryList;
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
    public Page<Delivery> selectByPage() {
        return (Page<Delivery>)deliveryDao.selectByExample(null);
    }
}
