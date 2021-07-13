package com.example.demo.dog.domain;

import lombok.Data;

@Data //디폴트처리 lombok
public class DogDTO {
    private String name;
    private String color;
    private String breed;




    @Override
    public String toString() {
        return String.format("강아지이름은 %s 강아지 색은 %s 강아지 품종은 %s ",name,color,breed);
    }
}
