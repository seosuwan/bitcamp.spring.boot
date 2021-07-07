package com.example.demo.constant.domain;

public class Constant {
    //상수
    double radius;
    final double PI = 3.141592;

    public Constant(double radius) {
        this.radius = radius;
    }

    //기능
    public double area(double rad) {
        double result = rad * rad * PI;
        return result;
    }

    public double area(Constant cir) {
        double result = cir.radius * cir.radius * PI;
        return result;
    }
}
