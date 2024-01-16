package com.ohgiraffers.toy.domain;

import java.util.Scanner;

public class ChooseToy {
    private final String gameList = "1. 369게임";
    private final int numOfGame = 1;    // 게임 갯수

    public void chooseToy() {
        System.out.println(gameList);

        int chooseNum = getChooseNum();

        playGame(chooseNum);
    }

    private int getChooseNum() {
        Scanner sc = new Scanner(System.in);
        String input;

        while (true) {
            try {
                System.out.print("실행할 게임 선택 : ");
                input = sc.nextLine();
                validateType(input);
                validateRange(Integer.parseInt(input));
                break;
            } catch (Exception e) {
                System.out.print("잘못된 입력입니다. ");
                System.out.println(e.getMessage());
            }
        }

        return Integer.parseInt(input);
    }

    private void playGame(int chooseNum) {
        if (chooseNum == 1) {
            GameThreeSixNine game = new GameThreeSixNine();
            game.play();
            return;
        }
    }

    private void validateType(String input) throws Exception {
        try {
            Integer.parseInt(input);
        } catch (Exception e) {
            throw new Exception("숫자를 입력하세요.");
        }
    }

    private void validateRange(int input) throws Exception {
        if (input > numOfGame || input < 1) {
            throw new Exception("해당 번호의 게임이 없습니다.");
        }
    }
}
