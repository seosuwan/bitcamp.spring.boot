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
        bankAccount.setBalance("0");
        bankAccount.setDate(utilService.todayAndCurrentTime());
        bankAccount.setInterest("0.01");
        banks.add(bankAccount);
     }

     @Override
     public String findBlance(BankAccountDTO bankAccount) {
        return bankAccount.getMoney();
    }

     @Override
     public void deposit(BankAccountDTO bankAccount) {
         BankAccountDTO bank = null;
         for (BankAccountDTO b : banks){
           if(b.getAccountNumber().equals(bankAccount.getAccountNumber())){
               int balance = strToInt.apply(b.getBalance());
               b.setBalance(string.apply(balance + strToInt.apply(bankAccount.getMoney())));
               print.accept("입금 정보" + b);
               break;
           }else {
               print.accept("해당 계좌가 존재하지 않습니다");
           }
         }
     }
     @Override
     public void withdraw(BankAccountDTO bankAccount) {
         BankAccountDTO bank = null;
         for(BankAccountDTO a : banks){
             if(a.getAccountNumber().equals(bankAccount.getAccountNumber())){
                 int balance = strToInt.apply(a.getBalance());
                 a.setBalance(string.apply(balance - strToInt.apply(bankAccount.getMoney())));
                 print.accept("출금 정보" + a);
                 break;
             }else {
                 print.accept("해당 계좌가 존재하지 않습니다");
             }
         }
     }

     @Override
     public void dropAccount(BankAccountDTO bankAccount) {
     }
}
