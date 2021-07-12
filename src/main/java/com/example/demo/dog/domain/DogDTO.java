package com.example.demo.dog.domain;

import lombok.Data;

@Data //디폴트처리 lombok
public class DogDTO {
    private String name;
    private String color;
    private String breed;
    private String hungry;



    @Override
    public String toString() {
        return String.format("내이름은 %s 나의 색은 %s 나는 %s입니당 나 지금 %s",getName(),getColor(),getBreed(),getHungry());
    }
}
