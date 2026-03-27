package com.beshoy.basic.interfaces;

import java.sql.DataTruncation;

public class EScooter extends Vehicle implements Drivable {
    public EScooter(String model, double speed) {
        super.model = model;
        super.speed = speed;
    }

    public void behavior(Vehicle vehicle){
        vehicle.model = model;
        vehicle.speed = speed;
    }

    public void start(){
        System.out.println("escooter has started vrom vrom!");

    }
    public void stop(){
        System.out.println("escooter has stopped vrom vrom!");
    }
    public void energyConsumption(){
        System.out.println("car has energy consumption by electricity!");
    }
}
