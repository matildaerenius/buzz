package com.matildaerenius.service;

import com.matildaerenius.models.User;
import com.matildaerenius.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImplementation implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User registerUser(User user) {
        return null;
    }

    @Override
    public User findUserById(int userId) {
        return null;
    }

    @Override
    public User findUserByEmail(String email) {
        return null;
    }

    @Override
    public User followUser(int userId1, int userId2) {
        return null;
    }

    @Override
    public User updateUser(User user) {
        return null;
    }

    @Override
    public List<User> searchUser(String query) {
        return List.of();
    }
}
