package com.brandverse.service;

import com.brandverse.entity.User;
import com.brandverse.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Signup
    public User registerUser(User user) {

        Optional<User> existingUser = userRepository.findByEmail(user.getEmail());

        if(existingUser.isPresent()) {
            return null;
        }

        return userRepository.save(user);
    }

    // Login
    public User loginUser(String email, String password) {

        Optional<User> user = userRepository.findByEmail(email);

        if(user.isPresent()) {

            User u = user.get();

            if(u.getPassword().equals(password)) {
                return u;
            }

        }

        return null;
    }
    public User updateUser(Long id, User updatedUser) {

        User user = userRepository.findById(id).orElse(null);

        if (user == null) {
            return null;
        }

        user.setFullName(updatedUser.getFullName());
        user.setEmail(updatedUser.getEmail());

        return userRepository.save(user);
    }

}