package com.example.demo._0707;

import java.util.Scanner;
//state(name, color, breed, hugry) and behavior (barking, fetching,wagging tail)
public class DogMain {
    public static void main(String[] args) {  //
        Scanner sc = new Scanner(System.in);
        Dog dog = new Dog();

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

class Dog{
    private String name;
    private String color;
    private String breed;
    private String hungry;

    public void setName(String name){  //Conaumer
        this.name = name;
    }
    public String getName(){    //Supplier
        return this.name;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return this.color;
    }
    public void setBreed(String breed){
        this.breed = breed;
    }
    public String getBreed(){
        return this.breed;
    }
    public void setHungry(String hungry){
        this.hungry = hungry;
    }
    public String getHungry(){
        return this.hungry;
    }

    @Override
    public String toString() {
        return String.format("내이름은 %s 나의 색은 %s 나는 %s입니당 나 지금 %s",getName(),getColor(),getBreed(),getHungry());
    }
}
