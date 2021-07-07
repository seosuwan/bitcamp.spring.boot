package com.example.demo._0707;

import java.util.Scanner;
//gear compay speed
public class Bicycle {
    public static void main(String[] args) {
        Scanner bc = new Scanner(System.in);
        BicyclesA aa = new BicyclesA();

        System.out.println("이 바이크 회사는");
        aa.setCompany(bc.next());
        System.out.println("스피드는");
        aa.setSpeed(bc.nextInt());
        System.out.println("기어는 총");
        aa.setGear(bc.nextInt());

        System.out.print(aa.toString());


    }

}

class BicyclesA{
    private String company;
    private int gear;
    private int speed;

    public void setCompany(String company){
        this.company = company;
    }
    public String getCompany(){
        return company;
    }
    public void setGear(int gear){
        this.gear = gear;
    }
    public int getGear(){
        return gear;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
    public int getSpeed(){
        return speed;
    }

    @Override
    public String toString() {
        return String.format("바이크회사는 %s 스피드는 %d 기어는 %d",getCompany(), getSpeed(), getGear());
    }
}