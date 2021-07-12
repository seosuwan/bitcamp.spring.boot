package com.example.demo.dog.controller;

import com.example.demo.dog.domain.DogDTO;
import com.example.demo.dog.service.DogService;
import com.example.demo.dog.service.DogServiceImpl;

import java.util.Scanner;

//state(name, color, breed, hugry) and behavior (barking, fetching,wagging tail)
public class DogController {
    private DogService dogService;
    private DogDTO dog;
    private Scanner sc;
    public DogController(){
        this.dogService = new DogServiceImpl();
        this.dog = new DogDTO();
        this.sc = new Scanner(System.in);
    }


    public void DogCotroller() {
        System.out.println("내 이름은");
        dog.setName(sc.next());

        System.out.println("내 털 색깔은");
        dog.setColor(sc.next());

        System.out.println("나의 품종은");
        dog.setBreed(sc.next());

        System.out.println("나는 지금 배가");
        dog.setHungry(sc.next());


        System.out.print(dog.toString());
    }


}
