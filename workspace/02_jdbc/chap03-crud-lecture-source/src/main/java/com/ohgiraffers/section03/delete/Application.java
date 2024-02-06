package com.ohgiraffers.section03.delete;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static com.ohgiraffers.common.JDBCTemplate.*;

public class Application {
    public static void main(String[] args) {
        Connection connection = getConnection();

        PreparedStatement preparedStatement = null;
        int result = 0;

        /* 설명. soft delete */
        String query1 = "UPDATE TBL_MENU SET ORDERABLE_STATUS = 'N' WHERE MENU_CODE = ?";

        /* 설명. hard delete */
        String query2 = "DELETE FROM TBL_MENU WHERE MENU_CODE = ?";

        try {
            preparedStatement = connection.prepareStatement(query2);
            preparedStatement.setInt(1, 23);

            result = preparedStatement.executeUpdate();

            if (result > 0) {
                commit(connection);
            } else {
                rollback(connection);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            close(preparedStatement);
            close(connection);
        }

        System.out.println("result = " + result);
    }
}
