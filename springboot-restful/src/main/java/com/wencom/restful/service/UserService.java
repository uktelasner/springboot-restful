package com.wencom.restful.service;

import com.wencom.restful.domain.Enum.SexType;
import com.wencom.restful.domain.User;
import com.wencom.restful.repository.UserRepository;
import com.wencom.restful.service.dto.UserDTO;
import com.wencom.restful.service.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserMapper userMapper;

    public String createUser(UserDTO userDTO) {
        User user = userMapper.toEntity(userDTO);
        userRepository.save(user);
        return user.toString();
    }

    public String findUserById(Long userId) {
        User user = userRepository.findById(userId).get();
        return user.toString();
    }
}
