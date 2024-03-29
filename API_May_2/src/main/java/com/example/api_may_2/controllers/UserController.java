package com.example.api_may_2.controllers;

import com.example.api_may_2.models.User;
import com.example.api_may_2.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @GetMapping("/users")
    List<User> getAllUser(){
        return userRepository.findAll();
    }
}
