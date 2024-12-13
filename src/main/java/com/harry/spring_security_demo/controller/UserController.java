package com.harry.spring_security_demo.controller;

import com.harry.spring_security_demo.model.User;
import com.harry.spring_security_demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("register")
    public User user(@RequestBody User user)
    {
        return userService.saveUser(user);
    }
}
