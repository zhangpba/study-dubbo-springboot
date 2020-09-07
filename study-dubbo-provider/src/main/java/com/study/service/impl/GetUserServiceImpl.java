package com.study.service.impl;

import com.study.entity.User;
import com.study.service.GetUserService;
import org.apache.dubbo.config.annotation.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 注意引入的包Service
 * 是 org.apache.dubbo.config.annotation.Service
 * 而不是 org.springframework.stereotype.Service
 */
@Service
public class GetUserServiceImpl implements GetUserService {

    @Override
    public List<User> getUserList(String name) {

        // 此处没有连接数据库，所以就先生成几条数据返回
        System.out.print(name);
        List<User> list = new ArrayList<>();
        list.add(new User("xiaoming", 20));
        list.add(new User("xiaohong", 22));
        list.add(new User("xiaoqiang", 25));
        return list;
    }
}
