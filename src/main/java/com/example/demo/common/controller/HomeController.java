package com.example.demo.common.controller;


import com.example.demo._bank.controller.BankAccountController;
import com.example.demo._bank.domain.BankAccountDTO;
import com.example.demo.bicycle.controller.BicycleController;
import com.example.demo.bicycle.domain.BicycleDTO;
import com.example.demo.calculator.controller.CalculatorController;
import com.example.demo.dog.controller.DogController;
import com.example.demo.dog.domain.DogDTO;
import com.example.demo.dog.service.DogServiceImpl;
import com.example.demo.util.serivce.LambdaUtils;

import java.util.Scanner;

public class HomeController extends LambdaUtils {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DogController dogController = new DogController();
        BicycleController bicycleController = new BicycleController();
        BankAccountController bankAccountController = new BankAccountController();

        while (true) {
            print.accept("\n[메뉴] 0.종료 1.수학 2.강아지 3.자전거 4.은행 ");
            switch (scanner.next()) {
                case "0":
                    return;
                case "1": new CalculatorController().main();break;
                case "2": new DogController().main();break;
                case "3": new BicycleController().main();break;
                case "4": new BankAccountController().main();break;
                        }
                    }
            }
}

