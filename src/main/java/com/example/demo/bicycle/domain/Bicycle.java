package com.example.demo.bicycle.domain;

public class Bicycle {
    private String company;  //멤버변수가 메인으로 가면 인스턴스 변수
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
