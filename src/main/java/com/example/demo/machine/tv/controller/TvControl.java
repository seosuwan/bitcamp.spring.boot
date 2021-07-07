package com.example.demo.machine.tv.controller;

import com.example.demo.machine.tv.domain.Tv;

public class TvControl {
    public static void main(String[] args) {
        Tv lTv = new Tv("ss");
        Tv sTv = new Tv("samsung");
        Tv hTv = new Tv("HP", 2048);
        System.out.println(hTv.getCurrent_channel());  //정보 은닉 private메소드 선언 중요한 정보앞에쓰인다
        hTv.setCurrent_channel(123);
        hTv.setCurrent_channel(7);
        System.out.println(hTv.getCurrent_channel());

        /*int[] arr = hTv.getChannel();                  //1부터 100까지
        for(int i =0; i<arr.length; i++){
            System.out.println(arr[i]);
        }*/
    }
}



