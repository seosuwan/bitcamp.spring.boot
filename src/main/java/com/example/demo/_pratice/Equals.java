package com.example.demo._pratice;

import sun.management.snmp.jvmmib.JVM_MANAGEMENT_MIBOidTable;

import java.util.Scanner;

public class Equals {
    public static void main(String[] args) {
    }
    public void colortype(){
        System.out.println("색상무엇?");
        Scanner sb = new Scanner(System.in);
        String s = sb.next();
        System.out.println(s.getClass().getName());
        if (s.equals("실버")){
            System.out.println("색상은 실버");
        } else {
            System.out.println("아니지롱");
        }
        sb.close();
    }
}


















