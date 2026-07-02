package com.telusko.simple_web_app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet() {
        return "Hello, welcome to the Simple Web App!";
    }

    @RequestMapping("/about")
    public String about() {
        return "This is the about page of the Simple Web App.";
    }
    

}
