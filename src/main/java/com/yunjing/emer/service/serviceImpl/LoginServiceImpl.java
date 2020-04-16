package com.yunjing.emer.service.serviceImpl;

import com.yunjing.emer.dao.UserDao;
import com.yunjing.emer.entity.User;
import com.yunjing.emer.entity.UserExample;
import com.yunjing.emer.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    UserDao userDao;


    @Override
    public int login(String username, String password) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUsernameEqualTo(username);
        criteria.andPasswordEqualTo(password);

        List<User> userList = userDao.selectByExample(userExample);
        if(userList != null && userList.size() > 0){
            if(userList.get(0).getPass() == 0){
                return 0;
            }
            return 1;
        }
        return -1;
    }

    @Override
    public User getUser(String username, String password) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUsernameEqualTo(username);
        criteria.andPasswordEqualTo(password);
        User user = userDao.selectByExample(userExample).get(0);
        return user;
    }
}
