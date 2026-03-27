/*
Create an enum called CoffeeSize with the following values:
SMALL (250 ml, 2.50 price)
MEDIUM (350 ml, 3.50 price)
LARGE (450 ml, 4.50 price)

Each enum constant should store:

volume (int)
price (double)

Then:

Add a constructor
Add getter methods
Write a method printInfo() that prints:
size name
volume
price
Example output:
MEDIUM: 350ml - 3.5 euros*/

package com.beshoy.basic.enums;

public enum CoffeeSize {
    SMALL(250,2.5f ),
    MEDIUM(350,3.5f),
    LARGE(450,4.5f);

    private int size;
    private float price;

    CoffeeSize(int size, float price) {
        this.size = size;
        this.price = price;
    }

    public void setSize(int size){
        this.size = size;
    }
    public void setPrice(float price){
        this.price = price;
    }
    public int getSize(){
        return size;
    }
    public float getPrice(){
        return price;
    }

    public void printInfo(){
        System.out.println("Coffee Size: " + size + " Price: " + price);
    }
}
