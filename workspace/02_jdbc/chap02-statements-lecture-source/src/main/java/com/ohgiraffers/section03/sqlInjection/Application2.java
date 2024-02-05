package com.ohgiraffers.section03.sqlInjection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static com.ohgiraffers.common.JDBCTemplate.close;
import static com.ohgiraffers.common.JDBCTemplate.getConnection;

public class Application2 {
    private static String empId = "200";
    private static String empName = "' OR 1=1 AND EMP_ID = '200";

    public static void main(String[] args) {
        Connection connection = getConnection();

        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        /* 설명.
         *  다음 쿼리는 실제 다음과 같이 작성된다.
         *  SELECT * FROM EMPLOYEE WHERE EMP_ID = '200' AND EMP_NAME = ''' OR 1=1 AND EMP_ID = ''200';
         *  PreparedStatement는 placeholder로 입력되는 값에 single quotation(')이 있다면
         *  single quotation을 하나 더 붙여주고, setString으로 값이 들어간다면 양 옆에도 single quotation을
         *  붙여준다.
         */
        String query = "SELECT * FROM EMPLOYEE WHERE EMP_ID = ? AND EMP_NAME = ?";

        try {
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, empId);
            preparedStatement.setString(2, empName);

            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                System.out.println(resultSet.getString("EMP_NAME") + "님 환영합니다.");
            } else {
                System.out.println("회원 정보가 없습니다.");
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
