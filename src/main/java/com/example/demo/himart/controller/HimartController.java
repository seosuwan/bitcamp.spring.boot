package com.example.demo.himart.controller;

import com.example.demo.himart.domain.PhoneApp;
import com.example.demo.himart.service.HimartSerivceImpl;
import com.example.demo.himart.service.HimartService;
import com.example.demo.util.serivce.LambdaUtils;

import java.util.Scanner;


public class HimartController extends LambdaUtils {
        private final HimartService himartService;
        public HimartController() {
            himartService = new HimartSerivceImpl();
        }
        public void main() {
            Scanner scanner = new Scanner(System.in);

            while (true) {
                print.accept("[MENU] 0-EXIT 1-스마트폰");
                switch (scanner.next()) {
                    case "0":
                        return;
                    case "1":
                        while (true){
                            print.accept("");
                            switch (scanner.next()){
                                case "0":return;
                                case "1":break;
                                case "2":break;
                                case "3":break;
                                case "4":break;
                            }
                        }

                    case "2":


                        break;
                    case "3":

                        break;
                    case "4":
                        }
                }
            }
        public void phoneMain(Scanner scanner){
            PhoneApp p1 = new PhoneApp();
            PhoneApp.Phone phone = null;
            PhoneApp.CellPhone cellPhone = null;
            PhoneApp.IPhone iPhone = null;
            PhoneApp.GalaxyNote galaxyNote = null;

            while (true){
                print.accept("[MENU] 0-EXIT 1-집전화 2-휴대폰 3-아이폰 4-갤럭시");
                switch (scanner.next()){
                    case "0":return;
                    case "1":
                       phone = p1.new Phone();
                       phone.setCall("나 집이야...");
                       phone.setKind("집전화");
                       phone.setCompanym("금성");
                       print.accept(phone.toString());
                        break;
                    case "2":
                        cellPhone = p1.new CellPhone();
                        cellPhone.setCall("나 밖이야...");
                        cellPhone.setKind("핸드폰");
                        cellPhone.setCompanym("LG");
                        cellPhone.setMovie("이동");
                        print.accept(cellPhone.toString());
                        break;
                    case "3":
                        iPhone = p1.new IPhone();
                        iPhone.setCall("나 아이폰샀지롱...");
                        iPhone.setKind(PhoneApp.IPhone.BRAND);
                        iPhone.setCompanym("애플");
                        iPhone.setInternet("구글링 중...");
                        iPhone.setMovie("이동");
                        print.accept(iPhone.toString());
                        break;
                    case "4":
                        galaxyNote = p1.new GalaxyNote();
                        galaxyNote.setCall("나 갤럭시 샀다...");
                        galaxyNote.setInternet("네이버 보는즁..");
                        galaxyNote.setKind(PhoneApp.IPhone.BRAND);
                        galaxyNote.setPencil("펜도있다...");
                        galaxyNote.setCompanym("삼성");
                        print.accept(galaxyNote.toString());
                        break;
                }
            }
        }
    }


