package com.telusko.app1;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Machine {

    @Override
    public void compile() {
        System.out.println("Desktop is compiling");
    }

}
