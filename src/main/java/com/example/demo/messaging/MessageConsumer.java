package com.example.demo.messaging;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {

    private final MessageService messageService;

    public MessageConsumer(MessageService messageService) {
        this.messageService = messageService;
    }

    @RabbitListener(queues = "messages")
    public void receive(String message) {

        System.out.println("Received: " + message);

        messageService.saveMessage(message);
    }
}