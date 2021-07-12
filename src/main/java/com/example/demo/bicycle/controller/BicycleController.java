package com.example.demo.bicycle.controller;

import com.example.demo.bicycle.domain.BicycleDTO;
import com.example.demo.bicycle.service.BicycleService;
import com.example.demo.bicycle.service.BicycleServiceImpl;

import java.util.Scanner;

//gear compay speed
public class BicycleController {
    private BicycleService bicycleService;
    private BicycleDTO bicycleDTO;
    private Scanner scanner;
    public BicycleController(){
        this.bicycleService = new BicycleServiceImpl();
        this.bicycleDTO = new BicycleDTO();
        this.scanner = new Scanner(System.in);
    }

    public void BicycleController() {

        System.out.println("이 바이크 회사는");
        bicycleDTO.setCompany(scanner.next());
        System.out.println("스피드는");
        bicycleDTO.setSpeed(scanner.nextInt());  //-> setSpeed 인스턴스 변수가 되었다
        System.out.println("기어는 총");
        bicycleDTO.setGear(scanner.nextInt());

        System.out.print(bicycleDTO.toString());
    }
}
