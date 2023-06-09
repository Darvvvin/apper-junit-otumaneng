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
        Account newBalance = getAccount(id).debitFromAccount(amount);
        Account toReplace = accounts
                .stream()
                .filter(account -> id.equals(account.id()))
                .findFirst()
                .orElse(null);

        accounts.set(accounts.indexOf(toReplace), newBalance);
    }

    public void credit(String id, Double amount) {
        Account newBalance = getAccount(id).creditToAccount(amount);
        Account toReplace = accounts
                .stream()
                .filter(account -> id.equals(account.id()))
                .findFirst()
                .orElse(null);

        accounts.set(accounts.indexOf(toReplace), newBalance);
    }

    public void transfer(String from, String to, Double amount) {
        debit(from, amount);
        credit(to, amount);
    }
}
