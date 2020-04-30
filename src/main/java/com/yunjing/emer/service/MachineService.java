package com.yunjing.emer.service;

import com.github.pagehelper.Page;
import com.yunjing.emer.entity.*;

import java.util.Date;
import java.util.List;

public interface MachineService {
    List<Machine> selectAll(User user);
    boolean deleteByCId(Integer cid);
    boolean update(Machine machine);
    Page<Machine> selectByPage(User user);
    Page<Machine> selectByPageDate(User user, Date time1, Date time2);
    List<Machine> selectByDate(User user, Date time1, Date time2);
    public boolean insertMachine(Machine machine);
    boolean updateByCId(Machine machine);
    List<Machine> selectMachineByCounty(User user);
}
