package com.ohgiraffers.section01.xml;

import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Map;

import static com.ohgiraffers.section01.xml.Template.getSqlSession;

public class MenuService {
    public void findMenuByPrice(int maxPrice) {
        SqlSession sqlSession = getSqlSession();
        MenuMapper mapper = sqlSession.getMapper(MenuMapper.class);

        List<MenuDTO> menus = mapper.selectMenuByPrice(maxPrice);
        System.out.print("service: ");
        menus.forEach(System.out::println);

        sqlSession.close();
    }

    public void searchMenu(SearchCriteria searchCriteria) {

        SqlSession sqlSession = getSqlSession();
        MenuMapper mapper = sqlSession.getMapper(MenuMapper.class);

        List<MenuDTO> menus = mapper.searchMenu(searchCriteria);
        menus.forEach(System.out::println);

        sqlSession.close();
    }

    public void searchMenuBySupCategory(SearchCriteria searchCriteria) {

        SqlSession sqlSession = getSqlSession();
        MenuMapper mapper = sqlSession.getMapper(MenuMapper.class);

        List<MenuDTO> menus = mapper.searchMenuBySubCategory(searchCriteria);

        if (menus.size() > 0) {
            menus.forEach(System.out::println);
            sqlSession.close();
            return;
        }
        System.out.println("DB 연동 실패 또는 검색 결과 없음");
        sqlSession.close();
    }

    public void searchMenuByRandomMenuCode(List<Integer> randomList) {

        SqlSession sqlSession = getSqlSession();
        MenuMapper mapper = sqlSession.getMapper(MenuMapper.class);

        List<MenuDTO> menus = mapper.searchMenuByRandomMenuCode(randomList);

        if (menus.size() > 0) {
            // menus 안에 담긴 개수가 0보다 많으면
            menus.forEach(System.out::println);
        } else {
            System.out.println("DB와 연동 실패 또는 검색 결과 없음");
        }

        sqlSession.close();
    }

    public void searchMenuByCodeOrSearchAll(SearchCriteria searchCriteria) {
        SqlSession sqlSession = getSqlSession();
        MenuMapper mapper = sqlSession.getMapper(MenuMapper.class);

        List<MenuDTO> menus = mapper.searchMenuByCodeOrSearchAll(searchCriteria);

        if (menus.size() > 0) {
            // menus 안에 담긴 개수가 0보다 많으면
            menus.forEach(System.out::println);
        } else {
            System.out.println("DB와 연동 실패 또는 검색 결과 없음");
        }

        sqlSession.close();
    }

    public void searchMenuByNameOrCategory(Map<String, Object> criteria) {
        SqlSession sqlSession = getSqlSession();
        MenuMapper mapper = sqlSession.getMapper(MenuMapper.class);

        List<MenuDTO> menus = mapper.searchMenuByNameOrCategory(criteria);

        if (menus.size() > 0) {
            // menus 안에 담긴 개수가 0보다 많으면
            menus.forEach(System.out::println);
        } else {
            System.out.println("DB와 연동 실패 또는 검색 결과 없음");
        }

        sqlSession.close();
    }

    public void modifyMenu(Map<String, Object> criteria) {
        SqlSession sqlSession = getSqlSession();
        MenuMapper mapper = sqlSession.getMapper(MenuMapper.class);

        int result = mapper.updateMenu(criteria);

        if (result > 0) {
            System.out.println("메뉴 정보 변경 성공");
            sqlSession.commit();
            sqlSession.close();
            return;
        }
        System.out.println("메뉴 정보 변경 실패");
        sqlSession.rollback();
        sqlSession.close();
    }
}
