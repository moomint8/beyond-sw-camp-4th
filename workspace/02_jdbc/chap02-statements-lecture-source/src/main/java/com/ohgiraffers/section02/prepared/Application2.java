package com.ohgiraffers.section02.prepared;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import static com.ohgiraffers.common.JDBCTemplate.getConnection;

/* 설명.
 *  PreparedStatement는 Statement와 달리 Placeholder("?")를 사용한 쿼리를 파싱하고 캐싱하여 다시 재해석하는 과정을 생략함으로
 *  인해 불완전하게 작성된 쿼리 실행의 경우 Statement 보다 빠르다.
 */
public class Application2 {
    public static void main(String[] args) {
        Connection connection = getConnection();

        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        Scanner scanner = new Scanner(System.in);
        System.out.print("사번을 입력하세요 : ");
        String empId = scanner.nextLine();
        String entYn = "N";

        /* 설명. PreparedStatement는 Statement 때와 달리 placeholder("?")를 활용한 하나의 문자열 형태로 쿼리 작성 가능 */
        String query = "SELECT EMP_ID, EMP_NAME FROM EMPLOYEE WHERE EMP_ID = ? AND ENT_YN = ?";

        try {
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, empId);
            preparedStatement.setString(2, entYn);

            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                System.out.println(resultSet.getString("EMP_ID")
                        + ", " + resultSet.getString("EMP_NAME"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
