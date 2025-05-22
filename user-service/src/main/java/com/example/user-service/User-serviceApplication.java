package com.example.user-service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class User-serviceApplication {
    public static void main(String[] args) {
        SpringApplication.run(User-serviceApplication.class, args);
    }
}

@RestController
class User-serviceController {
    @GetMapping("/")
    public String home() {
        return "Welcome to the User-service";
    }
}
