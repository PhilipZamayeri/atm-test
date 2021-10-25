package com.example.atm.client;

import java.util.*;

public class BillRepository {

    private Map<Bill, Integer> billAmountsCopy = null;
    private Map<Bill, Integer> billAmounts = new HashMap<>();

    public BillRepository() {
        billAmounts.put(Bill.THOUSAND, 2);
        billAmounts.put(Bill.FIVE_HOUNDRED, 3);
        billAmounts.put(Bill.HOUNDRED, 5);
    }

    public Integer withDrawAmount(Bill bill, Integer amount) {
        if (billAmountsCopy.get(bill) - amount < 0) {
            return 0;
        }
        return billAmountsCopy.put(bill, billAmountsCopy.get(bill) - amount);
    }

    public void begin() {
        billAmountsCopy = new HashMap<>(billAmounts);
    }

    public void commit() {
        billAmounts = billAmountsCopy;
    }

    public void rollback() {
        billAmountsCopy = null;
    }
}


