package com.example.demo.messaging;

import com.example.demo.model.Message;
import com.example.demo.repository.MessageRepository;
import org.springframework.stereotype.Service;



@Service
public class MessageService {
    private final MessageRepository repository;


    public MessageService(MessageRepository repository) {
        this.repository = repository;
    }


    public void save(String text) {
        repository.save(new Message(text));
    }
}
