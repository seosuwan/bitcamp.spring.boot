package com.example.demo._bank.domain;

public class BankAccount {
    private int balance;
    private String accNumber;
    private int amount;


    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }

    public String getAccNumberr() {
        return accNumber;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public int deposit(int amount) {
        balance += amount;
        return balance;

    }

    @Override
    public String toString() {
        return String.format("주민번호 %s 입금되었습니다 %d 현재잔액은 %d", accNumber, balance, balance);
    }
}
