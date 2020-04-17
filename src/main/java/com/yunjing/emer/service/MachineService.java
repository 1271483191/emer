package com.yunjing.emer.service;

import com.github.pagehelper.Page;
import com.yunjing.emer.entity.Delivery;
import com.yunjing.emer.entity.Machine;

import java.util.List;

public interface MachineService {
    List<Machine> selectAll(Integer type);
    boolean deleteByCId(Integer cid);
    boolean update(Machine machine);
    Page<Machine> selectByPage(Integer type);
}
