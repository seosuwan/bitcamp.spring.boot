package com.example.demo._bank.domain;

import lombok.Data;

@Data
public class BankAccountDTO {  //상수와 변수
    public static final String BANK_NAME = "비트은행"; //은행이름
    private int money; //잔액
    private String name; //이름
    private String accountNumber;//계좌
    private String date; //날짜
    private float interest; //이자율
    private int balance;


}
