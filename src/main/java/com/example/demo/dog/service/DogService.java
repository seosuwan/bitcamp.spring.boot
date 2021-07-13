package com.example.demo.dog.service;

import com.example.demo.dog.domain.DogDTO;

import java.util.List;

//barking, fetching wagging tail
public interface DogService {//{ 는 바디라고한다 Dog Service 파스칼표기법
    void add(DogDTO dog);
    int count();
    List<DogDTO> show();
//=====================================================================================
    String barking(String bark); // 속성값이 없기대문에 파라미터아넹 함수ㅏㄱ들어와야한다
    String fetching(String target);
    String waggingTail();





}
