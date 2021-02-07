package com.wencom.restful.controller;

import com.wencom.restful.domain.User;
import com.wencom.restful.service.UserService;
import com.wencom.restful.service.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public String createUser(UserDTO userDTO) {
        String result = userService.createUser(userDTO);
        return result;
    }

    @GetMapping("/user/{id}")
    public String getUser(@PathVariable Long id) {
        String result = userService.findUserById(id);
        return result;
    }

    @DeleteMapping("/user")
    public String deleteUser(@RequestParam Long id) {
        String result = userService.deleteById(id);
        return result;
    }

    @PutMapping("/user")
    public void updateUserById(@RequestParam Long id, UserDTO userDTO) {
        userService.updateUserById(id, userDTO);
        System.out.println(id);
    }

}
