package com.matildaerenius.controller;

import com.matildaerenius.models.User;
import com.matildaerenius.repository.UserRepository;
import com.matildaerenius.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserService userService;

    @PostMapping("/users")
    public User createUser(@RequestBody User user) {

        User savedUser = userService.registerUser(user);

        return savedUser;
    }

    @GetMapping("/users")
    public List<User> getUser() {

        List<User> users = userRepository.findAll();
        return users;
    }

    @GetMapping("/users/{userId}")
    public User getUserById(@PathVariable("userId") int id) throws Exception {

        User user = userService.findUserById(id);
        return user;

    }

    @PutMapping("/users/{userId}")
    public User updateUser(@RequestBody User user, @PathVariable int userId) throws Exception {

        User updatedUser = userService.updateUser(user, userId);
        return updatedUser;
    }

    @DeleteMapping("users/{userId}")
    public String deleteUser(@PathVariable("userId") int userId) throws Exception {

        Optional<User> user = userRepository.findById(userId);

        if(user.isEmpty()) {
            throw new Exception("user not exist with id "+ userId);
        }
        userRepository.delete(user.get());

        return "user deleted successfully with id " + userId;
    }
}
