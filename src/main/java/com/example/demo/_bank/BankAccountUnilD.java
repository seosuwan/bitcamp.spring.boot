package com.example.demo._bank;

class BankAccountId {
    String accnumber;
    String ssNumber;
    int balance = 0;

    public BankAccountId(String acc, String ss, int bal){  //void 메소드
        accnumber = acc;
        ssNumber = ss;
        balance = bal;
    }
    public int despoit(int amount){
        balance += amount;
        return balance;
    }
    public int withdraw(int amount){
        balance -= amount;
        return balance;
    }
    public int checkMyBalance(){
        System.out.println("계좌번호:" + accnumber);
        System.out.println("주민번호:" + ssNumber);
        System.out.println("잔 액 " + balance + "\n"); //\n 이스케이프 시퀀스
        return balance;
    }
}
public class BankAccountUnilD {
    public static void main(String[] args) {
        BankAccountId seo = new BankAccountId("12-34-89", "990990-9909903",10000);
        BankAccountId su = new BankAccountId("34-45-56","102010-1924933",10000);

        seo.despoit(5000);
        su.despoit(3000);
        seo.withdraw(2000);
        su.withdraw(1000);
        seo.checkMyBalance();
        su.checkMyBalance();
    }
}


