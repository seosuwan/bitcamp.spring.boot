package com.example.demo.util.controller;

import com.example.demo.util.domain.UtilDTO;
import com.example.demo.util.serivce.LambdaUtils;
import com.example.demo.util.serivce.UtilSerivceImpl;
import com.example.demo.util.serivce.UtilService;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class UtilController extends LambdaUtils {
    //UtilService utilService = new UtilSerivceImpl();
    private UtilService utilService;

    public  UtilController() {

        this.utilService = new UtilSerivceImpl();
    }
    public void main(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            print.accept("\n[MENU] 0-EXIT 1- 현재날짜 및 시간\n");
            switch (scanner.next()){
                case "0":return;
                case "1":print.accept(utilService.todayAndCurrentTime());
            }
        }
    }
}


