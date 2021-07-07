package com.example.demo._0706;

public class BankAccountPo { //main 자동완성
    static int balance = 0;  //예금잔액
    public  static  void main(String[] args){
        deposit(10000);//입금 진행
        checkMyBalnce();  // 잔액 확인
        withdraw(3000); //출금 진행
        System.out.println(withdraw((3000)));
        checkMyBalnce();    //잔액 확인
    }

    public static int deposit(int amount){    //입금을 담당하는 메소드
        balance += amount;
        return balance;
    }
    public static int withdraw(int amount){       //출금을 담당하는 메소드
        balance -= amount;
        return balance;
    }
    public static int checkMyBalnce(){          //예금 조회를 담당하는 메소드
        System.out.println("잔액 : " + balance);
        return balance;

    }
}
