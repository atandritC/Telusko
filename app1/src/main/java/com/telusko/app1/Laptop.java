package com.telusko.app1;

import org.springframework.stereotype.Component;

@Component
// @Primary
public class Laptop implements Machine {

    @Override
    public void compile() {
        System.out.println("Laptop is compiling");
    }

}
