package com.example.api_tuan1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserControllr {
    @Autowired
    private UserRepository userRepository;
    @GetMapping("/users")
    List<User> getListUser(){
        return userRepository.findAll();
    }
    @GetMapping("/users/{id}")
    User getUserByID(@PathVariable long id){
        return userRepository.findById(id).get();
    }
}
