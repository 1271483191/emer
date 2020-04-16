package com.yunjing.emer.dao;

import com.yunjing.emer.entity.Provinces;
import com.yunjing.emer.entity.ProvincesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProvincesDao {
    long countByExample(ProvincesExample example);

    int deleteByExample(ProvincesExample example);

    int deleteByPrimaryKey(Integer code);

    int insert(Provinces record);

    int insertSelective(Provinces record);

    List<Provinces> selectByExample(ProvincesExample example);

    Provinces selectByPrimaryKey(Integer code);

    int updateByExampleSelective(@Param("record") Provinces record, @Param("example") ProvincesExample example);

    int updateByExample(@Param("record") Provinces record, @Param("example") ProvincesExample example);

    int updateByPrimaryKeySelective(Provinces record);

    int updateByPrimaryKey(Provinces record);
}