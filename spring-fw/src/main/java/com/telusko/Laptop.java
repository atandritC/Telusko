package com.telusko;

public class Laptop implements Machine {

    // public Laptop() {
    //     System.out.println("Laptop Constructor");
    // }

    @Override
    public void compile() {
        System.out.println("Laptop is compiling");
    }

}
