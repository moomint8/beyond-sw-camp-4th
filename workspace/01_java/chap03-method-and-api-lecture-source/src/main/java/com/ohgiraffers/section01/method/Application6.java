package com.ohgiraffers.section01.method;

public class Application6 {
    public static void main(String[] args) {

        /* 수업목표. 반환값이 있는 메소드 테스트해 보기 */
        System.out.println("main() 메소드 시작됨...");

        Application6 app6 = new Application6();

//        String returnText = app6.testMethod();
//        System.out.println("returnText = " + returnText);

        /* 설명. 변수에 굳이 담을 필요없이 메소드의 반환값을 한번만 사용할 거라면 바로 호출해서 반환값을 활용할 수 있다. */
        System.out.println("returnText = " + app6.testMethod());

        System.out.println("main() 메소드 종료됨...");
    }

    private String testMethod() {
        System.out.println("test() 메소드 실행됨...");
        return "test";
    }
}
