package com.example.lab3.Part1;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {

    private final EmailService emailService;

    public void registerUser(String username, String email){

        emailService.sendEmail(email, "Welcome to our platform");
    }
}
