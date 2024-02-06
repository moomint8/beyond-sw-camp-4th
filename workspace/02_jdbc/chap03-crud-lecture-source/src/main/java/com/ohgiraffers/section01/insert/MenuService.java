package com.ohgiraffers.section01.insert;

import java.sql.Connection;

import static com.ohgiraffers.common.JDBCTemplate.*;

/* 설명. Service 계층은 Connection 객체 생성 및 소멸(close)과 비즈니스 로직, 트랜잭션(commit, rollback) 처리 */
public class MenuService {
    public void registMenu(Menu registMenu) {
        Connection connection = getConnection();

        MenuRepository menuRepository = new MenuRepository();
        int result = menuRepository.registMenu(connection, registMenu);

        if (result > 0) {
//            connection.commit();      // try/catch 로 지저분해지는 것을 막기 위해 JDBCTemplate에 static 메소드로 만들어 쓰기
            commit(connection);
        } else {
            rollback(connection);
        }

        close(connection);
    }
}
