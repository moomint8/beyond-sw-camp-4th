package com.ohgiraffers.section02.javaConfig;

import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.section02.javaConfig.Template.getSqlSession;

public class MenuService {

    /* 설명. DAO에 해당하는 클래스 대신 인터페이스가 온다. */
    private MenuMapper menuMapper;

    public List<MenuDTO> findAllMenus() {
        SqlSession sqlSession = getSqlSession();

        /* 설명.
         *  SqlSession을 활용해서 인터페이스의 하위 구현체(DAO에 해당하는 객체)를 만들어 쿼리를 실행
         */
        menuMapper = sqlSession.getMapper(MenuMapper.class);
        List<MenuDTO> menuList = menuMapper.selectAllMenus();

        sqlSession.close();

        return menuList;
    }

    public MenuDTO findMenuByMenuCode(int menuCode) {
        SqlSession sqlSession = getSqlSession();

        menuMapper = sqlSession.getMapper(MenuMapper.class);
        MenuDTO menu = menuMapper.selectMenuByMenuCode(menuCode);

        sqlSession.close();

        return menu;
    }

    public boolean registMenu(MenuDTO menu) {
        SqlSession sqlSession = getSqlSession();

        menuMapper = sqlSession.getMapper(MenuMapper.class);
        int result = menuMapper.insertMenu(menu);

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

        menuMapper = sqlSession.getMapper(MenuMapper.class);
        int result = menuMapper.updateMenu(menu);

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

        menuMapper = sqlSession.getMapper(MenuMapper.class);
        int result = menuMapper.deleteMenu(menuCode);

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
