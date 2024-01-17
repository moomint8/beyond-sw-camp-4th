package com.ohgiraffers.section02.encapsulation.problem2;

public class Application {
    public static void main(String[] args) {

        /* 수업목표. 필드값 수정 시 발생할 수 있는 문제점을 이해할 수 있다. */
//        Monster monster1 = new Monster();
//        monster1.name = "드라큘라";
//        monster1.hp = 200;
//
//        System.out.println("monster1.name = " + monster1.name);
//        System.out.println("monster1.hp = " + monster1.hp);

        Monster monster2 = new Monster();
        monster2.setInfor1("프랑켄슈타인");
        monster2.setInfor2(200);
    }
}
