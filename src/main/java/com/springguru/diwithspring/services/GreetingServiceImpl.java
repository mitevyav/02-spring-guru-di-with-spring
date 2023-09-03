package com.springguru.diwithspring.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hi Folks from Base Service!";
    }
}
