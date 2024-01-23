package com.ohgiraffers.section01.list.comparator;

import com.ohgiraffers.section01.list.dto.BookDTO;

import java.util.Comparator;

/* 설명. 우리가 원하는 필드의 원하는 정렬 기준을 정의하는 클래스(feat.Comparator 인터페이스) */
public class AscendingPrice implements Comparator<BookDTO> {        // Comparable 보다 우선 순위가 높다.

    /* 설명. 가격 오름차순을 위한 compare 메소드 오버라이딩 작성 */
//    @Override
//    public int compare(Object o1, Object o2) {
//        return ((BookDTO) o1).getPrice() - ((BookDTO) o2).getPrice();
//    }

    /* 설명. Comparator 인터페이스에 제네릭 추가 */
    @Override
    public int compare(BookDTO o1, BookDTO o2) {
        return o1.getPrice() - o2.getPrice();
    }
}
