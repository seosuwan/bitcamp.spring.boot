package com.example.demo.util.controller;

import com.example.demo.util.domain.UtilDTO;
import com.example.demo.util.serivce.UtilSerivceImpl;
import com.example.demo.util.serivce.UtilService;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class UtilController {
    //UtilService utilService = new UtilSerivceImpl();
    private UtilService utilService;

    public  UtilController() {
        this.utilService = new UtilSerivceImpl();
    }
}


