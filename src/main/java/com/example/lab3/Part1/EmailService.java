package com.example.lab3.Part1;

import org.springframework.stereotype.Service;

@Service
public class EmailService {
    public void sendEmail(String to, String message){
        System.out.println(to + " " + message);
    }
}
