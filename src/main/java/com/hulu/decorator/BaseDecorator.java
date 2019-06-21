package com.hulu.decorator;

public abstract class BaseDecorator implements Car {
    // add new functionality for this car
    private Car car;

    public BaseDecorator(Car car) {
        this.car = car;
    }

    @Override
    public void assemble() {
        car.assemble();
    }
}
