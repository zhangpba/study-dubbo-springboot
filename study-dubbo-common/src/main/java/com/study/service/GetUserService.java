package com.study.service;

import com.study.entity.User;

import java.util.List;

public interface GetUserService {

    List<User> getUserList(String name);
}
