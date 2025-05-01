package com.matildaerenius.controller;

import com.matildaerenius.entity.Message;
import com.matildaerenius.entity.User;
import com.matildaerenius.service.MessageService;
import com.matildaerenius.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MessageController {

    @Autowired
    private MessageService messageService;

    @Autowired
    private UserService userService;

    @PostMapping("/api/messages/chat/{chatId}")
    public Message createMessage(@RequestBody Message req,
            @RequestHeader("Authorization")String jwt,
            @PathVariable Integer chatId) throws Exception {

        User user = userService.findUserByJwt(jwt);
        Message message = messageService.createMessage(user, chatId, req);

        return message;
    }

    @GetMapping("/api/messages/chat/{chatId}")
    public List<Message> findChatsMessage(
                                 @RequestHeader("Authorization")String jwt,
                                 @PathVariable Integer chatId) throws Exception {

        User user = userService.findUserByJwt(jwt);
        List<Message> messages = messageService.findChatsMessages(chatId);

        return messages;
    }
}
