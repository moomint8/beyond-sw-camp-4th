package com.ohgiraffers.section01.statement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import static com.ohgiraffers.common.JDBCTemplate.close;
import static com.ohgiraffers.common.JDBCTemplate.getConnection;

public class Application2 {

    /* 설명. 사번을 입력받아 한 명의 사원을 조회하는 기능 */
    public static void main(String[] args) {

        Connection connection = getConnection();
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            statement = connection.createStatement();

            /* 설명. 사용자로부터 조회하고자 하는 사원의 사번을 입력받음 */
            Scanner scanner = new Scanner(System.in);
            System.out.print("사번을 입력하세요 : ");
            int empId = scanner.nextInt();

            String query = "SELECT EMP_ID, EMP_NAME FROM EMPLOYEE WHERE EMP_ID = '" + empId + "'";
            System.out.println("query = " + query);

            resultSet = statement.executeQuery(query);

            if (resultSet.next()) {
                System.out.println(resultSet.getString("EMP_ID")
                        + resultSet.getString("EMP_NAME"));
            } else {
                System.out.println("해당 사원의 조회 결과가 없습니다.");
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
