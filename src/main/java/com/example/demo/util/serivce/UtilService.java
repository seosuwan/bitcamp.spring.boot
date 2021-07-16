package com.example.demo.util.serivce;

import com.example.demo.util.domain.UtilDTO;

import java.time.LocalDate;
import java.time.LocalTime;

public interface UtilService {
    LocalDate today();
    LocalTime currentTime();
    public String todayTime();
    String randoNumbers(int digits,boolean allowZeroValue);
    String todayAndCurrentTime();

}
