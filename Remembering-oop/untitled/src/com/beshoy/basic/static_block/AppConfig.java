package com.beshoy.basic.static_block;

public class AppConfig {
    static String applicationName;
    static String versionNumber;
    static boolean debugFlag;
    static int maxUsers;

    static {
        System.out.println("Loading confiurations....");
        System.out.println("this will only appear once irregardless of how many objects");
        applicationName = "Basic";
        versionNumber = "1.0";
        debugFlag = false;
        maxUsers = 10;


    }
}
