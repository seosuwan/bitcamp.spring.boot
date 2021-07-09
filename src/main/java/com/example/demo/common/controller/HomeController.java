package com.example.demo.common.controller;

import com.example.demo._bank.controller.BankAccountCotroller;
import com.example.demo.bicycle.controller.BicycleController;
import com.example.demo.calculator.controller.CalculatorController;
import com.example.demo.dog.controller.DogController;

import java.util.Scanner;

public class HomeController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculatorController calculatorController = new CalculatorController();
        DogController dogController = new DogController();
        BankAccountCotroller bankAccountCotroller = new BankAccountCotroller();
        BicycleController bicycleController = new BicycleController();
        while (true){
            System.out.println("\n[메뉴] 0.종료 1.계산기 2.수열 3.강아지 4.은행 5.바이크" );
            switch (scanner.next()){
                case "0" : return;
                case "1" :calculatorController.calculate();break;
                case "2" :calculatorController.sequence();break;
                case "3" :dogController.DogCotroller();break;
                case "4" :bankAccountCotroller.BankAccountCotroller();break;
                case "5" :bicycleController.BicycleController();break;


            }
        }

    }
}
