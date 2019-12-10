package com.histore.controller;

import com.histore.db1.User;
import com.histore.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/query")
    public User testQuery() {
        return userService.selectUserByName("Daisy");
    }

    @GetMapping("testInsert")
    public String testInsert(){
        User user = new User();
        user.setAge(24);
        user.setMoney(52.1);
        user.setName("庆余年");
        userService.insert(user);
        return "success";
    }
}