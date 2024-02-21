package com.ohgiraffers.section03.remix;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/* 설명. remix의 핵심은 DAO 계층을 인터페이스로 만들고 추상메소드만 남기는 방식이다. */
/* 설명. 쿼리가 있는 부분은 XML로 작성한다.(mapper용 쿼리) */
public class Application {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        MenuController menuController = new MenuController();

        do {
            System.out.println("\n============ 메뉴 관리 ============");
            System.out.println("1. 메뉴 전체 조회");
            System.out.println("2. 메뉴 코드로 메뉴 조회");
            System.out.println("3. 신규 메뉴 추가");
            System.out.println("4. 메뉴 수정");
            System.out.println("5. 메뉴 삭제");
            System.out.println("9. 프로그램 종료");
            System.out.print("메뉴 관리 번호를 입력하세요: ");
            int no = scanner.nextInt();

            switch (no) {
                case 1:
                    menuController.findAllMenus();
                    break;
                case 2:
                    menuController.findMenuByMenuCode(inputMenuCode("찾을 메뉴 코드: "));
                    break;
                case 3:
                    menuController.registMenu(inputMenu());
                    break;
                case 4:
                    menuController.modifyMenu(inputModifyMenu());
                    break;
                case 5:
                    menuController.removeMenu(inputMenuCode("삭제할 메뉴 코드: "));
                    break;
                case 9:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 입력입니다.");
            }
        } while (true);
    }

    private static Map<String, String> inputModifyMenu() {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> parameter = new HashMap<>();

        System.out.print("변경할 메뉴 번호: ");
        parameter.put("menuCode", scanner.nextLine());
        System.out.print("변경할 메뉴 이름: ");
        parameter.put("menuName", scanner.nextLine());
        System.out.print("변경할 메뉴 가격: ");
        parameter.put("menuPrice", scanner.nextLine());

        return parameter;
    }

    private static Map<String, String> inputMenu() {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> parameter = new HashMap<>();
        System.out.print("신규 메뉴 이름: ");
        parameter.put("menuName", scanner.nextLine());
        System.out.print("신규 메뉴 가격: ");
        parameter.put("menuPrice", scanner.nextLine());
        System.out.print("신규 메뉴 카테고리: ");
        parameter.put("categoryCode", scanner.nextLine());

        return parameter;
    }

    /* 설명. 사용자의 입력 값을 Map 형태로 반환(WEB에서는 key와 value 형태로 request 객체에 담기는 parameter로 생각 */
    private static Map<String, String> inputMenuCode(String message) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(message);
        String menuCode = scanner.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("menuCode", menuCode);

        return parameter;
    }
}
