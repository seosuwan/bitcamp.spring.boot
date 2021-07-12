package com.example.demo._bank.controller;

import com.example.demo._bank.Serivce.BankAccountService;
import com.example.demo._bank.Serivce.BankAccountServiceImpl;
import com.example.demo._bank.domain.BankAccountDTO;

import java.util.Scanner;

public class BankAccountController {
    private Scanner scanner;
    private BankAccountService bankAccountService;
    private BankAccountDTO bankAccount;

    public BankAccountController(){
    this.bankAccountService = new BankAccountServiceImpl();
    this.scanner = new Scanner(System.in);
    this.bankAccount = new BankAccountDTO();
    }
    public void main(){
        System.out.println("[메뉴] 0.종료 1.계좌만들기 2.잔액확인 3.입금 4.출금 5.");
        while (true){
            switch (scanner.next()){
                case "0" : return;
                case "1" :
                    System.out.println("이름을 입력하세요");
                    bankAccount.setName(scanner.next());
                    this.bankAccountService.createAccount(bankAccount);
                    break;
                case "2" :
                    System.out.println("계좌번호 입력하세요");
                    bankAccount.setAccountNumber(scanner.next());
                    bankAccountService.findBlance(bankAccount);
                    break;
                case "3" :
                    System.out.println("금액,계좌번호입력하세요");
                    bankAccount.setMoney(scanner.nextInt());bankAccount.setAccountNumber(scanner.next());
                    bankAccountService.deposit(bankAccount);
                    break;

            }
        }
    }
}
