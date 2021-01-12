package com.wencom.restful.service;

import com.wencom.restful.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired


    public String getUser() {
        return "wencom";
    }

    public String createUser(User user) {

        return null;
    }
}
