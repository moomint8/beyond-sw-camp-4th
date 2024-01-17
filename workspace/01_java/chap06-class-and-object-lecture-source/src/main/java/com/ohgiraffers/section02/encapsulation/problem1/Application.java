package com.ohgiraffers.section02.encapsulation.problem1;

public class Application {
    /* 필기.
     *  객체치향프로그래밍(OOP)이란?
     *   OOP(Object Oriented Programming)
     *   추상화, 캡슐화, 상속, 다형성을 적용하여 유지보수성을 고려한 응집력 높고 결합도 낮은
     *   객체 위주의 개발 방식을 적용한 프로그래밍을 말한다.
     *
     * 필기.
     *  객체지향의 특징(4대 특징)
     *  - 추상화(Abstraction)(추상화를 제외하면 3대 특징)
     *  - 캡슐화(Encapsulation) : 정보은닉(필드 및 메소드/타입 /구현)
     *  - 상속(Inheritance)
     *  - 다형성(Polymorphism)
     */
    public static void main(String[] args) {

        /* 수업목표. 필드에 직접 접근하는 경우 발생할 수 있는 문제점을 이해할 수 있다. */
        Monster monster1 = new Monster();

        /* 설명. 1번 몬스터 생성 */
        monster1.name = "두치";           // 참조연산자(.)를 통해 값 대입
        monster1.hp = 200;

        /* 설명. 몬스터 정보 출력 */
        System.out.println("monster1의 이름 : " + monster1.name);
        System.out.println("monster1의 체력 : " + monster1.hp);

        /* 설명. 2번 몬스터 생성(문제점 확인) */
        Monster monster2 = new Monster();
        monster2.name = "뿌꾸";
        monster2.hp = -200;

        System.out.println("\nmonster2의 이름 " + monster2.name);
        System.out.println("monster2의 체력 : " + monster2.hp);

        /* 설명. 3번 몬스터 생성(setter를 통한 접근) */
        Monster monster3 = new Monster();
        monster3.name = "드라큘라";
        monster3.setHp(100);

        System.out.println("\nmonster3의 이름 " + monster3.name);
        System.out.println("monster3의 체력 : " + monster3.hp);

        /* 설명. 3번 몬스터 생성(setter를 통한 접근) */
        Monster monster4 = new Monster();
        monster4.name = "프랑켄슈타인";
        monster4.setHp(-100);

        System.out.println("\nmonster4의 이름 " + monster4.name);
        System.out.println("monster4의 체력 : " + monster4.hp);

    }
}
