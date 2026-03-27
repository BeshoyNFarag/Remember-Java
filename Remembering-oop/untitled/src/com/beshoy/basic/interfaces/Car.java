package com.beshoy.basic.interfaces;

public class Car extends Vehicle implements Drivable {

    public Car(String model, double speed) {
        super.model = model;
        super.speed = speed;
    }

    public void behavior(Vehicle vehicle){
        vehicle.model = model;
        vehicle.speed = speed;
    }

    public void start(){
        System.out.println("car has started vrom vrom!");

    }
    public void stop(){
        System.out.println("car has stopped vrom vrom!");
    }
    public void energyConsumption(){
        System.out.println("car has energy consumption by fuel/gas!");
    }


}
