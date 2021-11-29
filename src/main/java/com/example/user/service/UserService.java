package com.example.user.service;

import com.example.user.entity.User;

import java.util.List;

public interface UserService {
    User addUser(User user);
    User getUserByUserName(String userName);
    User findById(Long id);
    List<User> getAllUser();
}
