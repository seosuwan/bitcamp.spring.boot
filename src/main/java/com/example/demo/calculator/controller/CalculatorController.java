package com.example.demo.calculator.controller;

import com.example.demo.calculator.domain.CalculatorDTO;
import com.example.demo.calculator.service.CalculatorService;
import com.example.demo.calculator.service.CalculatorServiceImpl;

import java.util.Scanner;

public class CalculatorController {
    Scanner scanner = new Scanner(System.in);
    CalculatorDTO calculator = new CalculatorDTO();
    CalculatorService calculatorService = new CalculatorServiceImpl(); //인스턴스를 만드세요 = 생성자를만드세요

    public void calculate(){
        System.out.println("숫자 1");
        calculator.setNum(scanner.nextInt());
        System.out.println("연산자");
        calculator.setOpcode(scanner.next());
        System.out.println("숫자 2");
        calculator.setNum2(scanner.nextInt());
        //System.out.println("+");
        int result = 0;
        switch (calculator.getopcode()) {
            case "+":
                result = calculatorService.add(calculator);
                break;
            case "-":
                result = calculatorService.subract(calculator);
                break;
            case "*":
                result = calculatorService.multiple(calculator);
                break;
            case "/":
                result = calculatorService.divide(calculator);
                break;
            case "%":
                result = calculatorService.remain(calculator);
                break;
        }
        System.out.printf("%d %s %d = %d", calculator.getNum(),calculator.getopcode(),calculator.getNum2(),result);


    }
    public void sequence(){
        System.out.println("수열의 시작값");
        calculator.setNum(scanner.nextInt());
        System.out.println("수열의 마지막값");
        calculator.setNum2(scanner.nextInt());
        int[] arr =  calculatorService.sequence(calculator);
        for (int i = 0; i < arr.length;i++){
            System.out.println(arr[i] + "\t");
        }


    }

}
