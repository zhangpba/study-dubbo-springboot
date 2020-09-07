package com.study.controller;

import com.study.entity.User;
import com.study.service.GetUserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GetUserController {

    @Reference
    GetUserService getUserService;

    @RequestMapping("getUserList")
    public List<User> getUserList(@RequestParam("name") String name){

        return getUserService.getUserList(name);
    }
}
