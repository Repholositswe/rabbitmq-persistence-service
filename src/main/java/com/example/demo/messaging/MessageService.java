package com.example.demo.messaging;

import com.example.demo.model.Message;
import com.example.demo.repository.MessageRepository;
import org.springframework.stereotype.Service;

import java.util.Date;


@Service
public class MessageService {

    private final MessageRepository repository;

    public MessageService(MessageRepository repository) {
        this.repository = repository;
    }

    public void saveMessage(String content) {

        Message message = new Message();

        message.setContent(content);
        message.setDateReceived(new Date());

        repository.save(message);
    }
}