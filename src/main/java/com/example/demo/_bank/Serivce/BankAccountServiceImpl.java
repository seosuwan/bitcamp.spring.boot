package com.example.demo._bank.Serivce;

import com.example.demo._bank.domain.BankAccountDTO;
import com.example.demo.util.serivce.UtilSerivceImpl;
import com.example.demo.util.serivce.UtilService;
import java.util.ArrayList;
import java.util.List;

public class BankAccountServiceImpl implements BankAccountService {
     private BankAccountDTO bankAccount;
     private List<BankAccountDTO>banks;
     private UtilService util;

     public BankAccountServiceImpl(){
         bankAccount = new BankAccountDTO();
         banks = new ArrayList<>();
         util = new UtilSerivceImpl();
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
    public String[] findAllAccountNumbers() {
         String[] accountNumbers = new String[count()];
         for (int i = 0; i < count();i++ ){
             accountNumbers[i] += banks.get(i).getAccountNumber();
         }
         return accountNumbers;
    }

    @Override
    public void createAccount(BankAccountDTO bankAccount){
        UtilService utilService = new UtilSerivceImpl();
        String accountNumber =
                utilService.randoNumbers(4,false)+"-"+
                utilService.randoNumbers(4,true)+"-"+
                utilService.randoNumbers(4,true);
                bankAccount.setAccountNumber(accountNumber);
        bankAccount.setAccountNumber(accountNumber);
        banks.add(bankAccount);






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
