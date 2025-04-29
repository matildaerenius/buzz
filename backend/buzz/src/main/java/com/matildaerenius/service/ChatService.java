package com.matildaerenius.service;

import com.matildaerenius.models.Chat;
import com.matildaerenius.models.User;

import java.util.List;

public interface ChatService {

    public Chat createChat(User reqUser, User user2);

    public Chat findChatById(Integer chatId);

    public List<Chat> findUsersChat(Integer userId);
}
