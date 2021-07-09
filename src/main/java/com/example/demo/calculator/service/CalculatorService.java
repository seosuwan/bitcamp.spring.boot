package com.example.demo.calculator.service;

import com.example.demo.calculator.domain.CalculatorDTO;

public interface CalculatorService { //기능
    int add(CalculatorDTO calculator);
    int subract(CalculatorDTO calculator);
    int  multiple(CalculatorDTO calculator);
    int  divide(CalculatorDTO calculator);
    int  remain(CalculatorDTO calculator);
    int[] sequence(CalculatorDTO calculator);




}
