package com.example.user.controller;

import com.example.user.entity.User;
import com.example.user.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping({"/users"})
public class UserController {
    @Autowired
    private UserServiceImpl service;

    @PostMapping
    public User addUser(@RequestBody User user){
        try {
            User u= service.getUserByUserName(user.getUserName());
            if(u == null){
                return service.addUser(user);
            }
        }catch(Exception e){

        }
        return null;
    }

    @GetMapping("/{id}")
    public User findByid(@PathVariable Long id){
        return service.findById(id);
    }

    @GetMapping
    public List<User> findAll(){
        return service.getAllUser();
    }

    @GetMapping("/username")
    public User findByUserName(@RequestParam String userName){

        return service.getUserByUserName(userName);
    }

}
