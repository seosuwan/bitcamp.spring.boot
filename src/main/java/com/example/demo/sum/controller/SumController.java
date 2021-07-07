package com.example.demo.sum.controller;

import com.example.demo.sum.domain.Sum;

import java.util.Scanner;

public class SumController {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sum aa = new Sum();

        System.out.println("숫자");
        aa.setNum(sc.nextInt());

        System.out.println("숫자");
        aa.setNum2(sc.nextInt());

        System.out.println("+");
        aa.setOpcode(sc.next());

        System.out.print(aa.toString());

    }
}
