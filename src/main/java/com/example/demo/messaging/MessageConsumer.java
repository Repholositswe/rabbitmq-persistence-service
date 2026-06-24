package com.example.demo.messaging;



import com.example.demo.model.Message;


import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;



@Component
public class MessageConsumer {








    @RabbitListener(queues = "messages")
    public void receive(String message) {


        System.out.println(
                "Received: " + message
        );












    }
}