/*

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

public class SecondMain {
    public static void main(String[] args) {
        Car c = new Car();
        c.speed();
    }
}
