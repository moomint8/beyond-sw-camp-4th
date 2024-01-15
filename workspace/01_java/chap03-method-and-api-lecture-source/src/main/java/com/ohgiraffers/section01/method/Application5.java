package com.ohgiraffers.section01.method;

public class Application5 {
    public static void main(String[] args) {
        
        /* 수업목표. 메소드 리턴에 대해 이해할 수 있다. */
        System.out.println("main() 메소드 시작됨...");

        Application5 app5 = new Application5();
        app5.testMethod();

        System.out.println("main() 메소드 종료됨...");
    }

    private void testMethod() {
        System.out.println("testMethod() 동작 확인...");

        return;

//        System.out.println("안뇽");         // return 이후 코드는 동작하지 않는다.(컴파일 에러)
    }
}
