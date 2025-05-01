package com.matildaerenius.service;

import com.matildaerenius.entity.Chat;
import com.matildaerenius.entity.User;

import java.util.List;

public interface ChatService {

    public Chat createChat(User reqUser, User user2);

    public Chat findChatById(Integer chatId) throws Exception;

    public List<Chat> findUsersChat(Integer userId);
}
