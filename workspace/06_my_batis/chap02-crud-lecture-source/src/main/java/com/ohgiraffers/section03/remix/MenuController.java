package com.ohgiraffers.section03.remix;

import java.util.List;
import java.util.Map;

public class MenuController {
    private final MenuService menuService;
    private final PrintResult printResult;

    public MenuController() {
        menuService = new MenuService();
        printResult = new PrintResult();
    }

    public void findAllMenus() {
        List<MenuDTO> menus = menuService.findAllMenus();

        if (!menus.isEmpty()) {
            printResult.printMenus(menus);
            return;
        }
        printResult.printErrorMessage("전체 메뉴 조회 실패!");
    }

    public void findMenuByMenuCode(Map<String, String> parameter) {
        int menuCode = Integer.parseInt(parameter.get("menuCode"));

        MenuDTO menu = menuService.findMenuByMenuCode(menuCode);

        if (menu != null) {
            printResult.printMenu(menu);
            return;
        }
        printResult.printErrorMessage("메뉴 정보 조회 실패!");
    }

    public void registMenu(Map<String, String> parameter) {
        MenuDTO menu = new MenuDTO();

        menu.setMenuName(parameter.get("menuName"));
        menu.setMenuPrice(Integer.parseInt(parameter.get("menuPrice")));
        menu.setCategoryCode(Integer.parseInt(parameter.get("categoryCode")));

        if (menuService.registMenu(menu)) {
            printResult.printSuccessMessage("regist");
            return;
        }
        printResult.printErrorMessage("메뉴 추가 실패");
    }

    public void modifyMenu(Map<String, String> parameter) {
        MenuDTO menu = new MenuDTO();

        menu.setMenuCode(Integer.parseInt(parameter.get("menuCode")));
        menu.setMenuName(parameter.get("menuName"));
        menu.setMenuPrice(Integer.parseInt(parameter.get("menuPrice")));

        if (menuService.modifyMenu(menu)) {
            printResult.printSuccessMessage("modify");
            return;
        }
        printResult.printErrorMessage("메뉴 추가 실패");
    }

    public void removeMenu(Map<String, String> parameter) {
        int menuCode = Integer.parseInt(parameter.get("menuCode"));

        if (menuService.removeMenu(menuCode)) {
            printResult.printSuccessMessage("remove");
            return;
        }
        printResult.printErrorMessage("메뉴 삭제 실패");
    }
}
