package com.matildaerenius.service;

import com.matildaerenius.entity.Chat;
import com.matildaerenius.entity.Message;
import com.matildaerenius.entity.User;
import com.matildaerenius.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class MessageServiceImpl implements MessageService {

    @Autowired
    private MessageRepository messageRepository;

    @Autowired
    private ChatService chatService;

    @Override
    public Message createMessage(User user, Integer chatId, Message req) throws Exception {

        Chat chat = chatService.findChatById(chatId);
        Message message = new Message();

        message.setChat(chat);
        message.setContent(req.getContent());
        message.setImage(req.getImage());
        message.setUser(user);
        message.setTimestamp(LocalDateTime.now());

        return messageRepository.save(message);
    }

    @Override
    public List<Message> findChatsMessages(Integer chatId) throws Exception {
        Chat chat = chatService.findChatById(chatId);

        return messageRepository.findByChatId(chatId);
    }
}
