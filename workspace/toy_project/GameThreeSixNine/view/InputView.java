package com.ohgiraffers.toy.view;

import java.util.Scanner;

public class InputView {
    private Scanner sc = new Scanner(System.in);

    public int readInteger() {
        System.out.print("숫자 입력 : ");
        int input = sc.nextInt();

        return input;
    }

    public char readCharacter() {
        System.out.print("문자 입력 : ");
        char input = sc.next().charAt(0);

        return input;
    }

    public String readString() {
        System.out.print("문자열 입력 : ");
        String input = sc.nextLine();

        return input;
    }
}
