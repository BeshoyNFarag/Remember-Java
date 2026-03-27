/*
State (common attributes):
brand or manufacturer name
model name
current speed
Behavior:
A concrete method that prints basic vehicle information
A concrete method that increases speed in a generic way
At least one abstract method that forces subclasses to define specific movement behavior
**/

package com.beshoy.basic.interfaces;

abstract class Vehicle {
    String model;
    double speed;


    public void getInfo(){
        System.out.printf("%s model: %s%nVehicle speed: %.2f%n",getClass().getSimpleName() ,model, speed);
    }

    public abstract void behavior(Vehicle vehicle);



}
