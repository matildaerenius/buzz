package com.matildaerenius.service;

import com.matildaerenius.entity.Chat;
import com.matildaerenius.entity.Message;
import com.matildaerenius.entity.User;

import java.util.List;

public interface MessageService {

    public Message createMessage(User user, Integer chatId, Message req) throws Exception;

    public List<Message> findChatsMessages(Integer chatId) throws Exception;

}
