package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class B_nestedFor {
    public void printGugudanFromTwoToNine() {
        /*수업목표. 중첩된 for문의 흐름 이해하고 적용할 수 있다.*/
        /* 설명.
            * 2단
                * 2*1=2
                * 2*2=4
                * 2*3=6
                * ...
                * 9*7=63
                * 9*8=72
                * 9*9=81
        * */
        for(int i=2; i<10;i++){
            System.out.println(i+"단 ");
            for(int j=1;j<10;j++){
                System.out.printf("%d*%d=%d\n",i,j,i*j);
            }
            System.out.println();
        }
    }

    public void printUpgradeGugudanFromTwoToNine() {

        /* 수업목표. inner for문을 메소드로 따로 모듈화해보자.(하나의 기능 단위로 보고) */
        for (int dan = 2; dan < 10; dan++) {
            System.out.println(dan + "수 출력");
            printGugudanOf(dan);
        }
    }

    private void printGugudanOf(int dan) {
        for (int su = 1; su < 10; su++) {
            System.out.println(dan + " * " + su + " = " + (dan * su));
        }
    }

    public void printStars() {

        /* 설명.
         *  아래와 같은 별 모양이 나오도록 작성해보자.
         *  정수를 입력하시오 : 5
         *       *
         *      **
         *     ***
         *    ****
         *   *****
         */
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하시오.(별찍기) : ");
        final int number = sc.nextInt();

        for (int i = 0; i < number; i++) {
            printSpace(number, i);
            printStar(i);
            System.out.println();
        }
    }

    private void printStar(int i) {
        for (int j = 0; j < i + 1; j++) {
            System.out.print("*");
        }
    }

    private void printSpace(int number, int i) {
        for (int j = 0; j < number - i - 1; j++) {
            System.out.print(" ");
        }
    }


    public void printDiamond() {
        /* 설명.
         *  아래와 같은 마름모 모양이 나오도록 작성해보자.
         *  정수를 입력하시오 : 3
         *       *
         *      ***
         *     *****
         *      ***
         *       *
         */
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하시오.(마름모) : ");
        final int number = sc.nextInt();

        for (int i = 0; i < number; i++) {
            printSpace(number, i);
            printStar(i);
            printStar(i - 1);
            System.out.println();
        }

        for (int i = number - 2; i >= 0; i--) {
            printSpace(number, i);
            printStar(i);
            printStar(i - 1);
            System.out.println();
        }

    }
}
