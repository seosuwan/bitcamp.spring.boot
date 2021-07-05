package com.example.demo;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Myobject {

    public static void main(String[] args){   //계산기 만들기
        System.out.println("숫자 1 ?");
        Scanner scanner = new Scanner(System.in);    //scanner 재사용성
        int num1 = scanner.nextInt();                   //먼저 출력하기전에 변수로 숫자 담아두기
        System.out.println("숫자 2 ?");
        int num2 = scanner.nextInt();
        int num3 = num1 + num2;
        System.out.printf("%d + %d = %d", num1, num2, num3);  //%변수라는뜻

       // char a = '1';     //스칼라 scalar 단수
       // String a2 = "1";  // 벡터 vector  복수

       /* System.out.println("숫자 1 ?");
        Scanner scanner1 = new Scanner(System.in);
        int num1 */
      }

}
