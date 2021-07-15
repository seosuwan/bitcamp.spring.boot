package com.example.demo._bank.Serivce;

import com.example.demo._bank.domain.BankAccountDTO;
import com.example.demo.util.serivce.LambdaUtils;
import com.example.demo.util.serivce.UtilSerivceImpl;
import com.example.demo.util.serivce.UtilService;
import java.util.ArrayList;
import java.util.List;

public class BankAccountServiceImpl extends LambdaUtils implements BankAccountService {
     private final BankAccountDTO bankAccount;
     private final List<BankAccountDTO>banks;
     public BankAccountServiceImpl(){
         bankAccount = new BankAccountDTO();
         banks = new ArrayList<>();
     }
     @Override
     public void add(BankAccountDTO bank) {
         banks.add(bank);
     }
     @Override
     public String count() {
        return string.apply(banks.size());
     }
     @Override
     public List<? extends BankAccountDTO> findAll() {
        return banks;
    }
     @Override
     public String[] findAllAccountNumbers() {
         int count = strToInt.apply(count());
         String[] accountNumbers = new String[count];
         for (int i =0; i<count;i++){
             accountNumbers[i] = banks.get(i).getAccountNumber();
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
     }

     @Override
     public String findBlance(BankAccountDTO bankAccount) {
        return bankAccount.getMoney();
    }

     @Override
     public String deposit(BankAccountDTO bankAccount) {
         int restMoney = strToInt.apply(bankAccount.getMoney());
         bankAccount.setMoney(restMoney + bankAccount.getMoney());
         return bankAccount.getMoney();
     }

     @Override
     public String withdraw(BankAccountDTO bankAccount) {

         return"";
    }

     @Override
     public void dropAccount(BankAccountDTO bankAccount) {

    }
}
