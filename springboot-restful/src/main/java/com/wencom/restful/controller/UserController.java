package com.wencom.restful.controller;

import com.wencom.restful.domain.User;
import com.wencom.restful.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public String getUser() {
        return userService.getUser();
    }

    @PostMapping("/user")
    public String createUser(User user) {
        userService.createUser(user);
        return "SUCCESS";
    }

}
