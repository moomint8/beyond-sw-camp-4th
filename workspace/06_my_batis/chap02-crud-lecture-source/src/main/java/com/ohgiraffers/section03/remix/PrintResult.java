package com.ohgiraffers.section03.remix;

import com.ohgiraffers.section03.remix.MenuDTO;

import java.util.List;

public class PrintResult {
    public void printMenus(List<MenuDTO> menuList) {

        for (MenuDTO menu : menuList) {
            System.out.println("------------------------------------------");
            System.out.println("메뉴 번호: " + menu.getMenuCode());
            System.out.println("메뉴 이름: " + menu.getMenuName());
            System.out.println("메뉴 가격: " + menu.getMenuPrice() + "원");
            System.out.println("메뉴 카테고리: " + menu.getCategoryCode());
            System.out.println("메뉴 주문 가능 여부: " + menu.getOrderableStatus());
        }
    }

    public void printErrorMessage(String message) {
        System.out.println("에러 메시지: " + message);
    }

    public void printMenu(MenuDTO menu) {
        System.out.println("------------------------------------------");
        System.out.println("메뉴 코드: " + menu.getMenuCode());
        System.out.println("메뉴 이름: " + menu.getMenuName());
        System.out.println("메뉴 가격: " + menu.getMenuPrice() + "원");
        System.out.println("메뉴 카테고리: " + menu.getCategoryCode());
        System.out.println("메뉴 주문 가능 여부: " + menu.getOrderableStatus());
    }

    public void printSuccessMessage(String statusCode) {
        String successMessage = "";
        switch (statusCode) {
            case "regist" : successMessage="신규 메뉴 생성 성공"; break;
            case "modify" : successMessage="메뉴 수정 성공"; break;
            case "remove" : successMessage="메뉴 삭제 성공"; break;
        }

        System.out.println("\n---------------- 결과 ----------------\n"+successMessage);
    }
}
