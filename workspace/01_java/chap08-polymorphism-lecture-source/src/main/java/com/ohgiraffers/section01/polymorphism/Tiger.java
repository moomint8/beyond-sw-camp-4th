package com.ohgiraffers.section01.polymorphism;

public class Tiger extends Animal {

    @Override
    public void eat() {
        System.out.println("호랑이가 고기를 와그작와그작 뜯어 먹습니다.");
    }

    @Override
    public void run() {
        System.out.println("나약한 자나 도망가려고 달리는 겁니다. 호랑이는 강하니까 걷습니다.");
    }

    @Override
    public void cry() {
        System.out.println("호랑이가 울부짖습니다. 어흥!");
    }

    /* 설명. 호랑이는 물어뜯기를 추가적으로 할 수 있다. */
    public void bite() {
        System.out.println("호랑이가 물어뜯습니다.");
    }
}
