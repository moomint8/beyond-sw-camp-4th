package com.ohgiraffers.toy;

import com.ohgiraffers.toy.domain.ChooseToy;

public class Application {
    public static void main(String[] args) {

        /* 필기.
         *  프로그램 개요
         *   컴퓨터와 369 게임을 할 수 있는 프로그램
         *
         * 필기.
         *  시스템 요구사항
         *   1. 플레이어는 선공과 후공을 선택할 수 있다.
         *   2. 플레이어와 컴퓨터는 번갈아가며 369게임을 진행한다.
         *   3. 369게임은 번갈아가며 숫자를 외친다.
         *   4. 숫자에 3,6,9가 포함된다면 포함되는 갯수만큼 "짝" 을 외친다.
         *   5. 오답을 말하면 패배한다.
         *   6. 컴퓨터는 난이도에 따라 일정 확률로 잘못된 답을 외친다.
         *   7. 999를 말하면 프로그램이 종료된다.
         */

        ChooseToy toy = new ChooseToy();
        toy.chooseToy();
    }
}
