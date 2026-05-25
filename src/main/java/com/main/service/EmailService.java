package com.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.main.model.ContactMessage;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender mailSender;

    public void sendEmail(ContactMessage contactMessage) {

        SimpleMailMessage message = new SimpleMailMessage();

        message.setTo("sangharsh.techie@gmail.com");

        message.setSubject("New Portfolio Contact Message");

        message.setText(
                "Name: " + contactMessage.getName() +
                "\nEmail: " + contactMessage.getEmail() +
                "\n\nMessage:\n" + contactMessage.getMessage()
        );
        mailSender.send(message);
    }
}