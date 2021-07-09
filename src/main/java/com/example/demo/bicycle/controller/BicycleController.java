package com.example.demo.bicycle.controller;

import com.example.demo.bicycle.domain.Bicycle;

import java.util.Scanner;

//gear compay speed
public class BicycleController {
    public void BicycleController() {
        Scanner bc = new Scanner(System.in);
        Bicycle aa = new Bicycle();

        System.out.println("이 바이크 회사는");
        aa.setCompany(bc.next());
        System.out.println("스피드는");
        aa.setSpeed(bc.nextInt());  //-> setSpeed 인스턴스 변수가 되었다
        System.out.println("기어는 총");
        aa.setGear(bc.nextInt());

        System.out.print(aa.toString());
    }

}
