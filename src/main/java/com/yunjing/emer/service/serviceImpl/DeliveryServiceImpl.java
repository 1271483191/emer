package com.yunjing.emer.service.serviceImpl;

import com.github.pagehelper.Page;
import com.yunjing.emer.dao.CompanyInfoDao;
import com.yunjing.emer.dao.DeliveryDao;
import com.yunjing.emer.entity.*;
import com.yunjing.emer.service.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class DeliveryServiceImpl  implements DeliveryService {

    @Autowired
    DeliveryDao deliveryDao;

    @Autowired
    CompanyInfoDao companyInfoDao;

    @Override
    public List<Delivery> selectAll(User user) {

        return deliveryDao.selectDeliveryByCompanyLevel(user);
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
    public Page<Delivery> selectByPage(User user) {
        return (Page<Delivery>)deliveryDao.selectDeliveryByCompanyLevel(user);
    }

    @Override
    public Page<Delivery> selectByPageDate(User user, Date time1, Date time2) {
        return (Page<Delivery>)deliveryDao.selectDeliveryByPageDate(user, time1, time2);

    }

    @Override
    public List<Delivery> selectByDate(User user, Date time1, Date time2) {
        return deliveryDao.selectDeliveryByPageDate(user, time1, time2);
    }

    @Override
    public boolean insertDelivery(Delivery delivery) {
        int i = deliveryDao.insert(delivery);
        if(i != 0){
            return true;
        }

        return false;
    }


    @Override
    public boolean updateByCId(Delivery delivery) {
        DeliveryExample deliveryExample = new DeliveryExample();
        DeliveryExample.Criteria criteria = deliveryExample.createCriteria();
        criteria.andCompanyIdEqualTo(delivery.getCompanyId());
        if(deliveryDao.selectByExample(deliveryExample).size() <= 0){
            int i = deliveryDao.insert(delivery);
            if(i > 0){
                return true;
            }

            return false;
        }
        Integer DId = deliveryDao.selectByExample(deliveryExample).get(0).getDeliveryId();
        delivery.setDeliveryId(DId);

        int i = deliveryDao.updateByExampleSelective(delivery,deliveryExample);
        if(i > 0){
            return true;
        }
        return false;
    }

    @Override
    public List<Delivery> selectDeliveryByCounty(User user) {
        return deliveryDao.selectDeliveryByCounty(user);
    }
}
