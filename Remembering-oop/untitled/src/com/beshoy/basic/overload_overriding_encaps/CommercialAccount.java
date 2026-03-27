package com.beshoy.basic.overload_overriding_encaps;

public class CommercialAccount extends Account{
    private double threshold;

    public void setThreshold(double threshold) {
        this.threshold = threshold;
    }

    @Override
    public void withdraw(double amount){
        if( (getBalance() - amount) >= threshold ){
            double balance = getBalance();
            balance -= amount;
            System.out.println("withdraw is below threshold: " + balance);
        }
        else
            System.out.println("Insufficient balance for the current threshold");
    }




}
