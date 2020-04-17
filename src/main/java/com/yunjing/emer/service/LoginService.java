package com.yunjing.emer.service;

import com.yunjing.emer.entity.User;

public interface LoginService {
    int login(String username, String password);
    User getUser(String username, String password);
}
