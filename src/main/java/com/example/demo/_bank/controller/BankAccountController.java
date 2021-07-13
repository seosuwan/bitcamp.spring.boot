package com.example.demo._bank.controller;

import com.example.demo._bank.Serivce.BankAccountService;
import com.example.demo._bank.Serivce.BankAccountServiceImpl;
import com.example.demo._bank.domain.BankAccountDTO;

import java.util.List;
import java.util.Scanner;

public class BankAccountController {
    private BankAccountService bankAccountService;
    private BankAccountDTO bankAccount;

    public BankAccountController(){
    this.bankAccountService = new BankAccountServiceImpl();
    this.bankAccount = new BankAccountDTO();
    }


    public void add(BankAccountDTO bank) {

    }


    public int count() {
        return bankAccountService.count();
    }


    public void show() {
        System.out.println("고객의 수"+ bankAccountService.count());
        System.out.println(bankAccountService.show());
    }


    public void createAccount(BankAccountDTO bankAccount) {
        bankAccountService.createAccount(bankAccount);
    }


    public int findBlance(BankAccountDTO bankAccount) {
        return 0;
    }


    public void deposit(BankAccountDTO bankAccount) {
        bankAccountService.deposit(bankAccount);
    }


    public int withdraw(BankAccountDTO bankAccount) {
        return bankAccountService.withdraw(bankAccount);
    }


    public void dropAccount(BankAccountDTO bankAccount) {

    }
}
