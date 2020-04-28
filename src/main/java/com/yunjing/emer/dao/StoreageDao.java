package com.yunjing.emer.dao;

import com.yunjing.emer.entity.Storeage;
import com.yunjing.emer.entity.StoreageExample;

import java.util.Date;
import java.util.List;

import com.yunjing.emer.entity.User;
import com.yunjing.emer.entity.Website;
import org.apache.ibatis.annotations.Param;

public interface StoreageDao {
    long countByExample(StoreageExample example);

    int deleteByExample(StoreageExample example);

    int deleteByPrimaryKey(Integer storeageId);

    int insert(Storeage record);

    int insertSelective(Storeage record);

    List<Storeage> selectStoreageByCompanyLevel(User user);

    List<Storeage> selectStoreageByPageDate(@Param("user") User user,@Param("time1") Date time1,@Param("time2") Date time2);

    List<Storeage> selectByExample(StoreageExample example);

    Storeage selectByPrimaryKey(Integer storeageId);

    int updateByExampleSelective(@Param("record") Storeage record, @Param("example") StoreageExample example);

    int updateByExample(@Param("record") Storeage record, @Param("example") StoreageExample example);

    int updateByPrimaryKeySelective(Storeage record);

    int updateByPrimaryKey(Storeage record);

    Storeage sumByProvinceList(List<String> provinces);

    Storeage sumByProvince(@Param("province")String province);

    long countByProvinceState(@Param("province")String province,@Param("state")Integer state);

    Storeage sumByUser(User user);

    Storeage sumByUserAndProvince(@Param("user")User user,@Param("province") String province);

    Storeage sumByUserAndCity(@Param("user")User user,@Param("city") String city);

    Storeage sumByUserAndCountry(@Param("user")User user,@Param("country") String country);
}