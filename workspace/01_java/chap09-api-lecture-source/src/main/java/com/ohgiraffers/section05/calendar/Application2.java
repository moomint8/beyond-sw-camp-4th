package com.ohgiraffers.section05.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Application2 {
    public static void main(String[] args) {

        /* 수업목표. java.util.Calendar 클래스 사용법을 이해하고 사용할 수 있다. */
        /* 필기.
         *  Date형 대비 개선점
         *   1. timezone과 관련된 기능이 추가되었다.
         *   2. 윤년 관련 기능이 내부적으로 추가되었다.
         *   3. 날짜 및 시간 필드타입 개념을 추가해 불필요한 메소드명을 줄였다.
         */

        /* 설명. Calendar 자료형은 생성자를 통해 객체를 생성할 수 없다. */
//        Calendar cal = new Calendar();
        Calendar cal = Calendar.getInstance();
        System.out.println("cal = " + cal);

        Calendar cal2 = new GregorianCalendar();
        System.out.println("cal2 = " + cal2);

        int year = 1998;
        int month = 7;      // month 는 0~11, 인덱스 체계를 따랐기 때문, 따라서 입력하고자 하는 month - 1
        int dayOfMonth = 13;
        int hour = 9;
        int min = 25;
        int second = 30;    // 초의 범위는 0~61, 61초가 있는 이유는 윤초를 계산하기 위해서이다.

        Calendar birthDay = new GregorianCalendar(year, month, dayOfMonth, hour, min, second);
        System.out.println("birthDay = " + birthDay);

        /* 설명. GregorianCalendar 객체가 가진 값 확인 */
        System.out.println("태어난 해 : " + birthDay.get(1));
        System.out.println("태어난 해 : " + birthDay.get(Calendar.YEAR));
        System.out.println("태어난 월 : " + birthDay.get(2) + 1);   // get() 메소드로 반환받은 값에 +1을 해줘야 우리가 생각하는 월의 개념이 된다.
        System.out.println("태어난 월 : " + birthDay.get(Calendar.MONTH));
        System.out.println("태어난 일 : " + birthDay.get(5));
        System.out.println("태어난 일 : " + birthDay.get(Calendar.DAY_OF_MONTH));

        /* 설명. 요일에 대해 알아보자. */
        String day = "";
        switch (birthDay.get(Calendar.DAY_OF_WEEK)) {
            case Calendar.SUNDAY:
                day = "일";
                break;
            case Calendar.MONDAY:
                day = "월";
                break;
            case Calendar.TUESDAY:
                day = "화";
                break;
            case Calendar.WEDNESDAY:
                day = "수";
                break;
            case Calendar.THURSDAY:
                day = "목";
                break;
            case Calendar.FRIDAY:
                day = "금";
                break;
            case Calendar.SATURDAY:
                day = "토";
        }

        System.out.println("내 생일은 " + day + "요일입니다.");

        /* 설명. 하나씩 불러오기 */
        System.out.println("AM/PM: " + birthDay.get(Calendar.AM_PM));
        System.out.println("hourOfDay: " + birthDay.get(Calendar.HOUR_OF_DAY));
        System.out.println("hour: " + birthDay.get(Calendar.HOUR));
        System.out.println("min: " + birthDay.get(Calendar.MINUTE));
        System.out.println("sec: " + birthDay.get(Calendar.SECOND));


        /* 설명. SimpleDateFormat 활용 */
        /*참고. java.util.Date형으로 변환 후 활요해야 된다.*/
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss E요일");
        //String birthDayString = sdf.format(birthDay); //설명. 이렇게 쓰면 적용 안됨
        String birthDayString = sdf.format(new java.util.Date(birthDay.getTimeInMillis()));
        System.out.println("birthDayString = " + birthDayString);

    }
}
