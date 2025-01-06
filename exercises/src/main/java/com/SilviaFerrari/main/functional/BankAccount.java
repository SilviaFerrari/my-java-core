package com.SilviaFerrari.main.functional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class BankAccount {
    public static class Account {
        double amount;
        double interestRate;
        LocalDateTime duePayment;

        public Account(double amount, double interestRate, LocalDateTime duePayment) {
            this.amount = amount;
            this.interestRate = interestRate;
            this.duePayment = duePayment;
        }

        public LocalDateTime getDuePayment() {
            return duePayment;
        }

        public double getInterestRate() {
            return interestRate;
        }

        public double getAmount() {
            return amount;
        }

        public void applyInterest() {
            amount += amount * interestRate;
        }
    }

    public static List<Account> applyInterest(List<Account> accounts) {
        return accounts.stream()
                .filter(acc -> acc.getDuePayment().isBefore(LocalDateTime.now()))
                .peek(Account::applyInterest)
                .sorted((acc1, acc2) -> (int) (acc2.getAmount() - acc1.getAmount()))
                .collect(Collectors.toList());
    }
}
