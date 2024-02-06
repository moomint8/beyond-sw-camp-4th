package com.ohgiraffers.section02.update;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class MenuRepository {
    private String XML_PATH = "src/main/java/com/ohgiraffers/section01/insert/mapper/menu-mapper.xml";

    public int modifyMenu(Connection connection, Menu modifyMenu) {
        PreparedStatement preparedStatement = null;
        int result = 0;

        Properties properties = new Properties();

        try {
            properties.loadFromXML(new FileInputStream(XML_PATH));
//            System.out.println(properties.getProperty("updateMenu"));

            String query = properties.getProperty("updateMenu");

            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, modifyMenu.getMenuName());
            preparedStatement.setInt(2, modifyMenu.getMenuPrice());
            preparedStatement.setInt(3, modifyMenu.getMenuCode());

            result = preparedStatement.executeUpdate();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return result;
    }
}
