package com.SilviaFerrari.main.oop.bankaccount;

public abstract class AbstractBankAccount implements BankAccount{
    protected String IBAN;
    protected double balance;
    protected double operationFee;
    protected double interestRate;

    protected AbstractBankAccount(String IBAN, double balance, double operationFee, double interestRate) {
        setIBAN(IBAN);
        this.balance = balance;
        setOperationFee(operationFee);
        this.interestRate = interestRate;
    }

    protected void checkPositiveValue(double value){
        if(value < 0.0){
            throw new IllegalArgumentException("Negative values are not allowed for this operation");
        }
    }

    @Override
    public String getIBAN() {
        return IBAN;
    }

    @Override
    public void setIBAN(String IBAN) {
        BankAccount.checkIBAN(IBAN);
        this.IBAN = IBAN;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public double getOperationFee() {
        return operationFee;
    }

    @Override
    public void setOperationFee(double operationFee) {
        checkPositiveValue(operationFee);
        this.operationFee = operationFee;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }

    @Override
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        checkPositiveValue(amount);
        balance += amount;
    }

    @Override
    public double withdraw(double amount){
        checkPositiveValue(amount);
        balance -= amount;
        return amount;
    }

    @Override
    public double transfer(BankAccount other, double amount){
        withdraw(amount);
        other.deposit(amount);
        return amount;
    }

    @Override
    public void addInterest(){
        balance += balance * interestRate;
    }

    @Override
    public void applyFee(){
        balance -= operationFee;
    }
}
