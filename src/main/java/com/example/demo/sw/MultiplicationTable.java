package com.example.demo.sw;

public class MultiplicationTable<MultiplicationTableTest> {
    public static void main(String[] args) {
        for (int g = 1; g < 6; g++){
            System.out.print( g + "단을 출력." + '\t');
        }
        System.out.println();
       for(int i = 1; i < 10; i++) {
            for (int j = 1; j < 6; j++) {
                System.out.print(j + "X" + i + "=" + i * j +"\t\t");
            }
           System.out.println();

        }
         System.out.println();
        for (int g = 6; g < 10; g++){
            System.out.print( g + "단을 출력." + '\t');
        }
        System.out.println();
        for(int i = 1; i < 10; i++) {

            //System.out.print( + "단을 출력합니다." + '\t');
            for (int j = 6; j < 10; j++) {
                System.out.print(j + "X" + i + "=" + i * j +"\t\t");
            }
            System.out.println();

        }
        System.out.println("good!!!");
    }
}








