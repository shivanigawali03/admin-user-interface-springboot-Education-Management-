package com.example.adminuserinterface.controller;


import com.example.adminuserinterface.entity.User;
import com.example.adminuserinterface.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@CrossOrigin("*") // allows React frontend to connect
public class UserController {

    @Autowired
    private UserRepository userRepository;

    // GET - Fetch all users
    @GetMapping
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // POST - Add a new user
    @PostMapping
    public User createUser(@RequestBody com.example.institute_management.entity.User user) {
        return userRepository.save(user);
    }
}
