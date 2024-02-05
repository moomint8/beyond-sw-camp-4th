package com.ohgiraffers.section01.connection;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Application2 {
    /* 수업목표. properties 를 이용해 Connection 객체를 생성할 수 있다. */
    public static void main(String[] args) {
        Properties properties = new Properties();
        Connection connection = null;

        try {
            properties.load(
                    new FileReader("src/main/java/com/ohgiraffers/section01/connection/jdbc-config.properties")
            );
            System.out.println("properties = " + properties);
            String driver = properties.getProperty("driver");
            String url = properties.getProperty("url");
            String user = properties.getProperty("user");
            String password = properties.getProperty("password");

            Class.forName(driver);
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("connection = " + connection);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            close(connection);
        }
    }

    private static void close(Connection connection) {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
