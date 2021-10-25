package com.example.atm.client;

import java.util.EnumSet;

public class Atm {
    EnumSet<Bill> billSet = EnumSet.allOf(Bill.class);
    BillRepository billRepository = new BillRepository();

    public Atm() {

    }

    public String withDrawAmount(int withDrawAmount) {
        billRepository.begin();
        int currentAmount = withDrawAmount;

        for (Bill bill : billSet) {
            int timesDivided = currentAmount / bill.getValue();
            if (timesDivided > 0) {
                if (billRepository.withDrawAmount(bill, timesDivided) != 0) {
                    currentAmount = currentAmount - (timesDivided * bill.getValue());
                }
            }
        }

        if (currentAmount == 0 && withDrawAmount != 0) {
            billRepository.commit();
            return withDrawAmount + " WITHDRAW";
        } else {
            billRepository.rollback();
            return withDrawAmount + " REJECTED";
        }
    }
}



