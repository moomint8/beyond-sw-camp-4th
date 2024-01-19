package com.ohgiraffers.section02.abstractclass;

public class Application {
    public static void main(String[] args) {

        /* 수업목표. 추상클래스와 추상메소드에 대해 이해할 수 있다. */
        /* 필기.
         *  추상클래스와 추상메소드
         *   추상메소드를 0개 이상 포함하는 클래스를 추상클래스라고 한다.
         *   쉽게 불완전한 클래스라고 생각할 수 있다.
         *   불완전한 클래스는 생성자를 통해 객체를 생성하지 못한다.
         *   (단, 자식 클래스가 객체가 생성 될 때는 내부적으로 생성될 수 있다.)
         *
         * 필기.
         *  메소드의 헤드부만 있고 바디부가 없는 메소드를 추상메소드라고 한다.
         *  쉽게 말해 불완전한 메소드라고 생각할 수 있다.
         *  불완전한 메소드를 하나라도 가진 클래스는 반드시 추상 클래스가 되어야 한다.
         *  ex) public abstract void method();
         */

        /* 설명. abstract 클래스는 객체를 생성할 수 없는 불완전한 클래스이다. */
//        Product product = new Product();

        /* 설명. abstract 메소드를 구현한 온전한 자식 클래스는 인스턴스(객체)를 생성할 수 있다. */
        SmartPhone smartPhone = new SmartPhone();

        Product product = new SmartPhone();     // 다형성 적용
        product.abstractMethod();               // 동적 바인딩에 의한 자식 클래스의 오버라이딩 메소드 실행
    }
}
