package com.yunjing.emer.dao;

import com.yunjing.emer.entity.Machine;
import com.yunjing.emer.entity.MachineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MachineDao {
    long countByExample(MachineExample example);

    int deleteByExample(MachineExample example);

    int deleteByPrimaryKey(Integer machineId);

    int insert(Machine record);

    int insertSelective(Machine record);

    List<Machine> selectByExample(MachineExample example);

    Machine selectByPrimaryKey(Integer machineId);

    int updateByExampleSelective(@Param("record") Machine record, @Param("example") MachineExample example);

    int updateByExample(@Param("record") Machine record, @Param("example") MachineExample example);

    int updateByPrimaryKeySelective(Machine record);

    int updateByPrimaryKey(Machine record);
}