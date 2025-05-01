package com.matildaerenius.controller;

import com.matildaerenius.entity.Reels;
import com.matildaerenius.entity.User;
import com.matildaerenius.service.ReelsService;
import com.matildaerenius.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ReelsController {

    @Autowired
    private ReelsService reelsService;

    @Autowired
    private UserService userService;

    @PostMapping("/api/reels")
    public Reels createReels(@RequestBody Reels reel, @RequestHeader("Authorization")String jwt) throws Exception {

        User reqUser = userService.findUserByJwt(jwt);
        Reels createdReels = reelsService.createReel(reel,reqUser);

        return createdReels;
    }

    @GetMapping("/api/reels")
    public List<Reels> findAllReels() throws Exception {
        List<Reels> reels = reelsService.findAllReels();

        return reels;
    }

    @GetMapping("/api/reels/user/{userId}")
    public List<Reels> findUsersReels(@PathVariable Integer userId) throws Exception {
        List<Reels> reels = reelsService.findUsersReel(userId);

        return reels;
    }


}
