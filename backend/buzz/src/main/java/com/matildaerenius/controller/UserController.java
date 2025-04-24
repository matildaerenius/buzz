package com.matildaerenius.controller;

import com.matildaerenius.models.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @GetMapping("/user")
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
}
