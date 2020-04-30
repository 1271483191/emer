package com.yunjing.emer.dao;

import com.yunjing.emer.entity.*;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface DeliveryDao {
    long countByExample(DeliveryExample example);

    int deleteByExample(DeliveryExample example);

    int deleteByPrimaryKey(Integer deliveryId);

    int insert(Delivery record);

    int insertSelective(Delivery record);

    List<Delivery> selectDeliveryByCompanyLevel(User user);

    List<Delivery> selectDeliveryByPageDate(@Param("user") User user,@Param("time1") Date time1,@Param("time2") Date time2);

    List<Delivery> selectByExample(DeliveryExample example);

    Delivery selectByPrimaryKey(Integer deliveryId);

    int updateByExampleSelective(@Param("record") Delivery record, @Param("example") DeliveryExample example);

    int updateByExample(@Param("record") Delivery record, @Param("example") DeliveryExample example);

    int updateByPrimaryKeySelective(Delivery record);

    int updateByPrimaryKey(Delivery record);

    Delivery sumByProvinceList(List<String> provinces);

    Delivery sumByProvince(@Param("province")String province);

    long countByProvinceState(@Param("province")String province,@Param("state")Integer state);

    Delivery sumByUser(User user);

    Delivery sumByUserAndProvince(@Param("user")User user,@Param("province") String province);

    Delivery sumByUserAndCity(@Param("user")User user,@Param("city") String city);

    Delivery sumByUserAndCountry(@Param("user")User user,@Param("country") String country);

    Delivery sumByExample(@Param("cid")Integer cid);

    List<Delivery> selectDeliveryByCounty(User user);
}