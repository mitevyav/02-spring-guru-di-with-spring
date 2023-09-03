package com.springguru.diwithspring;

import com.springguru.diwithspring.controllers.MyController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class DiwithspringApplicationTests {

	@Autowired
	ApplicationContext applicationContext;

	@Autowired
	MyController myController;

	@Test
	void testAutowireOfController() {
		System.out.println(myController.sayHello());
	}

	@Test
	void testGetControllerFromContext() {
		MyController controller = applicationContext.getBean(MyController.class);

		System.out.println(controller.sayHello());
	}

	@Test
	void contextLoads() {
	}

}
