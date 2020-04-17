package com.yunjing.emer.service;

import com.github.pagehelper.Page;
import com.yunjing.emer.entity.Machine;
import com.yunjing.emer.entity.Storeage;
import com.yunjing.emer.entity.User;

import java.util.List;

public interface StoreageService {
    List<Storeage> selectAll(User user);
    boolean deleteByCId(Integer cid);
    boolean update(Storeage storeage);
    Page<Storeage> selectByPage(User user);

}
