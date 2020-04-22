package com.yunjing.emer.service;

import com.github.pagehelper.Page;
import com.yunjing.emer.dao.WebsiteDao;
import com.yunjing.emer.entity.Machine;
import com.yunjing.emer.entity.Storeage;
import com.yunjing.emer.entity.User;
import com.yunjing.emer.entity.Website;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface WebsiteService {
    List<Website> selectAll(User user);
    boolean deleteByCId(Integer cid);
    boolean update(Website website);
    Page<Website> selectByPage(User user);
    Website selectById(String websiteId);
    Page<Website> selectByPageDate(User user, Date time1, Date time2);
    List<Website> selectByDate(User user, Date time1, Date time2);
}
