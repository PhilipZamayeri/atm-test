package com.example.atm.client;

public enum Bill {
    THOUSAND(1000),
    FIVE_HOUNDRED(500),
    HOUNDRED(100);

    private final int value;

    Bill(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
