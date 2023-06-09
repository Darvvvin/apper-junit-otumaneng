package com.gcash;

public record Account(String id, String name, Double balance) {
    public Double getBalance() {
        return this.balance;
    }

    public Account debitFromAccount(String id) {
        return new Account(id, name, balance);
    }
}
