/*

Create an enum called TrafficLight with the values:
RED
YELLOW
GREEN
Then write a class that:
Stores a TrafficLight variable
Prints a message based on the current light:
RED → "Stop"
YELLOW → "Get ready"
GREEN → "Go"
Requirements:
Use a switch statement on the enum
Keep the enum simple (no extra fields needed)
Goal:
Understand how enums are used in control flow.
*/


package com.beshoy.basic.enums;

enum TrafficLight {
    RED("Stop", 60),
    YELLOW("Hold", 10),
    GREEN("Go", 60);

    private final String name;
    private final int time;

    TrafficLight(String name, int time) {
        this.name = name;
        this.time = time;
    }
    public static void getColorName(TrafficLight status){
        System.out.println(status.name);
    }
    public static void getColorTime(TrafficLight status){
        System.out.println(status.time);
    }
}
