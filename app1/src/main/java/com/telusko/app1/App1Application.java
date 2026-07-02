package com.telusko.app1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class App1Application {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(App1Application.class, args);

		// Manual object creation
		// Alien a = new Alien();

		Alien a = applicationContext.getBean(Alien.class);
		a.build();
	}

}
