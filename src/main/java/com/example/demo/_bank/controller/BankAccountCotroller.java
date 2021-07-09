package com.example.demo._bank.controller;

import com.example.demo._bank.domain.BankAccountDTO;

import java.util.Scanner;

public class BankAccountCotroller {

    public void BankAccountCotroller(){
    Scanner scanner = new Scanner(System.in);
    BankAccountDTO bankaccount = new BankAccountDTO();

        System.out.println("주민번호");
        bankaccount.setAccNumber(scanner.next());
        System.out.println("입금하세요");
        bankaccount.setAmount(scanner.nextInt());
        System.out.println("");
        bankaccount.deposit(bankaccount.getAmount());

        System.out.println(bankaccount.toString());
}
}
