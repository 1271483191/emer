package com.yunjing.emer.dao;

import com.yunjing.emer.entity.Delivery;
import com.yunjing.emer.entity.DeliveryExample;

import java.util.Date;
import java.util.List;

import com.yunjing.emer.entity.User;
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

    Delivery sumByProvince(List<String> provinces);
}