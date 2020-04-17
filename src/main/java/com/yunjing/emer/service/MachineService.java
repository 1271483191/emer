package com.yunjing.emer.service;

import com.github.pagehelper.Page;
import com.yunjing.emer.entity.Delivery;
import com.yunjing.emer.entity.Machine;
import com.yunjing.emer.entity.User;

import java.util.List;

public interface MachineService {
    List<Machine> selectAll(User user);
    boolean deleteByCId(Integer cid);
    boolean update(Machine machine);
    Page<Machine> selectByPage(User user);
}
