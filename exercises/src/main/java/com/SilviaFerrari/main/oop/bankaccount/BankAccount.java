package com.SilviaFerrari.main.oop.bankaccount;

public interface BankAccount {
    String getIBAN();

    void setIBAN(String IBAN);

    double getBalance();

    void setBalance(double balance);

    double getOperationFee();

    void setOperationFee(double operationFee);

    double getInterestRate();

    void setInterestRate(double interestRate);

    void deposit(double amount);

    double withdraw(double amount);

    double transfer(BankAccount other, double amount);

    void addInterest();

    void applyFee();

    static void checkIBAN(String IBAN){
        if(IBAN.length() > 34 | IBAN.length() < 8){
            throw new IllegalArgumentException("Invalid length");
        }
        if(!Character.isLetter(IBAN.toCharArray()[0]) || !Character.isLetter(IBAN.toCharArray()[1])){
            throw new IllegalArgumentException("Invalid country code");
        }
        if(!Character.isUpperCase(IBAN.toCharArray()[0]) || !Character.isUpperCase(IBAN.toCharArray()[1])){
            throw new IllegalArgumentException("Invalid country code");
        }
    }
}
