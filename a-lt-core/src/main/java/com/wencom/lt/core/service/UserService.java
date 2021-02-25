package com.wencom.lt.core.service;

import com.wencom.lt.core.domain.User;
import com.wencom.lt.core.repository.UserRepository;
import com.wencom.lt.core.service.dto.UserDTO;
import com.wencom.lt.core.service.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public String deleteById(Long userId) {
        try{
            userRepository.deleteById(userId);
            return "success";
        }catch (Exception e) {
            return "error";
        }
    }

    public String updateUserById(Long userId, UserDTO userDTO) {
        String name = userDTO.getName();
        Integer age = userDTO.getAge();
        Integer sex = userDTO.getSex().getId();

        try{
            userRepository.updateUserById(age, name, sex, userId);
            return "success";
        } catch (Exception e) {
            return e.getMessage();
        }
    }
}
