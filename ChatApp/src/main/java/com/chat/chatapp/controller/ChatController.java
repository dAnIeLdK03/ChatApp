package com.chat.chatapp.controller;

import com.chat.chatapp.model.ChatMessage;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChatController {

    @MessageMapping("/chat/{room}")
    @SendTo("/topic/{room}")
    public ChatMessage sendMessageToRoom(@DestinationVariable String room, ChatMessage message){
        return message;
    }

    @GetMapping("chat")
    public String chat() {
        return "chat";
    }

    @GetMapping("/chat/info")
    @CrossOrigin(origins = "http://localhost:63342")
    public ResponseEntity<String> chatInfo(){
        return ResponseEntity.ok("Информация за чата...");
    }
}
