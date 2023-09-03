package com.springguru.diwithspring.controllers;

import com.springguru.diwithspring.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    @Qualifier("propertyGreetingService")
    GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }

}
