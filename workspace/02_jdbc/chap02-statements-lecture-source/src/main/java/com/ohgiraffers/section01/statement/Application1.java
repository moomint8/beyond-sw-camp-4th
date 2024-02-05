package com.ohgiraffers.section01.statement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static com.ohgiraffers.common.JDBCTemplate.close;
import static com.ohgiraffers.common.JDBCTemplate.getConnection;

public class Application1 {
    public
    static void main(String[] args) {

        /* 설명. 트랜잭션 처리를 위한 DBMS 연동용 Connection 객체 생성 */
        Connection connection = getConnection();

        /* 설명. 해당 Connection을 통해 트랜잭션 처리(비즈니스 로직 수행, CRUD) */
        Statement statement = null;     // 쿼리를 운반하고 결과를 반환하는 객체
        ResultSet resultSet = null;     // 조회의 결과 반환되는 객체

        try {
            statement = connection.createStatement();

            /* 설명. 쿼리의 결과인 다중행/단일행을 반환받은 ResultSet */
            resultSet = statement.executeQuery("SELECT * FROM EMPLOYEE");

            /* 설명. resultSet.next() 한 행씩 확인 */
            while (resultSet.next()) {      // 이 반복문의 조회의 결과 행만큼 반복

                /* 설명. 반복문 안에서의 resultSet은 단일행으로 해석할 것! */
                System.out.println(resultSet.getString("EMP_NAME")
                        + ", " + resultSet.getInt("SALARY"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            close(resultSet);
            close(statement);
            close(connection);
        }
    }
}
