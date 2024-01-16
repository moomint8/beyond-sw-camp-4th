package com.ohgiraffers.toy.domain;

import java.util.ArrayList;
import java.util.Scanner;

public class GameThreeSixNine {
    Scanner sc = new Scanner(System.in);

    public void play() {
        boolean sequence = selectFirstOrSecond();
        startGame(sequence);
    }

    private boolean selectFirstOrSecond() {
        boolean isFrist;

        while (true) {
            try {
                isFrist = selectSequence();
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return isFrist;
    }

    private boolean selectSequence() throws Exception {
        System.out.print("선공/후공 을 선택하세요(선, 후 입력) : ");
        String sequence = sc.nextLine();

        if (sequence.equals("선")) {
            return true;
        }
        if (sequence.equals("후")) {
            return false;
        }
        throw new Exception("잘못된 입력입니다. 다시 입력하세요");
    }

    private void startGame(boolean sequence) {
        int number = 1;
        if (!sequence) {
            System.out.println("computer : " + number);
            number++;
        }
        while (true) {
            if (!getUserInput(number)) {
                System.out.println("틀렸습니다.");
                break;
            }
            number++;
            printComputer(number);
            number++;
        }
    }

    private boolean getUserInput(int number) {
        System.out.print("입력 : ");
        String input = sc.nextLine();
        String answer = getAnswer(number);
        if (input.equals(answer)) {

            return true;
        }
        return false;
    }

    private String getAnswer(int num) {
        String answer = String.valueOf(num);
        long targetNum = countClap(answer);
        if (targetNum == 0) {
            return answer;
        }
        answer = "";
        for (int i = 0; i < targetNum; i++) {
            answer += "짝";
        }

        return answer;
    }

    private long countClap(String str) {
        ArrayList targetNumber = new ArrayList<Character>();
        targetNumber.add('3');
        targetNumber.add('6');
        targetNumber.add('9');
        return str.chars()
                .filter(c -> targetNumber.contains(c))
                .count();
    }

    private void printComputer(int input) {
        System.out.println("computer : " + getAnswer(input));
    }
}
