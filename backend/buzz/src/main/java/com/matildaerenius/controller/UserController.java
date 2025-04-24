package com.matildaerenius.controller;

import com.matildaerenius.models.User;
import com.matildaerenius.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @PostMapping("/users")
    public User createUser(@RequestBody User user) {
        User newUser = new User();
        newUser.setEmail(user.getEmail());
        newUser.setFirstName(user.getFirstName());
        newUser.setLastName(user.getLastName());
        newUser.setPassword(user.getPassword());
        newUser.setId(user.getId());

        User savedUser = userRepository.save(newUser);

        return savedUser;
    }

    @GetMapping("/users")
    public List<User> getUser() {

        List<User> users = userRepository.findAll();
        return users;
    }

    @GetMapping("/users/{userId}")
    public User getUserById(@PathVariable("userId") int id) throws Exception {

        Optional<User> user = userRepository.findById(id);

        if(user.isPresent()) {
            return user.get();
        }

        throw new Exception("user not exist with userid"+ id);
    }

    @PutMapping("/users")
    public User updateUser(@RequestBody User user) {
        User user1 = new User(1, "Matilda", "Erenius", "matilda@gmail.com","12345");

        if(user.getFirstName()!=null) {
            user1.setFirstName(user.getFirstName());
        }
        if(user.getLastName()!=null) {
            user1.setLastName(user.getLastName());
        }
        if(user.getEmail()!=null) {
            user1.setEmail(user.getEmail());
        }
        return user1;
    }

    @DeleteMapping("users/{userId}")
    public String deleteUser(@PathVariable("userId") int userId) {
        return "user deleted successfully with id " + userId;
    }
}
