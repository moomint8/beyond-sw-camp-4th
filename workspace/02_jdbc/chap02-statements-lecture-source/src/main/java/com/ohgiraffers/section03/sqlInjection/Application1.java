package com.ohgiraffers.section03.sqlInjection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static com.ohgiraffers.common.JDBCTemplate.close;
import static com.ohgiraffers.common.JDBCTemplate.getConnection;

public class Application1 {
    private static String empId = "200";
    private static String empName = "' OR 1=1 AND EMP_ID = '200";

    public static void main(String[] args) {
        Connection connection = getConnection();

        Statement statement = null;
        ResultSet resultSet = null;

        String query = "SELECT * FROM EMPLOYEE WHERE EMP_ID = '" + empId
                + "'AND EMP_NAME = '" + empName + "'";
        System.out.println("query = " + query);

        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);

            if (resultSet.next()) {
                System.out.println(resultSet.getString("EMP_NAME") + "님 환영합니다.");
            } else {
                System.out.println("회원 정보가 없습니다.");
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
