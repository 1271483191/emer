package com.yunjing.emer.dao;

import com.yunjing.emer.entity.Areas;
import com.yunjing.emer.entity.AreasExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AreasDao {
    long countByExample(AreasExample example);

    int deleteByExample(AreasExample example);

    int deleteByPrimaryKey(Integer code);

    int insert(Areas record);

    int insertSelective(Areas record);

    List<Areas> selectByExample(AreasExample example);

    Areas selectByPrimaryKey(Integer code);

    int updateByExampleSelective(@Param("record") Areas record, @Param("example") AreasExample example);

    int updateByExample(@Param("record") Areas record, @Param("example") AreasExample example);

    int updateByPrimaryKeySelective(Areas record);

    int updateByPrimaryKey(Areas record);
}