package com.example.demo.calculator.controller;

import com.example.demo.calculator.domain.CalculatorDTO;
import com.example.demo.calculator.service.CalculatorService;
import com.example.demo.calculator.service.CalculatorServiceImpl;

import java.util.Scanner;

public class CalculatorController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculatorDTO calculator = new CalculatorDTO();
        CalculatorService calculatorService = new CalculatorServiceImpl(); //인스턴스를 만드세요 = 생성자를만드세요
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
            case "%":
                result = calculatorService.remain(calculator);
                break;
        }
        System.out.printf("%d %s %d = %d", calculator.getNum(),calculator.getopcode(),calculator.getNum2(),result);
    }

}
