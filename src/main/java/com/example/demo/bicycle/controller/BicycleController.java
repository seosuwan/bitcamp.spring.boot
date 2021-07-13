package com.example.demo.bicycle.controller;

import com.example.demo.bicycle.domain.BicycleDTO;
import com.example.demo.bicycle.service.BicycleService;
import com.example.demo.bicycle.service.BicycleServiceImpl;

import java.util.List;
import java.util.Scanner;

//gear compay speed
public class BicycleController {
    private BicycleService bicycleService;
    private BicycleDTO bicycleDTO;

    public BicycleController(){
        this.bicycleService = new BicycleServiceImpl();
        this.bicycleDTO = new BicycleDTO();
    }
    public void add(BicycleDTO bicycle) {
        bicycleService.add(bicycle);
    }
    public int count() {
        return bicycleService.count();
    }
    public void show() {
        System.out.println("바이크 수는"+ bicycleService.count());
        System.out.println(bicycleService.show());
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
