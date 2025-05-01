package com.matildaerenius.controller;

import com.matildaerenius.models.Chat;
import com.matildaerenius.models.User;
import com.matildaerenius.dto.request.ChatCreateRequest;
import com.matildaerenius.service.ChatService;
import com.matildaerenius.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ChatController {

    @Autowired
    private ChatService chatService;

    @Autowired
    private UserService userService;

    @PostMapping("/api/chats")
    public Chat createChat(@RequestHeader("Authorization") String jwt, @RequestBody ChatCreateRequest req) throws Exception {
        User reqUser = userService.findUserByJwt(jwt);
        User user2 = userService.findUserById(req.getUserId());
        Chat chat = chatService.createChat(reqUser, user2);

        return chat;
    }

    @GetMapping("/api/chats")
    public List<Chat> findUsersChat(@RequestHeader("Authorization") String jwt) throws Exception {

        User user = userService.findUserByJwt(jwt);

        List<Chat> chats = chatService.findUsersChat(user.getId());

        return chats;
    }
}
