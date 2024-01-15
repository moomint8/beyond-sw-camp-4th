package com.ohgiraffers.section01.method;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. 메소드의 호출 흐름에 대해 이해할 수 있다.(메소드 호출 시 내부에서 또 다른 메소드 다시 호출하기) */
        /* 필기.
         *  메소드란?
         *  메소드(method)는 어떤 특정 작업을 수행하기 위한 명령문의 집합이라고 할 수 있다.
        * */

        System.out.println("main() 시작됨...");
        methodA();
        System.out.println("main() 종료됨...");
    }

    public static void methodA() {
        System.out.println("methodA() 호출됨...");
        methodB();
        System.out.println("methodA() 종료됨...");
    }

    public static void methodB() {
        System.out.println("methodB() 호출됨...");
        methodC();
        System.out.println("methodB() 종료됨...");
    }
    
    public static void methodC() {
        System.out.println("methodC() 호출됨...");
        System.out.println("methodC() 종료됨...");
    }
}
