package com.matildaerenius.controller;

import com.matildaerenius.models.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @GetMapping("/users")
    public List<User> getUser() {

        List<User> users = new ArrayList<>();

        User user1 = new User(1, "Matilda", "Erenius", "matilda@gmail.com","12345");
        User user2 = new User(2, "Test", "testtest", "test@gmail.com","12345");
        users.add(user1);
        users.add(user2);
        return users;
    }

    @GetMapping("/users/{userId}")
    public User getUserById(@PathVariable("userId") int id) {

        User user1 = new User(1, "Matilda", "Erenius", "matilda@gmail.com","12345");
        user1.setId(id);

        return user1;
    }

    @PostMapping("/users")
    public User createUser(@RequestBody User user) {
        User newUser = new User();
        newUser.setEmail(user.getEmail());
        newUser.setFirstName(user.getFirstName());
        newUser.setLastName(user.getLastName());
        newUser.setPassword(user.getPassword());
        newUser.setId(user.getId());

        return newUser;
    }
}
