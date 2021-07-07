package com.example.demo.constant.controller;

import com.example.demo.constant.domain.Constant;

public class Constantcontroller {
    public static void main(String[] args) {
        Constant c1 = new Constant(5.0);
        Constant c2 = new Constant(3.0);

        System.out.println(c1.area(c1));
    }
}




