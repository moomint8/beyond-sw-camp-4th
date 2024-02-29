package com.ohgiraffers.springdatajpa.common;

import org.springframework.data.domain.Page;

public class Pagination {

    /* 설명. PagingButtonInfo를 생성해서(버튼 생성에 필요한 정보들 생성) 반환하는 static 메소드 */
    public static PagingButtonInfo getPagingButtonInfo(Page page) {

        /* 설명. 이 때 매개변수로 넘어오는 Page 객체는 인덱스 개념을 가지고 있다. */
        int currentPage = page.getNumber() + 1;     // 인덱스 개념 -> 실제 페이지 번호의 개념으로 다시 변경
        int defaultButtonCount = 10;                // 한 페이지에 보일 최대 갯수
        int startPage;                              // 한 페이지에 보여질 첫 버튼
        int endPage;                                // 한 페이지에 보여질 마지막 버튼

        startPage = (int) (Math.ceil((double) currentPage / defaultButtonCount) - 1) * defaultButtonCount + 1;
        endPage = startPage + defaultButtonCount - 1;

        /* 설명. 나름의 예외 상황들에 대한 처리 부분 */
        if (page.getTotalPages() < endPage) {       // 총 페이지 수가 보여질 마지막 버튼보다 작으면
            endPage = page.getTotalPages();         // 총 페이지 수가 마지막 버튼이 된다.
        }

        if (page.getTotalPages() == 0) {            // 총 페이지 수가 0이더라도(1페이지를 다 채우지 못하거나 게시물이 없더라도)
            endPage = startPage;                    // 1페이지는 나오게 설정
        }

        return new PagingButtonInfo(currentPage, startPage, endPage);
    }
}
