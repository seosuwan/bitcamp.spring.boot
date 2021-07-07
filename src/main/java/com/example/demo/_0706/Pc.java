package com.example.demo._0706;
class PcControl{   //클래스
    public static void main(String[] args) {
        Pc aPc = new Pc("Macbook");
        Pc sPc = new Pc("Samsung");
        Pc asuspc = new Pc(10,"yello",100);

        System.out.println(sPc.model_number);

    }


}

public class Pc {  //
    int model_number;//pc model
    String color_name;//pc color
    boolean power;//pc on off
    int price;//pc price

    Pc(int pc_model, String a,int b) {
        model_number = pc_model;
        color_name = a;
        power = false;
        price = b;
    }

    Pc(String a){
        model_number = 100;
        color_name = a;
        power = false;
        price = 10000;
    }

}




