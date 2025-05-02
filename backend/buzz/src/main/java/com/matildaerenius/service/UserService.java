package com.matildaerenius.service;

import com.matildaerenius.entity.User;
import com.matildaerenius.exception.UserException;

import java.util.List;

public interface UserService {

    public User registerUser(User user);

    public User findUserById(Integer userId) throws UserException;

    public User findUserByEmail(String email);

    public User followUser(int userId1, int userId2) throws UserException;

    public User updateUser(User user, int userId) throws UserException;

    public List<User> searchUser(String query);

    public User findUserByJwt(String jwt);


}
