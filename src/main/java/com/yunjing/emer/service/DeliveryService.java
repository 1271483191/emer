package com.yunjing.emer.service;

import com.github.pagehelper.Page;
import com.yunjing.emer.entity.CompanyInfo;
import com.yunjing.emer.entity.Delivery;
import com.yunjing.emer.entity.Machine;
import com.yunjing.emer.entity.User;

import java.util.Date;
import java.util.List;

public interface DeliveryService {
    List<Delivery> selectAll(User user);
    boolean deleteByCId(Integer cid);
    boolean update(Delivery delivery);
    Page<Delivery> selectByPage(User user);
    Page<Delivery> selectByPageDate(User user, Date time1, Date time2);
    List<Delivery> selectByDate(User user, Date time1, Date time2);
    public boolean insertDelivery(Delivery delivery);
    boolean updateByCId(Delivery delivery);
}

