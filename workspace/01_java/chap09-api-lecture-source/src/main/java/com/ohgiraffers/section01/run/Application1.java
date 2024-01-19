package com.ohgiraffers.section01.run;

import com.ohgiraffers.section01.dto.BookDTO;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. Object 클래스의 toString() 메소드 오버라이딩 목적을 이해하고 활용할 수 있다. */
        BookDTO book1 = new BookDTO(1, "홍길동전", "허균", 50000);
        BookDTO book2 = new BookDTO(2, "목민심서", "정약용", 30000);
        BookDTO book3 = new BookDTO(2, "목민심서", "정약용", 30000);

        /* 설명. 각 인스턴스의 toString()을 호출하면 각 인스턴스가 가진 필드값을 문자열로 반환한다. */
        System.out.println(book1.toString());
        System.out.println(book2.toString());
        System.out.println(book3.toString());

        /* 설명. 참조 자료형 변수를 print 또는 println으로 출력하면 해당 객체의 toString()을 자동호출한다. */
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
    }
}
