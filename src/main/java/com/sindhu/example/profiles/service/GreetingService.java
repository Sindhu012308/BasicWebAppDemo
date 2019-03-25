package com.sindhu.example.profiles.service;

import org.springframework.stereotype.Component;

@Component
public interface GreetingService {
    String sayHello(String name);
}
