package com.yunjing.emer.service.serviceImpl;

import com.github.pagehelper.Page;
import com.yunjing.emer.dao.CompanyInfoDao;
import com.yunjing.emer.dao.MachineDao;
import com.yunjing.emer.entity.Delivery;
import com.yunjing.emer.entity.Machine;
import com.yunjing.emer.entity.MachineExample;
import com.yunjing.emer.service.MachineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MachineServiceImpl implements MachineService {

    @Autowired
    MachineDao machineDao;

    @Autowired
    CompanyInfoDao companyInfoDao;

    @Override
    public List<Machine> selectAll() {
        List<Machine> machineList = new ArrayList<>();
        machineList = machineDao.selectByExample(null);
        return machineList;
    }

    @Override
    public boolean deleteByCId(Integer cid) {
        MachineExample machineExample = new MachineExample();
        MachineExample.Criteria criteria = machineExample.createCriteria();
        criteria.andCompanyIdEqualTo(cid);

        int i = machineDao.deleteByExample(machineExample);
        int j = companyInfoDao.deleteByPrimaryKey(cid);

        if(i > 0 && j > 0){
            return true;
        }
        return false;
    }

    @Override
    public boolean update(Machine machine) {
        int i = machineDao.updateByPrimaryKeySelective(machine);
        if(i > 0){
            return true;
        }
        return false;
    }

    @Override
    public Page<Machine> selectByPage() {
        return (Page<Machine>)machineDao.selectByExample(null);
    }
}
