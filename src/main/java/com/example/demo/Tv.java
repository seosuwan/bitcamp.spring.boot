package com.example.demo;
class TvControl {
    public static void main(String[] args) {

        Tv lgtv = new Tv("LG");
        Tv sTv = new Tv("samsung");
        Tv hTv = new Tv("HP", 2048);
        System.out.println(hTv.getCurrent_channel());  //정보 은닉 private메소드 선언 중요한 정보앞에쓰인다
        hTv.setCurrent_channel(123);
        hTv.setCurrent_channel(7);
        System.out.println(hTv.getCurrent_channel());
        System.out.println(sTv.resolution);

        /*int[] arr = hTv.getChannel();                  //1부터 100까지
        for(int i =0; i<arr.length; i++){
            System.out.println(arr[i]);
        }*/
    }
}


    public class Tv{
    //속성
    String model_name;                             //tv모델이름
    int[] channel;                                 //참조변수로 배열 사용
    private int current_channel;                           //현재채널
    int resolution;                                //화질
    boolean power;                                //전원 상태
    static int password;
    static void display() {
    }
    Tv(String tv_name) {  //생성자 오버로딩
        model_name = tv_name;
        resolution = 1024;
        power = false;
        current_channel = 0;
        channel = new int[100]; //참조변수 함수 new
        for (int i = 0; i < 100; i++) {  //반복문 for 의 기본형
            channel[i] = i + 1;
        }
    }
    //Getter setter
    public int getCurrent_channel() {
        return current_channel;
    }  //채널 10억 내보내셈  안대안대 할때 쓰는것

    public void setCurrent_channel(int current_channel) {
        if(current_channel > 100){
            System.out.println("입력오류 : 없는 채널입니다.");
        }else {
            this.current_channel = current_channel;
        }
    }
    Tv(String tv_name, int resolution) { //Tv()함수모양 입력받는곳
        model_name = tv_name;
        // resolution = resolution;
        this.resolution = resolution;
        power = false;
        current_channel = 0;
        channel = new int[100]; //참조변수 함수 new
        for (int i = 0; i < 100; i++) {  //for 의 기본형 *배열선언
            channel[i] = i + 1;
        }
    }         //getter setter 활용하기
        public int[] getChannel() {            //조회용
            return channel;
        }

        public void setChannel(int[] channel) {   //세팅용
            this.channel = channel;
        }
}



