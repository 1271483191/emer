package com.yunjing.emer.service;

import com.github.pagehelper.Page;
import com.yunjing.emer.entity.CompanyInfo;
import com.yunjing.emer.entity.Delivery;
import com.yunjing.emer.entity.User;

import java.util.List;

public interface CompanyInfoService {
    List<CompanyInfo> selectAll(User user);
    CompanyInfo selectById(Integer id);
    boolean update(CompanyInfo companyInfo);
    Page<CompanyInfo> selectByPage(User user);
}
