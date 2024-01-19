package com.ohgiraffers.toy;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Game {
    private boolean sequence;           // 선공 여부(true : 선공, false : 후공)
    private int number = 1;             // 현재 진행되어야 할 숫자
    private StringBuilder answer = new StringBuilder(Integer.toString(number));   // 정답(369 포함 경우 갯수만큼 짝, 아닌 경우 숫자 형변환해서 저장)
    private int level;                  // 난이도

    // 난이도별 컴퓨터가 틀릴 확률(%)
    private final int easyProbability = 50;
    private final int normalProbability = 30;
    private final int hardProbability = 10;


    public void start() throws InterruptedException {
        System.out.println("369게임을 시작합니다!");
        chooseLevel();              // 난이도 선택
        selectFirstOrSecond();      // 선공/후공 선택

        // 후공인 경우 computer 가 시작하는 정답 출력
        if (!sequence) {
            System.out.println("computer : " + answer);

            updateNumberAndAnswer();         // number, answer 업데이트
        }

        // 게임에 대한 while문
        // 컴퓨터 혹은 플레이어가 틀리거나 999 입력 받을 때까지 반복
        while (true) {
            String input = getPlayerNumber();

            if (input.equals("999")) {
                break;
            }

            if (!isAnswer(input)) {      // 오답인지 검증
                System.out.println("틀렸습니다! 당신은 패배했습니다!");
                break;
            }

            updateNumberAndAnswer();             // number, answer 업데이트

            if (!printComputerOutput()) {       // computer 답변, 일정 확률로 computer가 패배
                System.out.println("computer가 패배했습니다");
                System.out.println("승리를 축하합니다!");
                break;
            }

            updateNumberAndAnswer();             // number, answer 업데이트
        }

        System.out.println("\n369게임을 종료합니다...");
    }

    // computer의 답변 Print 해주는 메소드
    private boolean printComputerOutput() throws InterruptedException {
        if (computerIsWrong()) {
            System.out.println("computer : " + makeWrongComputerOutput());
            return false;
        }
        System.out.println("computer : " + answer);
        return true;
    }

    // computer가 잘못된 답변을 말할 때 그 답변을 정해주는 메소드
    private String makeWrongComputerOutput() throws InterruptedException {
        if (answer.toString().contains("짝")) {
            return Integer.toString(number);
        }
        Random random = new Random();
        int test = random.nextInt(2);
        if (test == 0) {        // 50% 확률로 컴퓨터가 시간오버 or 잘못된 답변
            System.out.println("computer : ......");
            Thread.sleep(2000);
            return answer.toString() + "!\ncomputer가 너무 늦게 답변했습니다.";
        }
        return "어..어..짜..악?";
    }

    // 선공, 후공 정하는 메소드
    private void selectFirstOrSecond() {
        Scanner sc = new Scanner(System.in);
        String input;
        System.out.println("선공/후공 을 선택해주세요!");

        // 선 or 후 제대로 된 입력 받을 때까지 반복
        while (true) {
            try {
                System.out.print("입력(선/후) : ");
                input = sc.nextLine();

                if (validateSequenceInput(input)) {     // 입력이 선 인 경우
                    sequence = true;
                    break;
                }
                sequence = false;   // 입력이 후 인 경우
                break;
            } catch (Exception e) {     // 입력이 선 or 후 가 아닌 경우 예외처리
                System.out.println(e.getMessage());
                System.out.println("다시 입력하세요.");
            }
        }
        System.out.println("당신은 " + input + "공입니다!");
    }

    // 사용자 선공, 후공 입력값 검증
    private boolean validateSequenceInput(String input) throws Exception {
        if (input.equals("선")) {
            return true;
        }
        if (input.equals("후")) {
            return false;
        }
        throw new Exception("잘못된 입력입니다. 선 또는 후 만 입력해주세요.");
    }

    // 난이도 선택 메소드
    private void chooseLevel() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("난이도를 선택해주세요!(1.초보 2.중수 3.고수)");
            System.out.print("난이도 입력 : ");
            String input = sc.nextLine();
            if (input.equals("1")) {
                level = 1;
                System.out.println("초보 난이도로 진행합니다.");
                break;
            }
            if (input.equals("2")) {
                level = 2;
                System.out.println("중수 난이도로 진행합니다.");
                break;
            }
            if (input.equals("3")) {
                level = 3;
                System.out.println("고수 난이도로 진행합니다.");
                break;
            }

            System.out.println("잘못된 입력입니다. 다시 입력하세요.");
        }
    }

    // 난이도에 따른 컴퓨터가 패배하는 경우 메소드
    private boolean computerIsWrong() {
        Random random = new Random();
        int computerStat = random.nextInt(101); // 0~100 랜덤 값 생성, 난이도 확률보다 낮은 경우 컴퓨터 패배

        switch (level) {
            case 1:
                if (computerStat < easyProbability) {
                    return true;
                }
            case 2:
                if (computerStat < normalProbability) {
                    return true;
                }
            case 3:
                if (computerStat < hardProbability) {
                    return true;
                }
        }

        return false;
    }

    // 현재 진행 숫자에 따른 정답 저장 메소드
    private void updateNumberAndAnswer() {
        this.number++;   // 다음 차례 숫자로 변경
        String number = Integer.toString(this.number);
        if (number.contains("3") || number.contains("6") || number.contains("9")) {
            numberClap(number);                 // 3,6,9가 포함된 경우 갯수에 맞게 짝 을 치는 메소드 호출
            return;
        }
        answer = new StringBuilder(number);     // 3,6,9가 아닌 경우 number값 그대로 저장
    }

    // 3,6,9 갯수만큼 answer 에 짝을 치는 메소드
    private void numberClap(String number) {
        answer = new StringBuilder("");         // answer 초기화
        for (int i = 0; i < number.length(); i++) {     // i번째 자리가 3,6,9면 answer에 짝 추가
            if (number.charAt(i) == '3' || number.charAt(i) == '6' || number.charAt(i) == '9') {
                answer.append("짝");
            }
        }
    }

    // 플레이어 입력이 정답과 일치하는지 판별
    private boolean isAnswer(String input) {
        if (input.equals(new String(answer))) {
            return true;
        }
        return false;
    }

    // 플레이어의 입력값 받는 메소드
    private String getPlayerNumber() {
        Scanner sc = new Scanner(System.in);

        String input;

        // 입력값이 숫자 또는 짝 일 때까지 반복
        while (true) {
            System.out.print("입력 : ");
            try {
                input = sc.nextLine();
                validateIsNumberOrClap(input);

                return input;
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    // 플레이어 입력값 숫자 또는 짝 이 아닌 경우 예외처리 메소드
    private void validateIsNumberOrClap(String input) {
        try {
            if (!input.contains("짝")) {     // 입력값에 짝 이 없으면
                Integer.parseInt(input);     // Integer.parseInt() 로 숫자가 아닌 경우 예외 발생
            }
        } catch (Exception e) {
            throw new InputMismatchException("숫자 또는 짝 만 입력 가능합니다. 다시 입력하세요.");
        }
    }
}
