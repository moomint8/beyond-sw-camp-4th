package com.ohgiraffers.section06.time;

import java.time.*;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. time 패키지에서 제공하는 클래스들의 사용 용법을 이해할 수 있다. */
        LocalTime timeNow = LocalTime.now();
        LocalTime timeOf = LocalTime.of(18, 30, 20);
        System.out.println("timeNow = " + timeNow);
        System.out.println("timeOf = " + timeOf);

        LocalDate dateNow = LocalDate.now();
        LocalDate dateOf = LocalDate.of(2024, 1, 5);
        System.out.println("dateNow = " + dateNow);
        System.out.println("dateOf = " + dateOf);

        LocalDateTime dateTimeNow = LocalDateTime.now();
        LocalDateTime dateTimeOf = LocalDateTime.of(dateNow, timeNow);
        System.out.println("dateTimeNow = " + dateTimeNow);
        System.out.println("dateTimeOf = " + dateTimeOf);

        ZonedDateTime zonedDateTimeNow = ZonedDateTime.now();
        ZonedDateTime zonedDateTimeOf = ZonedDateTime.of(dateOf, timeOf, ZoneId.of("Asia/Seoul"));
        System.out.println("zonedDateTimeNow = " + zonedDateTimeNow);
        System.out.println("zonedDateTimeOf = " + zonedDateTimeOf);
    }
}
