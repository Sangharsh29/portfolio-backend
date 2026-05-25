package com.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.main.model.ContactMessage;
import com.main.service.EmailService;

@RestController
@RequestMapping("/api/contact")
@CrossOrigin(origins = "http://localhost:5173")
public class ContactController {

    @Autowired
    private EmailService emailService;

    @PostMapping
    public String sendMessage(@RequestBody ContactMessage contactMessage) {

        emailService.sendEmail(contactMessage);

        return "Message sent successfully!";
    }
}