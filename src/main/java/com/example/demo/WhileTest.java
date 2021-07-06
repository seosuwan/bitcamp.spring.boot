package com.example.demo;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class WhileTest {
    public static void main(String[] args) {
      /*  int total = 0;
        int i = 1;
        while (i <= 100){
            total = total + i;
            System.out.println("누적합계" + total);
            System.out.println(i);
            i++;
        }
        System.out.println("최종합계" + total);
    }*/
        int sum = 0;   //조건이 더 중요할때 while문을 쓴다.
        /*int i = 0;
        while (i <= 100) {
            sum += i;
            i++;
        }
        System.out.println(sum);*/
        for (int i = 0; i <= 100; i++) //for문 횟수
            sum += i;
        System.out.println(sum);
    }
}







