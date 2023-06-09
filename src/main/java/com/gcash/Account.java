package com.gcash;

public record Account(String id, String name, Double balance) {
    public Double getBalance() {
        return this.balance;
    }

    public Account debitFromAccount(Double amount) {
        return new Account(id, name, (balance - amount));
    }

    public Account creditToAccount(Double amount) {
        return new Account(id, name, (balance + amount));
    }
}
