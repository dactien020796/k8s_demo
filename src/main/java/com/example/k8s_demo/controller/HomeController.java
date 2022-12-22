package com.example.k8s_demo.controller;

import com.example.k8s_demo.entity.Message;
import com.example.k8s_demo.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.NoResultException;

@RestController
@RequestMapping("/")
public class HomeController {

    private final MessageRepository messageRepository;

    public HomeController(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    @Value("${greeter}")
    private String greeter;

    @GetMapping
    public String hello() {
        return greeter;
    }

    @GetMapping("/message")
    public Message getMessage() {
        return messageRepository.findById(1).orElseThrow(NoResultException::new);
    }
}
