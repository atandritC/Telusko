package com.telusko;

public class Alien {

    private Machine machine;

    public Alien() {
        System.out.println("Alien Constructor");
    }

    public void build() {
        System.out.println("Alien is building");
        machine.compile();
    }

    public void setMachine(Machine machine) {
        this.machine = machine;
    }

    // public Alien(Machine machine) {
    // this.machine = machine;
    // }

}
