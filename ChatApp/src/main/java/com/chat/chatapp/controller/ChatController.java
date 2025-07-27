package com.chat.chatapp.controller;

import com.chat.chatapp.model.ChatMessage;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChatController {

    @MessageMapping("/chat/{room}")
    @SendTo("/topic/{room}")
    public ChatMessage sendMessageToRoom(@DestinationVariable String room, 
                                       ChatMessage message) {
        // Задаваме данните за съобщението
        message.setRoom(room);
        
        System.out.println("Message in room " + room + ": " + message.getContent());
        
        return message;
    }

    @GetMapping("/")
    public String chat() {
        System.out.println("Chat page requested");
        return "chat";
    }
}
