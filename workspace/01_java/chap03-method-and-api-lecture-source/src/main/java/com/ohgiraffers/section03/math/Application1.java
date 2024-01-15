package com.ohgiraffers.section03.math;

public class Application1 {

    public static void main(String[] args) {

        /* 수업목표. Math 클래스에서 제공하는 static 메소드를 호출할 수 있다. */

        /* 목차. 1. 절대값 출력 */
        System.out.println("-32.1의 절대값: " + Math.abs(-32.1));

        /* 목차. 2. 최대값, 최소값 출력 */
        System.out.println("10과 20 중 더 작은 것은: " + Math.min(10, 20));
        System.out.println("20과 30 중 더 큰 것은: " + Math.max(20, 30));

        /* 목차. 3. 난수 생성 */
        System.out.println("난수 발생: " + Math.random());

    }
}
