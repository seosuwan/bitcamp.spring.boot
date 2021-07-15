package com.example.demo.bicycle.controller;

import com.example.demo.bicycle.domain.BicycleDTO;
import com.example.demo.bicycle.service.BicycleService;
import com.example.demo.bicycle.service.BicycleServiceImpl;
import com.example.demo.util.serivce.LambdaUtils;

import java.util.List;
import java.util.Scanner;

//gear compay speed
public class BicycleController extends LambdaUtils {
    private BicycleService bicycleService;
    private BicycleDTO bicycleDTO;
    public BicycleController(){
        this.bicycleService = new BicycleServiceImpl();
        this.bicycleDTO = new BicycleDTO();
    }
    public void main(){
        Scanner scanner = new Scanner(System.in);
        BicycleDTO bicycle = null;
        print.accept("[메뉴]: 0-종료 1-모델추가 2-카운트 3-목록");
        while (true){
            switch (scanner.next()){
                case "0":return;
                case "1":
                    print.accept("모델명 입력");
                    bicycle.setCompany(scanner.next());
                    print.accept("스피드 입력");
                    bicycle.setSpeed(scanner.nextInt());
                    print.accept("기어 입력");
                    bicycle.setGear(scanner.nextInt());
                    break;
                case "2":
                    print.accept(string.apply(bicycleService.count()));
                    break;
                case "3":
                    List<BicycleDTO> list = (List<BicycleDTO>)bicycleService.show();
                    for (BicycleDTO b : list){
                        print.accept(b.toString());
                    }
                    break;
            }
        }
    }

    public void add(BicycleDTO bicycle) {
        bicycleService.add(bicycle);
    }
    public int count() {
        return bicycleService.count();
    }
    public void show() {
        print.accept("바이크 수는"+ bicycleService.count());
        print.accept(bicycleService.show().toString());
    }
    public String changingGear(String gear) {
        return null;
    }
    public String changingPedalCadence(String pedalcadence) {
        return null;
    }
    public String applyingBrakes(String brakes) {
        return null;
    }
}
