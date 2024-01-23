package com.ohgiraffers.section01.list.run;

import com.ohgiraffers.section01.list.comparator.DescendingAuthor;
import com.ohgiraffers.section01.list.dto.BookDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Application2 {
    public static void main(String[] args) {

        /* 수업목표. ArrayList에서 관리되는 자료의 정렬 기준을 이용할 수 있다. *//*  */
        /* 목차. 1. Comparable 인터페이스 구현 방법 활용 */
        List<BookDTO> bookList = new ArrayList<>();
        bookList.add(new BookDTO((1), "홍길동전", "허균", 50_000));
        bookList.add(new BookDTO((2), "목민심서", "정약용", 30_000));
        bookList.add(new BookDTO((3), "동의보감", "허균", 40_000));
        bookList.add(new BookDTO((4), "삼국사기", "김부식", 46_000));
        bookList.add(new BookDTO((5), "삼국유서", "일연", 58_000));

//        for (int i = 0; i < bookList.size(); i++) {
//            System.out.println(bookList.get(i));
//        }

        /* 설명. Collections가 제공하는 sort 사용 시 */
//        Collections.sort(bookList);     // BookDTO의 compareTo를 기준으로 정렬
//        Collections.sort(bookList, new AscendingPrice());
        Collections.sort(bookList, new DescendingAuthor());

        /* 설명. ArrayList가 제공하는 sort 사용 시(Comparator 기준만 가능) */
        bookList.sort(new DescendingAuthor());

        for (BookDTO book : bookList) {
            System.out.println(book);
        }
    }
}
