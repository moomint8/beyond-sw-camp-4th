package com.ohgiraffers.section01.method;

public class Application8 {
    public static void main(String[] args) {

        /* 수업목표. static 메소드를 호출할 수 있다. */
//        System.out.println("10과 20의 합: " + Application8.sumTwoNumbers(10, 20));
        System.out.println("10과 20의 합: " + sumTwoNumbers(10, 20));          // 호출하는 static 메소드가 같은 클래스에
                                                                              // 존재하면 '클래스명.'을 생략할 수 있다.
    }

    public static int sumTwoNumbers(int first, int second) {
        return first + second;
    }
}
