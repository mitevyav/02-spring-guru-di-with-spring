package com.springguru.diwithspring;

import com.springguru.diwithspring.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiwithspringApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DiwithspringApplication.class, args);

        MyController controller = ctx.getBean(MyController.class);

        System.out.println("I'm in the Main Method");

        System.out.println(controller.sayHello());
    }

}
