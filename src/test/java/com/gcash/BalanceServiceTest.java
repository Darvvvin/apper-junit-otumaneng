package com.gcash;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalanceServiceTest {

    @Test
    void successfulGetBalance() {
        // Setup
        BalanceService service = new BalanceService();
        String id = service.createAccount("Jacob", 89.9);

        // Kick
        Double expectedBalance = service.getBalance(id);

        // Verify
        assertEquals(expectedBalance, 89.9);
    }

    @Test
    void successfulDebit() {
        // Setup
        BalanceService service = new BalanceService();
        String id = service.createAccount("Jacob", 89.9);

        // Kick


        // Verify
    }
}