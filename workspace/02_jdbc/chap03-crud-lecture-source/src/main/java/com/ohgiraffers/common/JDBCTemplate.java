package com.ohgiraffers.common;

import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

/* 설명. JDBC를 위한 메소드만 따로 모듈화(Connection 객체 생성, close 메소드 처리(Connection, Statement, PreparedStatement) */
public class JDBCTemplate {
    public static Connection getConnection() {
        Connection connection = null;
        Properties properties = new Properties();

        try {
            properties.load(new FileReader
                    ("src/main/java/com/ohgiraffers/config/connection-info.properties"));
            String driver = properties.getProperty("driver");
            String url = properties.getProperty("url");

            Class.forName(driver);

            /* 설명. 이번에는 'user'라는 키와 'password'라는 키 값을 지닌 properties 객체를 넘겨주고 Connectiom 객체 생성 */
            connection = DriverManager.getConnection(url, properties);

            /* 설명. DML(insert, update, delete) 실행 시 커밋을 수동으로 하겠다는 설정 */
            connection.setAutoCommit(false);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        /* 설명. 이번에는 close 메소드를 여기서 호출하지 않는다.(해당 DBMS와 연결할 수 있는 Connection 반환만 해당되게 작성) */

        return connection;
    }

    public static void close(Connection connection) {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void close(Statement statement) {
        try {
            if (statement != null && !statement.isClosed()) {
                statement.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void close(ResultSet resultSet) {
        try {
            if (resultSet != null && !resultSet.isClosed()) {
                resultSet.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void commit(Connection connection) {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.commit();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void rollback(Connection connection) {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.rollback();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}