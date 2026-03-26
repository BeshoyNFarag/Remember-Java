package com.beshoy.basic.enums;

import java.util.Scanner;

public class PracticeOne {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the color of the traffic light at the moment: ");
        String choice = scanner.nextLine().toUpperCase();

        switch (choice) {
            case "RED":
                TrafficLight.getColorName(TrafficLight.RED);
                TrafficLight.getColorTime(TrafficLight.RED);
                break;

            case "YELLOW":
                TrafficLight.getColorName(TrafficLight.YELLOW);
                TrafficLight.getColorTime(TrafficLight.YELLOW);
            case "GREEN":
                TrafficLight.getColorName(TrafficLight.GREEN);
                TrafficLight.getColorTime(TrafficLight.GREEN);
            default:
                System.out.println("Invalid color");

        }

    }
}
