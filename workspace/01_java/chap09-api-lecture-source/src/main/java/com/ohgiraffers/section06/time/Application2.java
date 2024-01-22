package com.ohgiraffers.section06.time;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZonedDateTime;

public class Application2 {
    public static void main(String[] args) {

        /* 수업목표. time 패키지의 클래스들이 가지고 있는 필드값들을 확인할 수 있다. */
        LocalTime localTime = LocalTime.now();

        System.out.println("localTime = " + localTime);
        System.out.println("시간 = " + localTime.getHour());
        System.out.println("분 = " + localTime.getMinute());
        System.out.println("초 = " + localTime.getSecond());
        System.out.println("나노초 = " + localTime.getNano());

        LocalDate localDate = LocalDate.now();
        System.out.println("localDate = " + localDate);
        System.out.println("년 = " + localDate.getYear());
        System.out.println("월 = " + localDate.getMonth());
        System.out.println("월 숫자 = " + localDate.getMonthValue());
        System.out.println("월 중에 몇 번째 일 = " + localDate.getDayOfMonth());
        System.out.println("1년 중에 몇 번째 일 = " + localDate.getDayOfYear());
        System.out.println("한 주의 몇 번째 일 = " + localDate.getDayOfWeek());

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("zonedDateTime = " + zonedDateTime);
        System.out.println("zone 정보 = " + zonedDateTime.getZone());
        System.out.println("시차 = " + zonedDateTime.getOffset());
    }
}
