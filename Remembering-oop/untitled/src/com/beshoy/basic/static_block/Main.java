/*
4. Main class (important part)

In your main:
A. Demonstrate static block behavior
Access AppConfig in any way
Observe when the static block runs
B. Create multiple objects
Create multiple UserService and PaymentService objects
You must verify:
static block runs only once
configuration is shared across all objects

* */

package com.beshoy.basic.static_block;

public class Main {

    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();
        UserService userService = new UserService();
        userService.printAppName(false);
    }



}
