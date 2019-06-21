package com.hulu.decorator;


public class SportsCar extends BaseDecorator {
    public SportsCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("I can sports");
    }
}
