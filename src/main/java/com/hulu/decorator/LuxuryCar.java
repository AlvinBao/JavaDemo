package com.hulu.decorator;

public class LuxuryCar extends BaseDecorator{

    public LuxuryCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("I am luxury");
    }
}
