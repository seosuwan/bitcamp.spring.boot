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
    @Override
    public String randoNumbers(int digits, boolean allowZeroValue) {
        //Math.random() 클래스 메소드 앞에 static이 붙는다
        //Random random = new Random()
        //random.nextInt(1000) 인스턴스 메소드
        String fitst = "", result = "";
        fitst += allowZeroValue ? ((int) (Math.random()*10)) : ((int) (Math.random()*9 +1));
        for(int i = 0; i<digits;i++){
            result += (int)(Math.random() * 10) ;
        }
        return fitst + result;
    }

    @Override
    public String todayAndCurrentTime() {
        return String.format("%s %s",today(),currentTime());
    }


}
