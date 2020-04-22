package com.yunjing.emer.dao;

import com.yunjing.emer.entity.User;
import com.yunjing.emer.entity.Website;
import com.yunjing.emer.entity.WebsiteExample;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface WebsiteDao {
    long countByExample(WebsiteExample example);

    int deleteByExample(WebsiteExample example);

    int deleteByPrimaryKey(Integer websiteId);

    int insert(Website record);

    int insertSelective(Website record);

    List<Website> selectWebsiteByCompanyLevel(User user);

    List<Website> selectByExample(WebsiteExample example);

    List<Website> selectWebsiteByPageDate(@Param("user") User user,@Param("time1") Date time1,@Param("time2") Date time2);

    Website selectByPrimaryKey(Integer websiteId);

    int updateByExampleSelective(@Param("record") Website record, @Param("example") WebsiteExample example);

    int updateByExample(@Param("record") Website record, @Param("example") WebsiteExample example);

    int updateByPrimaryKeySelective(Website record);

    int updateByPrimaryKey(Website record);

    Website sumByExample(WebsiteExample example);
}