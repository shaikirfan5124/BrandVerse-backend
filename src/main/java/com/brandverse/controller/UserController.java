package com.brandverse.controller;

import com.brandverse.dto.RegisterRequest;
import com.brandverse.entity.User;
import com.brandverse.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    private UserService userService;

    // Signup
    @PostMapping("/signup")
    public User signup(@RequestBody User user) {

        return userService.registerUser(user);

    }

    // Login
    @PostMapping("/login")
    public User login(@RequestBody RegisterRequest request) {

        return userService.loginUser(
                request.getEmail(),
                request.getPassword()
        );

    }
    @PutMapping("/users/{id}")
    public User updateUser(@PathVariable Long id,
                           @RequestBody User user) {

        return userService.updateUser(id, user);

    }

}