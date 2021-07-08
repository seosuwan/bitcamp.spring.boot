package com.example.demo.dog.domain;

public class DogDTO {
    private String name;
    private String color;
    private String breed;
    private String hungry;

    public void setName(String name){  //Conaumer
        this.name = name;
    }
    public String getName(){    //Supplier
        return name;
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
