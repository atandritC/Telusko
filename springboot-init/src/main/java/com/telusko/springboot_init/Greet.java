package com.telusko.springboot_init;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Greet {

    @RequestMapping("/")
    public String greet() {
        return "Hello, welcome to Spring Boot!";
    }

}
