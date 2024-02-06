package com.ohgiraffers.section02.update;

import java.sql.Connection;

import static com.ohgiraffers.common.JDBCTemplate.*;

public class MenuService {

    public void modifyMenu(Menu modifyMenu) {
        Connection connection = getConnection();

        MenuRepository repository = new MenuRepository();
        int result = repository.modifyMenu(connection, modifyMenu);
        if (result > 0) {
            commit(connection);
            System.out.println("Menu update success");
        } else {
            rollback(connection);
            System.out.println("Menu update fail");
        }

        close(connection);
    }
}
