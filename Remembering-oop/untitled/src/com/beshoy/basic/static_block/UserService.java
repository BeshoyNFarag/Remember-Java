package com.beshoy.basic.static_block;


import java.util.Scanner;

public class UserService {
    Scanner scanner = new Scanner(System.in);

    public void printAppName(boolean mode){
        AppConfig.debugFlag = mode;
        if(mode){
            String appName = scanner.nextLine();
            AppConfig.applicationName = appName;
            System.out.println("App name is true and: " + appName);
        }
        else
            System.out.println("App name is unchanged and: " + AppConfig.applicationName);
    }
}
