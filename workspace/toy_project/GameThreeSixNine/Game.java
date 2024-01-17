package com.ohgiraffers.toy;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {
    private boolean sequence;   // 선공 여부
    private int number = 1;     // 현재 진행되어야 할 숫자

    public boolean selectFirstOrSecond() {
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

    private void validateValue(String input) throws Exception {
        if (input.charAt(0) != '선' && input.charAt(0) != '후') {
            throw new Exception("잘못된 입력입니다. 선 또는 후 만 입력해주세요.");
        }
    }

    private void validateLength(String input) throws Exception {
        if (input.length() != 1) {
            throw new Exception("잘못된 입력입니다.");
        }
    }

    public void start() {
        System.out.println("369게임을 시작합니다!");
        if (!sequence) {
            System.out.println("computer : " + number);
            number++;
        }

        while (true) {
            int input = getPlayerNumber();
        }
    }

    private int getPlayerNumber() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("입력 : ");
            try {
                return validateIsNumber(sc.nextLine());
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private int validateIsNumber(String input) {
        try {
            return Integer.parseInt(input);
        } catch (Exception e) {
            throw new InputMismatchException("숫자만 입력 가능합니다. 다시 입력하세요.");
        }
    }
}
