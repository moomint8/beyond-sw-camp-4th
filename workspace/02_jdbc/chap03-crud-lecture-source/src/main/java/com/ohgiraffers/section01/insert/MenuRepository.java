package com.ohgiraffers.section01.insert;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class MenuRepository {
    public int registMenu(Connection connection, Menu registMenu) {
        PreparedStatement preparedStatement = null;
        int result = 0;

        Properties property = new Properties();

        /* 설명. 쿼리는 XML 파일로부터 읽어와서 활용할 것 */
        try {
            property.loadFromXML(
                    new FileInputStream("src/main/java/com/ohgiraffers/section01/insert/mapper/menu-mapper.xml"));
            String query = property.getProperty("insertMenu");

            System.out.println(query);

            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, registMenu.getMenuName());
            preparedStatement.setInt(2, registMenu.getMenuPrice());
            preparedStatement.setInt(3, registMenu.getCategoryCode());
            preparedStatement.setString(4, registMenu.getOrderAbleStatus());

            result = preparedStatement.executeUpdate();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return result;
    }
}
