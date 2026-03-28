/*
3. Create another class: PaymentService
Requirements:
Also use values from AppConfig
Use the numeric config value (e.g., max users/connections) in some logic
Print something that proves it accessed the same shared configuration
* */

package com.beshoy.basic.static_block;

public class PaymentSservice {

    public void checkUsersNum(int users){
        boolean b = users > AppConfig.maxUsers;
        if (b) {
            System.out.println("cannot process this many users");
            users -= 1;
        }
        else
            System.out.println("can process this many users");
    }
}
