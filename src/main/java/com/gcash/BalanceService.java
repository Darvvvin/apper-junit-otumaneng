package com.gcash;

public class BalanceService extends AccountRepository {

    /**
     * NOTE: You are expected to use one repository instance in all methods, not one repository per method.
     *
     */

    public Double getBalance(String id) {
        return getAccount(id).getBalance();
    }

    public void debit(String id, Double amount) {

    }

    public void credit(String id, Double amount) {
    }

    public void transfer(String from, String to, Double amount) {
    }
}
