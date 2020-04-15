package com.yunjing.emer.service;

import com.github.pagehelper.Page;
import com.yunjing.emer.dao.WebsiteDao;
import com.yunjing.emer.entity.Machine;
import com.yunjing.emer.entity.Storeage;
import com.yunjing.emer.entity.User;
import com.yunjing.emer.entity.Website;

import java.util.List;

public interface WebsiteService {
    List<Website> selectAll();
    boolean deleteByCId(Integer cid);
    boolean update(Website website);
    Page<Website> selectByPage();
    Website selectById(String websiteId);
}
