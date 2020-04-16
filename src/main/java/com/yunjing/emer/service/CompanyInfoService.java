package com.yunjing.emer.service;

import com.github.pagehelper.Page;
import com.yunjing.emer.entity.CompanyInfo;
import com.yunjing.emer.entity.Delivery;

import java.util.List;

public interface CompanyInfoService {
    List<CompanyInfo> selectAll(Integer type);
    CompanyInfo selectById(Integer id);
    boolean update(CompanyInfo companyInfo);
    Page<CompanyInfo> selectByPage(Integer type);
}
