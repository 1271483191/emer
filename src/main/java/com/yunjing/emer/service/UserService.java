package com.yunjing.emer.service;

import com.github.pagehelper.Page;
import com.yunjing.emer.entity.Storeage;
import com.yunjing.emer.entity.User;

import java.util.List;

public interface UserService {
    List<User> selectAll();
    boolean deleteById(Integer id);
    boolean insertUser(User user);
    boolean update(User user);
    Page<User> selectByPage();

}
