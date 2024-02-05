package com.ohgiraffers.section02.prepared;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static com.ohgiraffers.common.JDBCTemplate.close;
import static com.ohgiraffers.common.JDBCTemplate.getConnection;

public class Application1 {
    public static void main(String[] args) {
        Connection connection = getConnection();

        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            /* 설명. Statement와 달리 PreparedStatement는 생성 당시에 쿼리가 있어야 한다. */
            preparedStatement = connection.prepareStatement("SELECT EMP_ID, EMP_NAME FROM EMPLOYEE");
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                System.out.println(resultSet.getString("EMP_ID") +
                        ", " + resultSet.getString("EMP_NAME"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            close(resultSet);
            close(preparedStatement);
            close(connection);
        }
    }
}
