package com.ohgiraffers.toy;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {
    private boolean sequence;    // 선공 여부
    private int number = 3369;      // 현재 진행되어야 할 숫자
    private String answer;       // 정답

    {
        updateAnswer();
    }

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
            System.out.println("computer : " + answer);
            number++;
        }
        updateAnswer();

        while (true) {
            String input = getPlayerNumber();

            if (!isAnswer(input)) {      // 오답인지 검증
                System.out.println("틀렸습니다! 당신은 패배했습니다!");
                break;
            }
            number++;
            updateAnswer();
            System.out.println("computer : " + answer);
            number++;
            updateAnswer();
        }

        System.out.println("369게임을 종료합니다...");
    }

    private void updateAnswer() {
        String number = Integer.toString(this.number);
        if (number.contains("3") || number.contains("6") || number.contains("9")) {
            numberClap(number);
            return;
        }
        answer = number;
    }

    private void numberClap(String number) {
        answer = "";            // answer 초기화
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == '3' || number.charAt(i) == '6' || number.charAt(i) == '9') {
                answer += "짝";
            }
        }
    }

    private boolean isAnswer(String input) {
        if (input.equals(answer)) {
            return true;
        }
        return false;
    }

    private String getPlayerNumber() {
        Scanner sc = new Scanner(System.in);

        String input;

        while (true) {
            System.out.print("입력 : ");
            try {
                input = sc.nextLine();
                validateIsNumber(input);

                return input;
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private void validateIsNumber(String input) {
        try {
            if (!input.contains("짝")) {
                Integer.parseInt(input);
            }
        } catch (Exception e) {
            throw new InputMismatchException("숫자 또는 박수만 입력 가능합니다. 다시 입력하세요.");
        }
    }
}
