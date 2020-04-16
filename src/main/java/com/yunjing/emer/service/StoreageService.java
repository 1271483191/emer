package com.yunjing.emer.service;

import com.github.pagehelper.Page;
import com.yunjing.emer.entity.Machine;
import com.yunjing.emer.entity.Storeage;

import java.util.List;

public interface StoreageService {
    List<Storeage> selectAll(Integer type);
    boolean deleteByCId(Integer cid);
    boolean update(Storeage storeage);
    Page<Storeage> selectByPage(Integer type);

}
