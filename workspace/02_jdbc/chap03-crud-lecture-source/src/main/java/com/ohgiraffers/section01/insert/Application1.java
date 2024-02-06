package com.ohgiraffers.section01.insert;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static com.ohgiraffers.common.JDBCTemplate.close;
import static com.ohgiraffers.common.JDBCTemplate.getConnection;

public class Application1 {
    public static void main(String[] args) {
        Connection connection = getConnection();
        PreparedStatement preparedStatement = null;

        /* 설명.
         *  DML(insert, update, delete) 작업 시에는 반환 결과가 int 값이 된다.(ResultSet을 사용하지 않는다.)
         *  그리고 기존의 조회일 때는 executeQuery()를 사용했지만 DML 작업 시에는 executeUpdate()를 사용한다.
         */
        int result = 0;

        String query = "INSERT INTO TBL_MENU (MENU_NAME, MENU_PRICE, CATEGORY_CODE, ORDERABLE_STATUS)" +
                "VALUES(?, ?, ?, ?)";

        try {
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, "봉골레청국장");
            preparedStatement.setInt(2, 5000);
            preparedStatement.setInt(3, 4);
            preparedStatement.setString(4, "Y");

            /* 설명.
             *  혹시라도 기존의 테이블에서 auto_increment 값이 증가되어 있다면 다시 줄이고자 할 때 잘 못 들어간 뒤의 값을 지우고
             *  auto_increment를 원하는 값까지 초기화 후 insert를 해야한다.
             *  (ex: 100번대부터 insert가 될 경우)
             *  DELETE FROM tbl_menu WHERE menu_code > 99;
             *  alter table tbl_menu auto_increment = 24;
             *  INSERT INTO tbl_menu(menu_name, menu_price, category_code, orderable_status)
             *   VALUES('봉골레 청국장', 5000, 4, 'Y');
             *  SELECT * FROM tbl_menu ORDER BY 1 DESC;
             */
            result = preparedStatement.executeUpdate();     // 자동 커밋 상태에서는 executeUpdate()를 하면 자동 커밋된다.(feat. 수동 커밋 변환)

            if (result > 0) {
                System.out.println("insert 결과 : " + result + ", 수동 커밋하기!");
                connection.commit();
            } else {
                connection.rollback();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            close(preparedStatement);
            close(connection);
        }
    }
}
