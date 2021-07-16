package com.example.demo.himart.domain;

import lombok.Data;

public class PhoneApp {

    @Data public class Phone {
        protected String kind, companym, call;
        @Override public String toString() {
            return "집전화기{" +
                    "폰종류='" + kind + '\'' +
                    ", 제조사='" + companym + '\'' +
                    ", 통화='" + call + '\'' +
                    '}';
        }
    }


    @Data public class CellPhone extends Phone {
        protected boolean portable;
        protected String movie;
        @Override public String toString() {
            return "집전화기{" +
                    "폰종류='" + kind + '\'' +
                    ", 제조사='" + companym + '\'' +
                    ", 이동='" + movie + '\'' +
                    ", 통화='" + call + '\'' +
                    '}';

        }
    }


    @Data public class IPhone extends CellPhone {
        public final static String BRAND = "아이폰";
        protected String internet;
        @Override public String toString() {
            return "집전화기{" +
                    "폰종류='" + kind + '\'' +
                    ", 제조사='" + companym + '\'' +
                    ", 이동='" + movie + '\'' +
                    ", 통화='" + call + '\'' +
                    ", 검색='" + internet + '\'' +
                    '}';
        }
    }

    @Data public class GalaxyNote extends IPhone {
        public final static String BRAND = "갤럭시폰";
        protected String pencil;
        @Override public String toString() {
            return "집전화기{" +
                        "폰종류='" + kind + '\'' +
                        ", 제조사='" + companym + '\'' +
                        ", 이동='" + movie + '\'' +
                        ", 통화='" + call + '\'' +
                        ", 검색='" + internet + '\'' +
                        ", 펜슬='" + pencil + '\'' +
                        '}';

            }
        }
    }
