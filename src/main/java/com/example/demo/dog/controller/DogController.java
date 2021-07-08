package com.example.demo.dog.controller;

import com.example.demo.dog.domain.DogDTO;

import java.util.Scanner;

//state(name, color, breed, hugry) and behavior (barking, fetching,wagging tail)
public class DogController {
    public static void main(String[] args) {  //
        Scanner sc = new Scanner(System.in);
        DogDTO dog = new DogDTO();

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
