package com.matildaerenius.service;

import com.matildaerenius.entity.User;

import java.util.List;

public interface UserService {

    public User registerUser(User user);

    public User findUserById(Integer userId) throws Exception;

    public User findUserByEmail(String email);

    public User followUser(int userId1, int userId2) throws Exception;

    public User updateUser(User user, int userId) throws Exception;

    public List<User> searchUser(String query);

    public User findUserByJwt(String jwt) throws Exception;


}
