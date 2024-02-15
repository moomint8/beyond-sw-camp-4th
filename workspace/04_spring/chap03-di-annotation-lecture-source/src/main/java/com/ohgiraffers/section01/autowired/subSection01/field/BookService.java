package com.ohgiraffers.section01.autowired.subSection01.field;

import com.ohgiraffers.section01.common.BookDAO;
import com.ohgiraffers.section01.common.BookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    /* 설명.
     *  아래의 세 가지는 ComponentScan 범위 안에 어노테이션들이 달렸을 때 유효하다.
     *   1. @Service에 의해서 BookService 타입의 bookService bean이 관리된다.
     *   2. BookDAOImpl에 있는 @Repository에 의해서 bookDAOImpl bean이 관리된다.(BookDAO 타입이기도 하다.)
     *   3. @Autowired에 의해서 BookDAO 타입의 빈이 BookService의 필드인 bookDAO 필드에 주입된다.(대입된다.)
     *
     * 설명.
     *  BookDAO 타입의 다른 클래스들이 있으면 ABC 순으로 첫 번째인 클래스를 주입한다.
     *  만약 다른 클래스들도 같이 담고 싶다면 컬렉션을 이용하면 된다.
     */
    @Autowired
    private BookDAO bookDAO;    // ComponentScan 범위 안에 있는 BookDAO 타입의 bean이 대입됨

    public BookService() {
        System.out.println("BookService 기본 생성자 호출됨...");
    }

    /* 설명. 도서 목록 전체 조회 */
    public List<BookDTO> findAllBook() {
        return bookDAO.findAllBook();
    }

    /* 설명. 도서 번호로 검색 후 출력 확인 */
    public BookDTO searchBookBySequence(int sequence) {
        return bookDAO.searchBookBySequence(sequence);
    }
}
