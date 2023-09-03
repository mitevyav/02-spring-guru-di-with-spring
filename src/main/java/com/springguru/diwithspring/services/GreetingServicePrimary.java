package com.springguru.diwithspring.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class GreetingServicePrimary implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hi Folks from Primary Service!";
    }
}
