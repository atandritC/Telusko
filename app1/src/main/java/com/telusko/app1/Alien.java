package com.telusko.app1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    @Autowired // Field injection
    @Qualifier("desktop")
    private Machine machine;

    // public Alien(Machine machine) { // Constructor injection
    // this.machine = machine;
    // }

    // @Autowired
    // public void setMachine(Machine machine) { // Setter injection
    // this.machine = machine;
    // }

    public void build() {
        System.out.println("Alien is building");
        machine.compile();
    }

}
