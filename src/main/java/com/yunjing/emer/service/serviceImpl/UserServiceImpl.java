package com.yunjing.emer.service.serviceImpl;

import com.github.pagehelper.Page;
import com.yunjing.emer.dao.UserDao;
import com.yunjing.emer.entity.Storeage;
import com.yunjing.emer.entity.User;
import com.yunjing.emer.entity.UserExample;
import com.yunjing.emer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public List<User> selectAll() {
        List<User> userList = new ArrayList<>();
        userList = userDao.selectByExample(null);
        return userList;
    }

    @Override
    public boolean deleteById(Integer id) {

        int i = userDao.deleteByPrimaryKey(id);

        if(i > 0){
            return true;
        }
        return false;
    }

    @Override
    public boolean insertUser(User user) {

        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUsernameEqualTo(user.getUsername());
        List<User> userList = userDao.selectByExample(userExample);

        if(userList == null || userList.size() == 0){
            int i = userDao.insert(user);
            if(i > 0){
                return true;
            }
            return false;
        }

        return false;

    }

    @Override
    public boolean update(User user) {
        int i = userDao.updateByPrimaryKeySelective(user);
        if(i > 0){
            return true;
        }
        return false;
    }

    @Override
    public Page<User> selectByPage() {
        return (Page<User>)userDao.selectByExample(null);
    }

    @Override
    public Page<User> selectUserByPass(User user) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andPassEqualTo(0);
        criteria.andTypeBetween(user.getType() - 1, 3);

        if(user.getType() >= 1){
            criteria.andProvinceEqualTo(user.getProvince());
        }
        if(user.getType() >= 2){
            criteria.andCityEqualTo(user.getCity());
        }
        if(user.getType() == 3){
            criteria.andCountyEqualTo(user.getCounty());
        }

        List<User> userList = userDao.selectByExample(example);

        System.out.println("userList:" + userList);
        return (Page<User>)userList;
    }

    @Override
    public List<User> selectUserListByPass(User user) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andPassEqualTo(0);
        criteria.andTypeBetween(user.getType() - 1, 3);

        if(user.getType() >= 1){
            criteria.andProvinceEqualTo(user.getProvince());
        }
        if(user.getType() >= 2){
            criteria.andCityEqualTo(user.getCity());
        }
        if(user.getType() == 3){
            criteria.andCountyEqualTo(user.getCounty());
        }

        List<User> userList = userDao.selectByExample(example);

        System.out.println("userList:" + userList);
        return userList;
    }

    @Override
    public boolean passUser(Integer userId) {
        User user = new User();
        user.setUserId(userId);
        user.setPass(1);
        int i = userDao.updateByPrimaryKeySelective(user);
        if(i > 0){
            return true;
        }
        return false;
    }
}
