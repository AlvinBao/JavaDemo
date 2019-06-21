package com.hulu.decorator;

public class BasicCar implements Car {
    @Override
    public void assemble() {
        System.out.println("I can run");
    }
}
