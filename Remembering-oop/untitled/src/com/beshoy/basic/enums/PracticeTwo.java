/*
Example output:
MEDIUM: 350ml - 3.5 euros*/

package com.beshoy.basic.enums;

public class PracticeTwo {

    public static void main(String[] args) {
        CoffeeSize midCoffee = CoffeeSize.MEDIUM;

        midCoffee.printInfo();
        midCoffee.setSize(400);
        midCoffee.setPrice(3.25f);
        midCoffee.printInfo();

    }

}
