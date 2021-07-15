package com.example.demo._bank.controller;

import com.example.demo._bank.Serivce.BankAccountService;
import com.example.demo._bank.Serivce.BankAccountServiceImpl;
import com.example.demo._bank.domain.BankAccountDTO;
import com.example.demo.util.serivce.LambdaUtils;

import java.util.List;
import java.util.Scanner;

public class BankAccountController extends LambdaUtils {
    private BankAccountService bankAccountService;

    public BankAccountController() {
        this.bankAccountService = new BankAccountServiceImpl();
    }

    public void main() {
        Scanner scanner = new Scanner(System.in);
        BankAccountDTO bankAccount = null;
        while (true) {
            print.accept("\n[메뉴] 0-종료 1-계좌생성 2-입금 3-출금 4-계좌목록 5-계좌번호목록\n");
            switch (scanner.next()) {
                case "0":
                    return;
                case "1":
                    bankAccount = new BankAccountDTO();
                    print.accept("이름입력:[    ]");
                    bankAccount.setName(scanner.next());
                    bankAccountService.createAccount(bankAccount);
                    break;
                case "2":
                    print.accept("계좌번호 :[    ]");
                    bankAccount = new BankAccountDTO();
                    bankAccount.setAccountNumber(scanner.next());
                    print.accept("입금 금액:");
                    bankAccount.setMoney(scanner.next());
                    break;
                case "3":
                    print.accept("계좌번호 :[    ]");
                    bankAccount = new BankAccountDTO();
                    bankAccount.setAccountNumber(scanner.next());
                    print.accept("출금 금액:");
                    bankAccount.setMoney(scanner.next());
                    print.accept(bankAccount.getMoney());
                    break;
                case "4":
                    print.accept("개설 계좌 수 : " + "\n" + bankAccountService.count());
                    List<? extends BankAccountDTO> list = bankAccountService.findAll();
                    for (BankAccountDTO a : list) {
                        print.accept(a.toString());
                    }

            }
        }
    }
}