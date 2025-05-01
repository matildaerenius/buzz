package com.matildaerenius.controller;

import com.matildaerenius.entity.User;
import com.matildaerenius.repository.UserRepository;
import com.matildaerenius.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserService userService;



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

    @PutMapping("/api/users/")
    public User updateUser(@RequestHeader("Authorization")String token, @RequestBody User user) throws Exception {
        User reqUser = userService.findUserByJwt(token);
        User updatedUser = userService.updateUser(user, reqUser.getId());
        return updatedUser;
    }

    @PutMapping("/api/users/follow/{userId2}")
    public User followUserHandler(@RequestHeader("Authorization")String token, @PathVariable int userId2) throws Exception {
        User reqUser = userService.findUserByJwt(token);
        User user = userService.followUser(reqUser.getId(), userId2);
        return user;
    }

    @GetMapping("/api/users/search")
    public List<User> searchUser(@RequestParam("query") String query) {
        List<User> users = userService.searchUser(query);
        return users;
    }

    @GetMapping("/api/users/profile")
    public User getUserFromToken(@RequestHeader("Authorization")String token) throws Exception {

       User user = userService.findUserByJwt(token);
       user.setPassword(null);

        return user;
    }

}
