package com.example.demo.common.controller;


import com.example.demo._bank.controller.BankAccountController;
import com.example.demo._bank.domain.BankAccountDTO;
import com.example.demo.bicycle.controller.BicycleController;
import com.example.demo.bicycle.domain.BicycleDTO;
import com.example.demo.calculator.controller.CalculatorController;
import com.example.demo.dog.controller.DogController;
import com.example.demo.dog.domain.DogDTO;
import com.example.demo.dog.service.DogServiceImpl;

import java.util.Scanner;

public class HomeController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DogController dogController = new DogController();
        BicycleController bicycleController = new BicycleController();
        BankAccountController bankAccountController = new BankAccountController();

        while (true) {
            System.out.println("\n[메뉴] 0.종료 1.계산기 2.수열 3.강아지 33.강아지수 4.자전거 44.자전거수 5.은행 55.은행고객수 ");
            switch (scanner.next()) {
                case "0":
                    return;
                case "1":
                    new CalculatorController().calculate();
                    ;
                    break;
                case "2":
                    new CalculatorController().sequence();
                    break;
                case "3":
                    DogDTO dog = new DogDTO();
                    System.out.println("이름이 뭐요?");
                    dog.setName(scanner.next());
                    System.out.println("색깔은 뭐요?");
                    dog.setColor(scanner.next());
                    System.out.println("품종이 뭐요?");
                    dog.setBreed(scanner.next());
                    dogController.add(dog);
                    break;
                case "33":
                    dogController.show();
                    break;
                case "4":
                    BicycleDTO bicycle = new BicycleDTO();
                    System.out.println("이 바이크 회사는");
                    bicycle.setCompany(scanner.next());
                    System.out.println("스피드는");
                    bicycle.setSpeed(scanner.nextInt());  //-> setSpeed 인스턴스 변수가 되었다
                    System.out.println("기어는 총");
                    bicycle.setGear(scanner.nextInt());
                    bicycleController.add(bicycle);
                    break;
                case "44":
                    bicycleController.show();
                case "5":
                    BankAccountDTO bankAccount = new BankAccountDTO();
                    while (true) {

                        System.out.println("[메뉴] 0.종료 1.계좌만들기 2.잔액확인 3.입금 4.출금 5.고객 수");

                        switch (scanner.next()) {
                            case "0":
                                return;
                            case "1":
                                System.out.println("이름을 입력하세요");
                                bankAccount.setName(scanner.next());
                                bankAccountController.createAccount(bankAccount);
                                System.out.println(bankAccount.getAccountNumber());
                                break;
                            case "2":
                                System.out.println("계좌번호 입력하세요");
                                bankAccount.setAccountNumber(scanner.next());
                                bankAccountController.findBlance(bankAccount);
                                break;
                            case "3":
                                System.out.println("입금할 금액을 입력하세요 ");
                                bankAccount.setMoney(scanner.nextInt());
                                bankAccountController.deposit(bankAccount);
                                System.out.println(bankAccount.getBalance());

                                break;
                            case "4":
                                System.out.println("찾을 금액을 입력하세요");
                                bankAccount.setMoney(scanner.nextInt());
                                bankAccountController.withdraw(bankAccount);
                                System.out.println(bankAccount.getBalance());
                                break;
                            case "5":
                                bankAccountController.show();




                        }
                    }
            }


        }
    }
}