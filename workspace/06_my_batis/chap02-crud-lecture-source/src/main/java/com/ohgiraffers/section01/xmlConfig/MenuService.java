package com.ohgiraffers.section01.xmlConfig;

import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.section01.xmlConfig.Template.getSqlSession;

public class MenuService {

    private final MenuDAO menuDAO;



    public MenuService() {
        menuDAO = new MenuDAO();
    }

    public List<MenuDTO> findAllMenus() {
        SqlSession sqlSession = getSqlSession();

        List<MenuDTO> menuList = menuDAO.selectAllMenus(sqlSession);

        sqlSession.close();

        return menuList;
    }

    public MenuDTO findMenuByMenuCode(int menuCode) {
        SqlSession sqlSession = getSqlSession();

        MenuDTO menu = menuDAO.selectMenuByMenuCode(sqlSession, menuCode);

        sqlSession.close();

        return menu;
    }

    public boolean registMenu(MenuDTO menu) {
        SqlSession sqlSession = getSqlSession();

        int result = menuDAO.insertMenu(sqlSession, menu);

        if (result > 0) {
            sqlSession.commit();
            sqlSession.close();

            return true;
        }
        sqlSession.rollback();
        sqlSession.close();

        return false;
    }

    public boolean modifyMenu(MenuDTO menu) {
        SqlSession sqlSession = getSqlSession();

        int result = menuDAO.updateMenu(sqlSession, menu);

        if (result > 0) {
            sqlSession.commit();
            sqlSession.close();

            return true;
        }
        sqlSession.rollback();
        sqlSession.close();

        return false;
    }

    public boolean removeMenu(int menuCode) {
        SqlSession sqlSession = getSqlSession();

        int result = menuDAO.deleteMenu(sqlSession, menuCode);

        if (result > 0) {
            sqlSession.commit();
            sqlSession.close();

            return true;
        }
        sqlSession.rollback();
        sqlSession.close();

        return false;
    }
}
