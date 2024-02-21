package com.ohgiraffers.section01.xmlConfig;

import java.util.List;
import java.util.Map;

public class MenuController {

    private final MenuService menuService;
    private final PrintResult printResult;      // 임시 결과 페이지(View 개념의) 클래스

    public MenuController() {
        menuService = new MenuService();
        printResult = new PrintResult();
    }

    public void findAllMenus() {

        List<MenuDTO> menuList = menuService.findAllMenus();

        if (!menuList.isEmpty()) {
            printResult.printMenus(menuList);

            return;
        }
        printResult.printErrorMessage("조회할 메뉴가 없습니다.");
    }

    public void findMenuByMenuCode(Map<String, String> parameter) {

        int menuCode = Integer.parseInt(parameter.get("menuCode"));

        MenuDTO menu = menuService.findMenuByMenuCode(menuCode);

        if (menu != null) {
            printResult.printMenu(menu);
            return;
        }
        printResult.printErrorMessage(menuCode + "번의 메뉴는 존재하지 않습니다.");
    }

    public void registMenu(Map<String, String> parameter) {
        String menuName = parameter.get("menuName");
        int menuPrice = Integer.parseInt(parameter.get("menuPrice"));
        int categoryCode = Integer.parseInt(parameter.get("categoryCode"));

        MenuDTO menu = new MenuDTO();
        menu.setMenuName(menuName);
        menu.setMenuPrice(menuPrice);
        menu.setCategoryCode(categoryCode);

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
        printResult.printErrorMessage("메뉴 수정 실패");
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
