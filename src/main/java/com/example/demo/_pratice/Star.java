package com.example.demo._pratice;

import java.util.Scanner;

public class Star {
    public static void main(String[] args) {
        int num = 10;
        for (int i = 0; i < num; i++) {
            for (int j = 1; j < num - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i * 2 + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}