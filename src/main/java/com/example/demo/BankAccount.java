package com.example.demo;

public class BankAccount {  //메소드생성 리터럴값
    int balance = 0; //은행계좌만들기

    public int deposit(int amount){//입금 생성자
        balance += amount;
        return balance;
    }
    public int withdraw(int amount){  //출금 생성자
        balance -= amount;
        return balance;
    }
    public int checkMyBalance(){  //잔액 생성자
        System.out.println("잔액 :" + balance);
        return  balance;
    }
}

class BankAccountOO{
    public static void main(String[] args) {
        BankAccount seo = new BankAccount();
        BankAccount su = new BankAccount();

        seo.deposit(10000);
        su.deposit(20000);

        seo.withdraw(200);
        su.withdraw(1000);

        seo.checkMyBalance();
        su.checkMyBalance();
    }


}
