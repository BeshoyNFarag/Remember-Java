package com.beshoy.basic.overload_overriding_encaps;

public class Main {
    public static void main(String[] args) {
        Account baseAcc = new Account();
        CommercialAccount commercialAcc = new CommercialAccount();
        SavingsAccount savingsAcc = new SavingsAccount();

        // test for the parent finished
        baseAcc.setName("Beshoy");
        baseAcc.setBalance(100);
        baseAcc.deposit(100, 0.025, "USD" );
        baseAcc.withdraw(25, true);
        baseAcc.getInfo();
        System.out.println();



        //commericial child sucessfully done

        commercialAcc.setName("Beshoy Farag");
        commercialAcc.setBalance(1500);
        commercialAcc.getInfo();
        commercialAcc.setThreshold(200);
        commercialAcc.withdraw(1340);
        System.out.println();


        //saving child successfully done
        savingsAcc.setName("Beshoy");
        savingsAcc.setBalance(200);
        savingsAcc.setDraft(200);
        savingsAcc.deposit(300);
        savingsAcc.withdraw(700);





    }
}
