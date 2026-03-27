package com.beshoy.basic.interfaces;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 250.50);
        car.start();
        car.getInfo();
        Bike bike = new Bike("BMX", 40.50);
        bike.start();
        bike.getInfo();
        car.getInfo();

    }
}
