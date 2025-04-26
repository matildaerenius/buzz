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

    @GetMapping("/api/users")
    public List<User> getUser() {

        List<User> users = userRepository.findAll();
        return users;
    }

    @GetMapping("/api/users/{userId}")
    public User getUserById(@PathVariable("userId") int id) throws Exception {

        User user = userService.findUserById(id);
        return user;

    }

    @PutMapping("/api/users/{userId}")
    public User updateUser(@RequestBody User user, @PathVariable int userId) throws Exception {

        User updatedUser = userService.updateUser(user, userId);
        return updatedUser;
    }

    @PutMapping("/api/users/follow/{userId1}/{userId2}")
    public User followUserHandler(@PathVariable int userId1, @PathVariable int userId2) throws Exception {

        User user = userService.followUser(userId1, userId2);
        return user;
    }

    @GetMapping("/api/users/search")
    public List<User> searchUser(@RequestParam("query") String query) {
        List<User> users = userService.searchUser(query);
        return users;
    }

}
