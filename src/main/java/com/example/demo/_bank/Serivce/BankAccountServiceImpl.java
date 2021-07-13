package com.example.demo._bank.Serivce;

import com.example.demo._bank.domain.BankAccountDTO;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BankAccountServiceImpl implements BankAccountService {
     private BankAccountDTO bankAccount;
     private Random rand;
     private ArrayList<BankAccountDTO>banks;

     public BankAccountServiceImpl(){
         bankAccount = new BankAccountDTO();
         rand = new Random();
         banks = new ArrayList<>();
     }


    @Override
    public void add(BankAccountDTO bank) {
         banks.add(bank);

    }

    @Override
    public int count() {
        return banks.size();
     }

    @Override
    public List<BankAccountDTO> show() {
        return banks;
    }

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
         bankAccount.setBalance(bankAccount.getMoney()+bankAccount.getBalance());
         return bankAccount.getBalance();
     }

    @Override
    public int withdraw(BankAccountDTO bankAccount) {
         bankAccount.setBalance(bankAccount.getBalance()-bankAccount.getMoney());
         return bankAccount.getBalance();
    }

    @Override
    public void dropAccount(BankAccountDTO bankAccount) {

    }
}
