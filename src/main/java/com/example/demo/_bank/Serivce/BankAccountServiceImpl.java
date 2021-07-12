package com.example.demo._bank.Serivce;

import com.example.demo._bank.domain.BankAccountDTO;

import java.util.Random;

public class BankAccountServiceImpl implements BankAccountService {
    private BankAccountDTO bankAccount;
    private Random rand;


    @Override
    public void createAccount(BankAccountDTO bankAccount){
        this.bankAccount = new BankAccountDTO();
        this.rand = new Random();
        bankAccount.setAccountNumber(String.format("%s-%s-%s",rand.nextInt(10000),
                rand.nextInt(10000),rand.nextInt(10000)));

        //bankAccount.setAccountNumber(randomNumber);
        //bankAccount.setName(bank.getName());
    }

    @Override
    public int findBlance(BankAccountDTO bankAccount) {
        return bankAccount.getMoney();
    }

    @Override
    public int deposit(BankAccountDTO bankAccount) {
        int restMoney = bankAccount.getMoney();
        bankAccount.setMoney(restMoney + bankAccount.getMoney());
        return bankAccount.getMoney();
    }

    @Override
    public int withdraw(BankAccountDTO bankAccount) {

        return 0;
    }

    @Override
    public void dropAccount(BankAccountDTO bankAccount) {

    }
}
