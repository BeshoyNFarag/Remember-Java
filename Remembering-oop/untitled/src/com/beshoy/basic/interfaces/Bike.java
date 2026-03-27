package com.beshoy.basic.interfaces;

public class Bike extends Vehicle implements Drivable{

    public Bike(String model, double speed){
        super.model = model;
        super.speed = speed;
    }
    public void behavior(Vehicle vehicle){
        vehicle.model = model;
        vehicle.speed = speed;

    }
    public void start(){
        System.out.println("Bike is running");
    }
    public void stop(){
        System.out.println("Bike is stopped");
    }
    public void energyConsumption(){
        System.out.println("energy consumption is human");
    }
}
