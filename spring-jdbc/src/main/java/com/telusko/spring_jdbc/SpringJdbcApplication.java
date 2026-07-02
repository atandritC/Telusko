package com.telusko.spring_jdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.telusko.spring_jdbc.model.Alien;
import com.telusko.spring_jdbc.repository.AlienRepo;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJdbcApplication.class, args);

		Alien a1 = context.getBean(Alien.class);
		a1.setId(101);
		a1.setName("John Doe");
		a1.setTech("Java");

		AlienRepo repo = context.getBean(AlienRepo.class);
		repo.save(a1);
		System.out.println(repo.findAll());
	}

}
