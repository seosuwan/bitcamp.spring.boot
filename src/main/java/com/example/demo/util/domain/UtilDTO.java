package com.example.demo.util.domain;


import lombok.Data; //디폴트처리 lombok

import java.time.LocalDate;
import java.time.LocalTime;

@Data
public class UtilDTO {
    private LocalDate today;
    private LocalTime currentTime;







}
