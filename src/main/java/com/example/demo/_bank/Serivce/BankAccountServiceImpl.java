package com.example.demo._bank.Serivce;

import com.example.demo._bank.domain.BankAccountDTO;

import java.util.Random;

public class BankAccountServiceImpl implements BankAccountService {
    private BankAccountDTO bankAccount;
    private Random rand;


    @Override
    public void createAccount(BankAccountDTO bank){
        bankAccount = new BankAccountDTO();
        this.rand = new Random();
        String rand

        //bankAccount.setAccountNumber(randomNumber);
        //bankAccount.setName(bank.getName());
    }

    @Override
    public int findBlance(BankAccountDTO bank) {
        return bankAccount.getMoney();
    }

    @Override
    public int deposit(BankAccountDTO bank) {
        int restMoney = bankAccount.getMoney();
        bankAccount.setMoney(restMoney + bank.getMoney());
        return bankAccount.getMoney();
    }

    @Override
    public int withdraw(BankAccountDTO bank) {

        return 0;
    }

    @Override
    public void dropAccount(BankAccountDTO bank) {

    }
}
