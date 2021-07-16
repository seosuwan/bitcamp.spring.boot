package com.example.demo.common.controller;


import com.example.demo._bank.controller.BankAccountController;
import com.example.demo._bank.domain.BankAccountDTO;
import com.example.demo.bicycle.controller.BicycleController;
import com.example.demo.bicycle.domain.BicycleDTO;
import com.example.demo.calculator.controller.CalculatorController;
import com.example.demo.dog.controller.DogController;
import com.example.demo.dog.domain.DogDTO;
import com.example.demo.dog.service.DogServiceImpl;
import com.example.demo.himart.controller.HimartController;
import com.example.demo.util.controller.UtilController;
import com.example.demo.util.serivce.LambdaUtils;

import java.util.Scanner;

public class HomeController extends LambdaUtils {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DogController dogController = new DogController();
        BicycleController bicycleController = new BicycleController();
        BankAccountController bankAccountController = new BankAccountController();
        UtilController utilController = new UtilController();
        HimartController himartController = new HimartController();

        while (true) {
            print.accept("\n[메뉴] 0.종료 1.Util 2.수학 3.강아지 4.자전거 5.은행 6.하이마트 \n");
            switch (scanner.next()) {
                case "0":
                    return;
                case "1": new UtilController().main();break;
                case "2": new CalculatorController().main();break;
                case "3": new DogController().main();break;
                case "4": new BicycleController().main();break;
                case "5": new BankAccountController().main();break;
                case "6": new HimartController().main();break;
                        }
                    }
            }
}

