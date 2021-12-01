package com.example.user.service.impl;

import com.example.user.entity.User;
import com.example.user.repository.UserRepository;
import com.example.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl  implements UserService {
    @Autowired
    private UserRepository repository;

    @Override
    public User addUser(User user) {
        repository.save(user);
        return user;
    }

    @Override
    public User getUserByUserName(String userName) {

        return repository.findByUserName(userName);
    }

    @Override
    public User findById(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public List<User> getAllUser() {
        return repository.findAll();
    }
}
