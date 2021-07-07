package com.example.demo._bank.controller;

import com.example.demo._bank.domain.BankAccount;

import java.util.Scanner;

public class BankAccountPocontroller {
    public  static  void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        BankAccount bankaccount = new BankAccount();

        System.out.println("주민번호");
        bankaccount.setAccNumber(scanner.next());
        System.out.println("입금하세요");
        bankaccount.setAmount(scanner.nextInt());
        System.out.println("");
        bankaccount.deposit(bankaccount.getAmount());

        System.out.println(bankaccount.toString());
    }
}

