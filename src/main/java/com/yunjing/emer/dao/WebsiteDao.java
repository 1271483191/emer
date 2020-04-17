package com.yunjing.emer.dao;

import com.yunjing.emer.entity.User;
import com.yunjing.emer.entity.Website;
import com.yunjing.emer.entity.WebsiteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WebsiteDao {
    long countByExample(WebsiteExample example);

    int deleteByExample(WebsiteExample example);

    int deleteByPrimaryKey(Integer websiteId);

    int insert(Website record);

    int insertSelective(Website record);

    List<Website> selectWebsiteByCompanyLevel(User user);

    List<Website> selectByExample(WebsiteExample example);

    Website selectByPrimaryKey(Integer websiteId);

    int updateByExampleSelective(@Param("record") Website record, @Param("example") WebsiteExample example);

    int updateByExample(@Param("record") Website record, @Param("example") WebsiteExample example);

    int updateByPrimaryKeySelective(Website record);

    int updateByPrimaryKey(Website record);
}