package com.matildaerenius.service;

import com.matildaerenius.entity.Reels;
import com.matildaerenius.entity.User;

import java.util.List;

public interface ReelsService {

    public Reels createReel(Reels reel, User user);

    public List<Reels> findAllReels();

    public List<Reels> findUsersReel(Integer userId) throws Exception;
}
