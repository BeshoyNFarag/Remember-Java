/*

2. Class Car extends Vehicle
Field: speed = 100 (shadow parent field)
Constructor:
Calls super()
Prints "Car created"
Override method:
showSpeed()

Inside it:

Call super.showSpeed()
Print "Car speed: " + this.speed
3. Main class
Car c = new Car();
c.showSpeed();
What you are testing
Constructor execution order (super() first)
Method overriding
Accessing parent method using super
Field shadowing (this.speed vs super.speed)
Expected output
Vehicle created
Car created
Vehicle speed: 50
Car speed: 100
* */

package com.beshoy.basic.this_super;

public class Vehicle {
    protected int speed = 50;


    public Vehicle(){
        System.out.println("vehicle created.");
    }

    public void speed(){
        System.out.println("vehicle speed " + speed);
    }


}
