package com.example.atm.client;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BillRepositoryTest {
    BillRepository billRepo = new BillRepository();

    @Test
    void withDrawAmount() {
        billRepo.begin();
        assertEquals(billRepo.withDrawAmount(Bill.THOUSAND, 2 ), 2);
        assertNotEquals(0, billRepo.withDrawAmount(Bill.FIVE_HOUNDRED, 2));
    }
}