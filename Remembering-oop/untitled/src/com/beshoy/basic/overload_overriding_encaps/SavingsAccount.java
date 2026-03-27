package com.beshoy.basic.overload_overriding_encaps;

public class SavingsAccount extends Account {
    private double draft;


    public void setDraft(double draft) {
        this.draft = draft;
    }

    @Override
    public void withdraw(double amount) {
        if ( (getBalance() + draft) >=  amount) {
            double balance = getBalance();
            balance -= amount;
            System.out.println("withdraw is successful current balance: " + balance);
        }
        else
            System.out.println("Insufficient funds");

    }
}
