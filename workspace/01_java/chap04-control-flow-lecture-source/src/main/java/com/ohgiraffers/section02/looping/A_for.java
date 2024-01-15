package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class A_for {

    public void testSimpleForStatement() {
        /*수업목표. for문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다.*/
        for (int i=0; i< 10 ;i++){
            System.out.println("i= "+i);
        }
    }

    public void testForExample1() {
        /*수업목표. 무엇을 반복하는지를 확인하여 반복문으로 개선할 수 있다.*/

        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        int num4 = 4;
        int num5 = 5;
        int sum = 0;

        sum+=2 * num1 + 1;
        sum+=2 * num2 + 1;
        sum+=2 * num3 + 1;
        sum+=2 * num4 + 1;
        sum+=2 * num5 + 1;

        System.out.println("sum = " + sum);

        /*설명. for 문을 통해 개선*/
        int sum2=0;
        for(int i=1; i<= 5; i++){
            sum2 += 2*i + 1;
        }
        System.out.println("sum2 = " + sum2);
    }

    public void testForExample2() {
        /*수업목표. 입력값을 활용하여 반복문을 쓰는 경우 확인 */
        Scanner scanner = new Scanner(System.in);
        System.out.print("insert: ");
        int init = scanner.nextInt();
        System.out.print("상한 정숙밧 입력" );
        int limit = scanner.nextInt();
        /*설명. 입력받은 값을 토대로 반복하며 2부터 2씩 증가하는 값을 반복 횟수만큼 누적시키기*/
        int sum =0 ;
        for(int i=init; i<=limit;i+=2){
            sum+=i;
        }
        System.out.println("sum = " + sum);

    }
}
