package com.ohgiraffers.section02.enumtype;

public class Application {
    public static void main(String[] args) {

        /* 수업목표. 열거형(enum)을 이용하여 상수 열거 패턴의 단점을 해결하는 것을 이해할 수 있다. */
        /* 설명. 1. 열거 타입으로 선언된 인스턴스는 싱글톤으로 관리되며 인스턴스가 한 개임을 보장한다.(순서 개념의 인덱스가 아니라 인스턴스임) */
        Subjects subject1 = Subjects.JAVA;
        Subjects subject2 = Subjects.HTML;
        Subjects subject3 = Subjects.JAVA;

        if (subject1 == subject2) {
            System.out.println("두 과목은 같은 과목입니다.");
        } else {
            System.out.println("두 과목은 다른 과목입니다.");
        }

        /* 설명. 2. 단일 인스턴스임을 보장하기에 == 비교가 가능하다. */
        if (subject1 == subject1) {
            System.out.println("싱글톤이다.");
        }

        /* 설명. 3. toString()/name()을 이용하여 필드명을 문자열로 변경하기 쉽다.(feat.switch 안씀) */
        System.out.println(Subjects.JAVA.toString());
        System.out.println(Subjects.JAVA.name());

        /* 설명. 4. values()를 이용하여 상수값 배열을 반환받고 이를 이용하여 연속처리할 수 있다. */
        Subjects[] subjects = Subjects.values();
        for (Subjects s : subjects) {
            System.out.println(s.toString());
            System.out.println(s.ordinal());
            System.out.println(s.name());
            System.out.println();
        }

        /* 설명. 5. 타입 안전을 보장할 수 있다. */
        printSubjects(Subjects.JAVA);
//        printSubjects(0);     // Subjects 타입이 아니라서 에러 발생
    }

    private static void printSubjects(Subjects subjects) {
    }
}
