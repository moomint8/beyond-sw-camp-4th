package com.ohgiraffers.toy;

public class GameManager {
    public static void play() throws InterruptedException {
        printTitle();       // 타이틀 출력

        Game game = new Game();
        game.start();
    }

    private static void printTitle() {
        System.out.println("369 게임에 오신 것을 환영합니다.");
        System.out.println("규칙.");
        System.out.println("1. 숫자를 1,2,3,... 순서대로 외칩니다.");
        System.out.println("2. 숫자에 3,6,9가 포함된다면 숫자를 외치지 않고 갯수만큼 박수를 짝 칩니다.");
        System.out.println("   예시 > 외칠 숫자 : 33 이면 짝짝 입력");
        System.out.println("자 이제 게임을 시작해봅시다!\n");
    }
}
