package com.yunjing.emer.dao;

import com.yunjing.emer.entity.Machine;
import com.yunjing.emer.entity.MachineExample;

import java.util.Date;
import java.util.List;

import com.yunjing.emer.entity.User;
import org.apache.ibatis.annotations.Param;

public interface MachineDao {
    long countByExample(MachineExample example);

    int deleteByExample(MachineExample example);

    int deleteByPrimaryKey(Integer machineId);

    int insert(Machine record);

    int insertSelective(Machine record);

    List<Machine> selectMachineByCompanyLevel(User user);

    List<Machine> selectMachineByPageDate(@Param("user") User user,@Param("time1") Date time1,@Param("time2") Date time2);

    List<Machine> selectByExample(MachineExample example);

    Machine selectByPrimaryKey(Integer machineId);

    int updateByExampleSelective(@Param("record") Machine record, @Param("example") MachineExample example);

    int updateByExample(@Param("record") Machine record, @Param("example") MachineExample example);

    int updateByPrimaryKeySelective(Machine record);

    int updateByPrimaryKey(Machine record);

    Machine sumByExample(MachineExample example);

    Machine sumByProvince(@Param("province")String province);

    long countByProvinceState(@Param("province")String province,@Param("state")Integer state);
}