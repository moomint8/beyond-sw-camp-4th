package com.ohgiraffers.section01.run;

import com.ohgiraffers.section01.dto.BookDTO;

public class Application3 {
    public static void main(String[] args) {

        /* 수업목표. Object 클래스의 hashCode() 메소드 오버라이딩 목적을 이해하고 활용할 수 있다. */
        BookDTO book1 = new BookDTO(1, "홍길동전", "허균", 50000);
        BookDTO book2 = new BookDTO(1, "홍길동전", "허균", 50000);

        System.out.println("book1의 hashCode : " + book1.hashCode());
        System.out.println("book2의 hashCode : " + book2.hashCode());
    }
}
