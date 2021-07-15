package com.example.demo.calculator.controller;

import com.example.demo.calculator.domain.CalculatorDTO;
import com.example.demo.calculator.service.CalculatorService;
import com.example.demo.calculator.service.CalculatorServiceImpl;
import com.example.demo.util.serivce.LambdaUtils;

import java.util.Scanner;

public class CalculatorController extends LambdaUtils {
    private CalculatorService calculatorService;

    public CalculatorController(){
        this.calculatorService = new CalculatorServiceImpl();
    }
    public void main() {
        Scanner scanner = new Scanner(System.in);
        while (true){
            print.accept("\n[메뉴] 0-종료 1-계산기 2-수열 3-구구단\n");
            switch (scanner.next()){
                case "0":return;
                case "1":calculate(scanner);
                case "2":sequence(scanner);
            }
        }
    }
    public void calculate(Scanner scanner) {
        CalculatorDTO calculator = new CalculatorDTO();
        print.accept("숫자 1");
        calculator.setNum(scanner.nextInt());
        print.accept("연산자");
        calculator.setOpcode(scanner.next());
        print.accept("숫자 2");
        calculator.setNum2(scanner.nextInt());
        int result = 0;
        switch (calculator.getOpcode()) {
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
        String s = String.format("%d %s %d = %d", calculator.getNum(), calculator.getOpcode(), calculator.getNum2(), result);
    }
    public void sequence(Scanner scanner){
        CalculatorDTO calculator = new CalculatorDTO();
        print.accept("수열의 시작값");
        calculator.setNum(scanner.nextInt());
        print.accept("수열의 마지막값");
        calculator.setNum2(scanner.nextInt());
        int[] arr = calculatorService.sequence(calculator);
        for (int i = 0; i < arr.length; i++) {
            print.accept(arr[i] + "\t");
            }
        }
    public void gugudan(Scanner scanner){

    }
}


