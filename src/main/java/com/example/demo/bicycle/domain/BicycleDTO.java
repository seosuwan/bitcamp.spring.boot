package com.example.demo.bicycle.domain;

import lombok.Data;

@Data
public class BicycleDTO {
    private String company;  //멤버변수가 메인으로 가면 인스턴스 변수
    private int gear;
    private int speed;



    @Override
    public String toString() {
        return String.format("바이크회사는 %s 스피드는 %d 기어는 %d단입니다",getCompany(), getSpeed(), getGear());
    }
}
