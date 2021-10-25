package com.example.atm.client;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public Client(){
        clientWithdraw();
    }

    void clientWithdraw(){
        Atm atm = new Atm();

        //Simulate input
        List<Integer> withDrawAmounts = new ArrayList<>();
        withDrawAmounts.add(1500);
        withDrawAmounts.add(700);
        withDrawAmounts.add(400);
        withDrawAmounts.add(1100);
        withDrawAmounts.add(1000);
        withDrawAmounts.add(700);
        withDrawAmounts.add(300);

        for (Integer withDrawAmount :
                withDrawAmounts) {
            System.out.println(atm.withDrawAmount(withDrawAmount));
        }
    }

    public static void main(String[] args) {
        new Client();
    }
}
