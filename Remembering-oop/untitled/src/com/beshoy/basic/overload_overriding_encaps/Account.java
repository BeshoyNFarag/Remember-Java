package com.beshoy.basic.overload_overriding_encaps;

import java.text.NumberFormat;
import java.util.Locale;

public class Account {
    private String holderName;
    private double balance;

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setName(String holderName){
        this.holderName = holderName;
    }
    public double getBalance(){
        return balance;
    }
    public String getHolderName(){
        return holderName;
    }

    public void deposit(double amount){
        balance += amount;
    }

    //Overlaod
    public void deposit(double amount,  double interest, String Currency){
        NumberFormat nf = NumberFormat.getPercentInstance();
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("the deposit has been updated with interest rate of: " +  nf.format(interest));
        balance +=  (amount * interest) + amount;
        System.out.println("current Balance " +currencyFormat.format(balance)  + " " + Currency);
    }


    public void withdraw(double amount){
        if(amount > balance){
            System.out.println("insufficient balance");
        }
        else
            balance -= amount;
    }


    public void withdraw(double amount,  Boolean atm){
        double amountFeed = amount + 2;

        if((atm && amountFeed > balance) || amount > balance) {
            System.out.println("insufficient balance");
        }
        else if(!atm  && amount > balance){
            System.out.println("insufficient balance");
        }
        else if (!atm && amount <= balance){
            balance -= amount;
        }
        else
            balance -= amountFeed;

    }

    public void getInfo(){
        System.out.printf("Holder Name: %s\nAmount: %f%n", holderName, balance);
    }

}
