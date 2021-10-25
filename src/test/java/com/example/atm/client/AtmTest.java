package com.example.atm.client;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AtmTest {
    Atm atm = new Atm();

    @Test
    void redMindTest() {
        assertEquals(atm.withDrawAmount(1500), "1500 WITHDRAW");
        assertEquals(atm.withDrawAmount(700), "700 WITHDRAW");
        assertEquals(atm.withDrawAmount(400), "400 REJECTED");
        assertEquals(atm.withDrawAmount(1100), "1100 WITHDRAW");
        assertEquals(atm.withDrawAmount(1000), "1000 REJECTED");
        assertEquals(atm.withDrawAmount(700), "700 WITHDRAW");
        assertEquals(atm.withDrawAmount(300), "300 REJECTED");

    }

    @Test
    void withDrawAmountNegative() {
        assertEquals(atm.withDrawAmount(-1000), "-1000 REJECTED");
        }

    @Test
    void withDrawAmountZero() {
        assertEquals(atm.withDrawAmount(0), "0 REJECTED");
        }

}