package com.example.order-service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Order-serviceApplication {
    public static void main(String[] args) {
        SpringApplication.run(Order-serviceApplication.class, args);
    }
}

@RestController
class Order-serviceController {
    @GetMapping("/")
    public String home() {
        return "Welcome to the Order-service";
    }
}
