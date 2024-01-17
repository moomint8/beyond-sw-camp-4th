package com.ohgiraffers.toy;

import java.util.Scanner;

public class Game {
    private static boolean sequence;

    public static boolean selectFirstOrSecond() {
        Scanner sc = new Scanner(System.in);

        String input;

        System.out.println("선공/후공 을 선택해주세요!");

        while (true) {
            try {
                System.out.print("입력(선/후) : ");
                input = sc.nextLine();
                validateLength(input);
                validateValue(input);

                if (input.charAt(0) == '선') {
                    sequence = true;
                    break;
                }
                sequence = false;

                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("다시 입력하세요.");
            }
        }
        System.out.println("당신은 " + input + "공입니다!");

        return sequence;
    }

    private static void validateValue(String input) throws Exception {
        if (input.charAt(0) != '선' && input.charAt(0) != '후') {
            throw new Exception("잘못된 입력입니다. 선 또는 후 만 입력해주세요.");
        }
    }

    private static void validateLength(String input) throws Exception {
        if (input.length() != 1) {
            throw new Exception("잘못된 입력입니다.");
        }
    }
}
