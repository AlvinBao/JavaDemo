package com.hulu.decorator;

public class DecoratorMain {
    public static void main(String[] args) {
        Car car = new BasicCar();
        Car car1 = new SportsCar(new BasicCar());
        Car car2 = new SportsCar(new LuxuryCar(car));
        car.assemble();
        car1.assemble();
        car2.assemble();
    }
}
