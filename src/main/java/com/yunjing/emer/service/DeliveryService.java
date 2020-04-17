package com.yunjing.emer.service;

import com.github.pagehelper.Page;
import com.yunjing.emer.entity.CompanyInfo;
import com.yunjing.emer.entity.Delivery;
import com.yunjing.emer.entity.User;

import java.util.List;

public interface DeliveryService {
    List<Delivery> selectAll(User user);
    boolean deleteByCId(Integer cid);
    boolean update(Delivery delivery);
    Page<Delivery> selectByPage(User user);
}

