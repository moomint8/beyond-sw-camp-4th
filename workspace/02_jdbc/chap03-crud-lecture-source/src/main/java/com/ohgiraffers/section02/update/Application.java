package com.ohgiraffers.section02.update;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("변경할 메뉴 번호를 입력하세요 : ");
        int menuCode = scanner.nextInt();
        scanner.nextLine();
        System.out.print("변경할 메뉴 이름을 입력하세요 : ");
        String menuName = scanner.nextLine();
        System.out.print("변경할 메뉴 가격을 입력하세요 : ");
        int menuPrice = scanner.nextInt();

        Menu modifyMenu = new Menu(menuCode, menuName, menuPrice);
        MenuService menuService = new MenuService();
        menuService.modifyMenu(modifyMenu);
    }
}
