package com.example.demo.util.serivce;

import com.example.demo.util.domain.UtilDTO;

import java.time.LocalDate;
import java.time.LocalTime;

public class UtilSerivceImpl implements UtilService{
    private UtilDTO util; //인스턴스 변수
    //public final UtilDTO utilDTO2 = new UtilDTO();//클래스 변수
    public UtilSerivceImpl(){
        this.util = new UtilDTO();
    }



    @Override
    public LocalDate today() {
        util.setToday(LocalDate.now());
        return util.getToday();
    }

    @Override
    public LocalTime currentTime() {
        util.setCurrentTime(LocalTime.now());
        return util.getCurrentTime();
    }

    @Override
    public String todayTime() {
        return String .format("%s %s", today(), currentTime());
    }
}
