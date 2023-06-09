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
        service.debit(id, 10.0);
        Double expectedBalance = service.getBalance(id);

        // Verify
        assertEquals(expectedBalance, 79.9);
    }

    @Test
    void successfulCredit() {
        // Setup
        BalanceService service = new BalanceService();
        String id = service.createAccount("Jacob", 89.9);

        // Kick
        service.credit(id, 10.0);
        Double expectedBalance = service.getBalance(id);

        // Verify
        assertEquals(expectedBalance, 99.9);
    }

    @Test
    void successfulTransfer() {
        // Setup
        BalanceService service = new BalanceService();
        String id0 = service.createAccount("Jacob", 89.9);
        String id1 = service.createAccount("Isabel", 20.0);

        // Kick
        service.transfer(id0, id1, 12.0);
        Double expectedBalance0 = service.getBalance(id0);
        Double expectedBalance1 = service.getBalance(id1);

        // Verify
        assertEquals(expectedBalance0, 77.9);
        assertEquals(expectedBalance1, 32.0);
    }
}