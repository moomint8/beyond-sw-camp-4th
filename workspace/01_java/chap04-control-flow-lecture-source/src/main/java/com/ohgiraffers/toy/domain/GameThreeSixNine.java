package com.ohgiraffers.toy.domain;

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
            System.out.println("computer : " + number);
            number++;
        }
    }

    private boolean getUserInput(int number) {
        System.out.print("입력 : ");
        String input = sc.nextLine();
        if (Integer.parseInt(input) == number) {
            return true;
        }
        return false;
    }
}
