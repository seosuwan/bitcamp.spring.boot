package com.example.demo.calculator.domain;

public class CalculatorDTO {
    private int num;
    private int num2;
    private String opcode;

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum2() {
        return num2;
    }

    public void setOpcode(String opcode) {
        this.opcode = opcode;
    }

    public String getopcode() {
        return opcode;
    }

    @Override
    public String toString() {
        return String.format("%d %s %d = ", num ,opcode, num2);
    }
}